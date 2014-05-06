/* packet-ncp-sss.h
 * Declarations of routines for Novell SecretStore Services
 * Greg Morris <gmorris@novell.com>
 * Copyright (c) Novell, Inc. 2002-2004
 *
 * $Id$
 *
 * Wireshark - Network traffic analyzer
 * By Gerald Combs <gerald@wireshark.org>
 * Copyright 2000 Gerald Combs
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

#ifndef __PACKET_NCP_SSS_H__
#define __PACKET_NCP_SSS_H__

void
dissect_sss_request(tvbuff_t *tvb, packet_info *pinfo, proto_tree *ncp_tree, ncp_req_hash_value *request_value);

void
dissect_sss_reply(tvbuff_t *tvb, packet_info *pinfo, proto_tree *ncp_tree, guint8 subfunc, ncp_req_hash_value	*request_value);

#endif
