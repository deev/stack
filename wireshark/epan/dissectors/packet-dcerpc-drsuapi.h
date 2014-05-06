/* DO NOT EDIT
 * This dissector is autogenerated
 *   ronnie sahlberg 2005
 */
/* packet-dcerpc-drsuapi.h
 * Routines for DRSUAPI packet disassembly
 *
 * $Id$
 *
 * Wireshark - Network traffic analyzer
 * By Gerald Combs <gerald@wireshark.org>
 * Copyright 1998 Gerald Combs
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

#ifndef __PACKET_DCERPC_DRSUAPI_H
#define __PACKET_DCERPC_DRSUAPI_H



/* INCLUDED FILE : ETH_HDR */
int drsuapi_dissect_SupportedExtensions(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsBindInfo24(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsBindInfo28(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsBindInfoCtr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaSyncRequest1Info(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaSyncOptions(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaSyncRequest1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetNCChangesUsnTriple(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaCoursor(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaCoursor05Ctr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetNCChangesRequest5(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetNCChangesRequest_Ctr14(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetNCChangesRequest_Ctr13(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetNCChangesRequest_Ctr12(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetNCChangesRequest8(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaCoursorEx(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaCoursorEx05Ctr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetNCChangesCtr6(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetNCChangesCtr7(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaUpdateRefsOptions(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaUpdateRefsRequest1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaAddOptions(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaDeleteOptions(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaModifyOptions(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);

#define DRSUAPI_DS_NAME_STATUS_OK		0
#define DRSUAPI_DS_NAME_STATUS_RESOLVE_ERROR		1
#define DRSUAPI_DS_NAME_STATUS_NOT_FOUND		2
#define DRSUAPI_DS_NAME_STATUS_NOT_UNIQUE		3
#define DRSUAPI_DS_NAME_STATUS_NO_MAPPING		4
#define DRSUAPI_DS_NAME_STATUS_DOMAIN_ONLY		5
#define DRSUAPI_DS_NAME_STATUS_NO_SYNTACTICAL_MAPPING		6
#define DRSUAPI_DS_NAME_STATUS_TRUST_REFERRAL		7

extern const value_string drsuapi_DsNameStatus_vals[];
int drsuapi_dissect_DsNameStatus(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);

#define DRSUAPI_DS_NAME_FLAG_NO_FLAGS		0
#define DRSUAPI_DS_NAME_FLAG_SYNTACTICAL_ONLY		1
#define DRSUAPI_DS_NAME_FLAG_EVAL_AT_DC		2
#define DRSUAPI_DS_NAME_FLAG_GCVERIFY		4
#define DRSUAPI_DS_NAME_FLAG_TRUST_REFERRAL		8

extern const value_string drsuapi_DsNameFlags_vals[];
int drsuapi_dissect_DsNameFlags(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);

#define DRSUAPI_DS_NAME_FORMAT_UNKNOWN		0
#define DRSUAPI_DS_NAME_FORMAT_FQDN_1779		1
#define DRSUAPI_DS_NAME_FORMAT_NT4_ACCOUNT		2
#define DRSUAPI_DS_NAME_FORMAT_DISPLAY		3
#define DRSUAPI_DS_NAME_FORMAT_GUID		6
#define DRSUAPI_DS_NAME_FORMAT_CANONICAL		7
#define DRSUAPI_DS_NAME_FORMAT_USER_PRINCIPAL		8
#define DRSUAPI_DS_NAME_FORMAT_CANONICAL_EX		9
#define DRSUAPI_DS_NAME_FORMAT_SERVICE_PRINCIPAL		10
#define DRSUAPI_DS_NAME_FORMAT_SID_OR_SID_HISTORY		11
#define DRSUAPI_DS_NAME_FORMAT_DNS_DOMAIN		12

extern const value_string drsuapi_DsNameFormat_vals[];
int drsuapi_dissect_DsNameFormat(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsNameString(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsNameRequest1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsNameInfo1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsNameCtr1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);

#define DRSUAPI_DS_SPN_OPERATION_ADD		0
#define DRSUAPI_DS_SPN_OPERATION_REPLACE		1
#define DRSUAPI_DS_SPN_OPERATION_DELETE		2

extern const value_string drsuapi_DsSpnOperation_vals[];
int drsuapi_dissect_DsSpnOperation(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsWriteAccountSpnRequest1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsWriteAccountSpnResult1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetDCInfoRequest1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetDCInfo1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetDCInfoCtr1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetDCInfo2(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetDCInfoCtr2(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetDCInfo01(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsGetDCInfoCtr01(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);

#define DRSUAPI_DC_INFO_CTR_1		1
#define DRSUAPI_DC_INFO_CTR_2		2
#define DRSUAPI_DC_INFO_CTR_01		-1

extern const value_string drsuapi_DsGetDCInfoCtrLevels_vals[];
int drsuapi_dissect_DsGetDCInfoCtrLevels(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);

#define DRSUAPI_DS_REPLICA_GET_INFO		1
#define DRSUAPI_DS_REPLICA_GET_INFO2		2

extern const value_string drsuapi_DsReplicaGetInfoLevel_vals[];
int drsuapi_dissect_DsReplicaGetInfoLevel(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);

#define DRSUAPI_DS_REPLICA_INFO_NEIGHBORS		0
#define DRSUAPI_DS_REPLICA_INFO_CURSORS		1
#define DRSUAPI_DS_REPLICA_INFO_OBJ_METADATA		2
#define DRSUAPI_DS_REPLICA_INFO_KCC_DSA_CONNECT_FAILURES		3
#define DRSUAPI_DS_REPLICA_INFO_KCC_DSA_LINK_FAILURES		4
#define DRSUAPI_DS_REPLICA_INFO_PENDING_OPS		5
#define DRSUAPI_DS_REPLICA_INFO_ATTRIBUTE_VALUE_METADATA		6
#define DRSUAPI_DS_REPLICA_INFO_CURSORS2		7
#define DRSUAPI_DS_REPLICA_INFO_CURSORS3		8
#define DRSUAPI_DS_REPLICA_INFO_OBJ_METADATA2		9
#define DRSUAPI_DS_REPLICA_INFO_ATTRIBUTE_VALUE_METADATA2		10
#define DRSUAPI_DS_REPLICA_INFO_NEIGHBORS02		-2
#define DRSUAPI_DS_REPLICA_INFO_CONNECTIONS04		-4
#define DRSUAPI_DS_REPLICA_INFO_CURSURS05		-5
#define DRSUAPI_DS_REPLICA_INFO_06		-6

extern const value_string drsuapi_DsReplicaInfoType_vals[];
int drsuapi_dissect_DsReplicaInfoType(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaGetInfoRequest1(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaGetInfoRequest2(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaNeighbour(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaNeighbourCtr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaCoursorCtr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaObjMetaData(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaObjMetaDataCtr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaKccDsaFailure(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaKccDsaFailuresCtr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);

#define DRSUAPI_DS_REPLICA_OP_TYPE_SYNC		0
#define DRSUAPI_DS_REPLICA_OP_TYPE_ADD		1
#define DRSUAPI_DS_REPLICA_OP_TYPE_DELETE		2
#define DRSUAPI_DS_REPLICA_OP_TYPE_MODIFY		3
#define DRSUAPI_DS_REPLICA_OP_TYPE_UPDATE_REFS		4

extern const value_string drsuapi_DsReplicaOpType_vals[];
int drsuapi_dissect_DsReplicaOpType(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaOp(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaOpCtr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaAttrValMetaData(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaAttrValMetaDataCtr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaCoursor2(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaCoursor2Ctr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaCoursor3(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaCoursor3Ctr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaObjMetaData2(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaObjMetaData2Ctr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaAttrValMetaData2(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaAttrValMetaData2Ctr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaConnection04(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplicaConnection04Ctr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplica06(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
int drsuapi_dissect_DsReplica06Ctr(tvbuff_t *tvb, int offset, packet_info *pinfo, proto_tree *tree, guint8 *drep, int hf_index, guint32 param);
/* END OF INCLUDED FILE : ETH_HDR */



#endif /* packet-dcerpc-drsuapi.h */
