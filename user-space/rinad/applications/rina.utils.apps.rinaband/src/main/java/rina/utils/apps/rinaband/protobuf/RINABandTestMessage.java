// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protofiles/RINABandTestMessage.proto

package rina.utils.apps.rinaband.protobuf;

public final class RINABandTestMessage {
  private RINABandTestMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class RINAband_test_t extends
      com.google.protobuf.GeneratedMessage {
    // Use RINAband_test_t.newBuilder() to construct.
    private RINAband_test_t() {
      initFields();
    }
    private RINAband_test_t(boolean noInit) {}
    
    private static final RINAband_test_t defaultInstance;
    public static RINAband_test_t getDefaultInstance() {
      return defaultInstance;
    }
    
    public RINAband_test_t getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rina.utils.apps.rinaband.protobuf.RINABandTestMessage.internal_static_rina_messages_RINAband_test_t_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rina.utils.apps.rinaband.protobuf.RINABandTestMessage.internal_static_rina_messages_RINAband_test_t_fieldAccessorTable;
    }
    
    // optional uint32 flows = 1;
    public static final int FLOWS_FIELD_NUMBER = 1;
    private boolean hasFlows;
    private int flows_ = 0;
    public boolean hasFlows() { return hasFlows; }
    public int getFlows() { return flows_; }
    
    // optional bool client = 2;
    public static final int CLIENT_FIELD_NUMBER = 2;
    private boolean hasClient;
    private boolean client_ = false;
    public boolean hasClient() { return hasClient; }
    public boolean getClient() { return client_; }
    
    // optional bool server = 3;
    public static final int SERVER_FIELD_NUMBER = 3;
    private boolean hasServer;
    private boolean server_ = false;
    public boolean hasServer() { return hasServer; }
    public boolean getServer() { return server_; }
    
    // optional uint32 SDUsize = 4;
    public static final int SDUSIZE_FIELD_NUMBER = 4;
    private boolean hasSDUsize;
    private int sDUsize_ = 0;
    public boolean hasSDUsize() { return hasSDUsize; }
    public int getSDUsize() { return sDUsize_; }
    
    // optional uint32 SDUcount = 5;
    public static final int SDUCOUNT_FIELD_NUMBER = 5;
    private boolean hasSDUcount;
    private int sDUcount_ = 0;
    public boolean hasSDUcount() { return hasSDUcount; }
    public int getSDUcount() { return sDUcount_; }
    
    // optional string pattern = 6;
    public static final int PATTERN_FIELD_NUMBER = 6;
    private boolean hasPattern;
    private java.lang.String pattern_ = "";
    public boolean hasPattern() { return hasPattern; }
    public java.lang.String getPattern() { return pattern_; }
    
    // optional string qos = 7;
    public static final int QOS_FIELD_NUMBER = 7;
    private boolean hasQos;
    private java.lang.String qos_ = "";
    public boolean hasQos() { return hasQos; }
    public java.lang.String getQos() { return qos_; }
    
    // optional string AEI = 8;
    public static final int AEI_FIELD_NUMBER = 8;
    private boolean hasAEI;
    private java.lang.String aEI_ = "";
    public boolean hasAEI() { return hasAEI; }
    public java.lang.String getAEI() { return aEI_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasFlows()) {
        output.writeUInt32(1, getFlows());
      }
      if (hasClient()) {
        output.writeBool(2, getClient());
      }
      if (hasServer()) {
        output.writeBool(3, getServer());
      }
      if (hasSDUsize()) {
        output.writeUInt32(4, getSDUsize());
      }
      if (hasSDUcount()) {
        output.writeUInt32(5, getSDUcount());
      }
      if (hasPattern()) {
        output.writeString(6, getPattern());
      }
      if (hasQos()) {
        output.writeString(7, getQos());
      }
      if (hasAEI()) {
        output.writeString(8, getAEI());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasFlows()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, getFlows());
      }
      if (hasClient()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, getClient());
      }
      if (hasServer()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, getServer());
      }
      if (hasSDUsize()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, getSDUsize());
      }
      if (hasSDUcount()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, getSDUcount());
      }
      if (hasPattern()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getPattern());
      }
      if (hasQos()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(7, getQos());
      }
      if (hasAEI()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(8, getAEI());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t result;
      
      // Construct using rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t();
        return builder;
      }
      
      protected rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t.getDescriptor();
      }
      
      public rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t getDefaultInstanceForType() {
        return rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t) {
          return mergeFrom((rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t other) {
        if (other == rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t.getDefaultInstance()) return this;
        if (other.hasFlows()) {
          setFlows(other.getFlows());
        }
        if (other.hasClient()) {
          setClient(other.getClient());
        }
        if (other.hasServer()) {
          setServer(other.getServer());
        }
        if (other.hasSDUsize()) {
          setSDUsize(other.getSDUsize());
        }
        if (other.hasSDUcount()) {
          setSDUcount(other.getSDUcount());
        }
        if (other.hasPattern()) {
          setPattern(other.getPattern());
        }
        if (other.hasQos()) {
          setQos(other.getQos());
        }
        if (other.hasAEI()) {
          setAEI(other.getAEI());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setFlows(input.readUInt32());
              break;
            }
            case 16: {
              setClient(input.readBool());
              break;
            }
            case 24: {
              setServer(input.readBool());
              break;
            }
            case 32: {
              setSDUsize(input.readUInt32());
              break;
            }
            case 40: {
              setSDUcount(input.readUInt32());
              break;
            }
            case 50: {
              setPattern(input.readString());
              break;
            }
            case 58: {
              setQos(input.readString());
              break;
            }
            case 66: {
              setAEI(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional uint32 flows = 1;
      public boolean hasFlows() {
        return result.hasFlows();
      }
      public int getFlows() {
        return result.getFlows();
      }
      public Builder setFlows(int value) {
        result.hasFlows = true;
        result.flows_ = value;
        return this;
      }
      public Builder clearFlows() {
        result.hasFlows = false;
        result.flows_ = 0;
        return this;
      }
      
      // optional bool client = 2;
      public boolean hasClient() {
        return result.hasClient();
      }
      public boolean getClient() {
        return result.getClient();
      }
      public Builder setClient(boolean value) {
        result.hasClient = true;
        result.client_ = value;
        return this;
      }
      public Builder clearClient() {
        result.hasClient = false;
        result.client_ = false;
        return this;
      }
      
      // optional bool server = 3;
      public boolean hasServer() {
        return result.hasServer();
      }
      public boolean getServer() {
        return result.getServer();
      }
      public Builder setServer(boolean value) {
        result.hasServer = true;
        result.server_ = value;
        return this;
      }
      public Builder clearServer() {
        result.hasServer = false;
        result.server_ = false;
        return this;
      }
      
      // optional uint32 SDUsize = 4;
      public boolean hasSDUsize() {
        return result.hasSDUsize();
      }
      public int getSDUsize() {
        return result.getSDUsize();
      }
      public Builder setSDUsize(int value) {
        result.hasSDUsize = true;
        result.sDUsize_ = value;
        return this;
      }
      public Builder clearSDUsize() {
        result.hasSDUsize = false;
        result.sDUsize_ = 0;
        return this;
      }
      
      // optional uint32 SDUcount = 5;
      public boolean hasSDUcount() {
        return result.hasSDUcount();
      }
      public int getSDUcount() {
        return result.getSDUcount();
      }
      public Builder setSDUcount(int value) {
        result.hasSDUcount = true;
        result.sDUcount_ = value;
        return this;
      }
      public Builder clearSDUcount() {
        result.hasSDUcount = false;
        result.sDUcount_ = 0;
        return this;
      }
      
      // optional string pattern = 6;
      public boolean hasPattern() {
        return result.hasPattern();
      }
      public java.lang.String getPattern() {
        return result.getPattern();
      }
      public Builder setPattern(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasPattern = true;
        result.pattern_ = value;
        return this;
      }
      public Builder clearPattern() {
        result.hasPattern = false;
        result.pattern_ = getDefaultInstance().getPattern();
        return this;
      }
      
      // optional string qos = 7;
      public boolean hasQos() {
        return result.hasQos();
      }
      public java.lang.String getQos() {
        return result.getQos();
      }
      public Builder setQos(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasQos = true;
        result.qos_ = value;
        return this;
      }
      public Builder clearQos() {
        result.hasQos = false;
        result.qos_ = getDefaultInstance().getQos();
        return this;
      }
      
      // optional string AEI = 8;
      public boolean hasAEI() {
        return result.hasAEI();
      }
      public java.lang.String getAEI() {
        return result.getAEI();
      }
      public Builder setAEI(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAEI = true;
        result.aEI_ = value;
        return this;
      }
      public Builder clearAEI() {
        result.hasAEI = false;
        result.aEI_ = getDefaultInstance().getAEI();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:rina.messages.RINAband_test_t)
    }
    
    static {
      defaultInstance = new RINAband_test_t(true);
      rina.utils.apps.rinaband.protobuf.RINABandTestMessage.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:rina.messages.RINAband_test_t)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_rina_messages_RINAband_test_t_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_rina_messages_RINAband_test_t_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$protofiles/RINABandTestMessage.proto\022\r" +
      "rina.messages\"\216\001\n\017RINAband_test_t\022\r\n\005flo" +
      "ws\030\001 \001(\r\022\016\n\006client\030\002 \001(\010\022\016\n\006server\030\003 \001(\010" +
      "\022\017\n\007SDUsize\030\004 \001(\r\022\020\n\010SDUcount\030\005 \001(\r\022\017\n\007p" +
      "attern\030\006 \001(\t\022\013\n\003qos\030\007 \001(\t\022\013\n\003AEI\030\010 \001(\tB#" +
      "\n!rina.utils.apps.rinaband.protobuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_rina_messages_RINAband_test_t_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_rina_messages_RINAband_test_t_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_rina_messages_RINAband_test_t_descriptor,
              new java.lang.String[] { "Flows", "Client", "Server", "SDUsize", "SDUcount", "Pattern", "Qos", "AEI", },
              rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t.class,
              rina.utils.apps.rinaband.protobuf.RINABandTestMessage.RINAband_test_t.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
