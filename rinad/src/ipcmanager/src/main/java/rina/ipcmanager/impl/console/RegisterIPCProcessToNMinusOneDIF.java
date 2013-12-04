package rina.ipcmanager.impl.console;

import eu.irati.librina.IPCEvent;
import eu.irati.librina.IpcmRegisterApplicationResponseEvent;
import eu.irati.librina.TimerExpiredEvent;
import rina.ipcmanager.impl.IPCManager;

/**
 * The command to register an IPC Process to an N-1 DIF
 * @author eduardgrasa
 *
 */
public class RegisterIPCProcessToNMinusOneDIF extends ConsoleCommand{

	public static final String ID = "regn1dif";
	private static final String USAGE = "regn1dif <ipcp_id> <dif_name>";
	
	private CancelCommandTimerTask cancelCommandTask = null;
	private int ipcProcessId;
	private String difName;
	
	public RegisterIPCProcessToNMinusOneDIF(IPCManager ipcManager, IPCManagerConsole console){
		super(ID, ipcManager, console);
	}
	
	@Override
	public String execute(String[] splittedCommand) {
		if (splittedCommand.length != 3){
			return "Wrong number of parameters. Usage: "+USAGE;
		}
		
		try{
			ipcProcessId = Integer.parseInt(splittedCommand[1]);
		} catch(Exception ex) {
			return "Could not parse ipcProcessId " + splittedCommand[1];
		}
			
		difName = splittedCommand[2];
		getIPCManagerConsole().lock();
		long handle = -1;
		
		try{
			handle = getIPCManager().requestRegistrationToNMinusOneDIF(ipcProcessId, difName);
		}catch(Exception ex){
			getIPCManagerConsole().unlock();
			return "Error executing register IPC Process to N-1 DIF command: " + ex.getMessage();
		}
		
		getIPCManagerConsole().setPendingRequestId(handle);
		cancelCommandTask = new CancelCommandTimerTask(getIPCManagerConsole(), handle);
		getIPCManagerConsole().scheduleTask(cancelCommandTask, 
				CancelCommandTimerTask.INTERVAL_IN_SECONDS*1000);
		getIPCManagerConsole().unlock();
		IPCEvent response = null;
		
		try{
			response = getIPCManagerConsole().getResponse();
		}catch(Exception ex){
			return "Error waiting for register IPC Process to N-1 DIF response: "+ex.getMessage();
		}
		
		if (response == null) {
			return "Got a null response";
		}
		
		if (response instanceof TimerExpiredEvent) {
			return "Error: could not get a reply after " 
					+ CancelCommandTimerTask.INTERVAL_IN_SECONDS + " seconds.";
		}
		
		cancelCommandTask.cancel();
		
		if (!(response instanceof IpcmRegisterApplicationResponseEvent)) {
			return "Got a wrong response to an event";
		}
		
		IpcmRegisterApplicationResponseEvent event = (IpcmRegisterApplicationResponseEvent) response;
		if (event.getResult() == 0) {
			return "Successfully registered IPC Process " + ipcProcessId + " to DIF " + difName;
		} else {
			return "Problems registering IPC Process " + ipcProcessId + " to DIF " + difName +
					". Error code: " + event.getResult();
		}
	}

}
