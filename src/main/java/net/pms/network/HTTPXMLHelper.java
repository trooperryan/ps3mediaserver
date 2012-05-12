/*
 * PS3 Media Server, for streaming any medias to your PS3.
 * Copyright (C) 2008  A.Brochard
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; version 2
 * of the License only.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package net.pms.network;

class HTTPXMLHelper {
	private final static String CRLF = "\r\n";
	static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
	static final String SOAP_ENCODING_HEADER = "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">" + CRLF + "<s:Body>";
	static final String SOAP_ENCODING_FOOTER = "</s:Body>" + CRLF + "</s:Envelope>";
	static final String GETSYSTEMUPDATEID_HEADER = "<u:GetSystemUpdateIDResponse xmlns:u=\"urn:schemas-upnp-org:service:ContentDirectory:1\">";
	static final String GETSYSTEMUPDATEID_FOOTER = "</u:GetSystemUpdateIDResponse>";
	static final String BROWSERESPONSE_HEADER = "<u:BrowseResponse xmlns:u=\"urn:schemas-upnp-org:service:ContentDirectory:1\">";
	static final String BROWSERESPONSE_FOOTER = "</u:BrowseResponse>";
	static final String SEARCHRESPONSE_HEADER = "<u:SearchResponse xmlns:u=\"urn:schemas-upnp-org:service:ContentDirectory:1\">";
	static final String SEARCHRESPONSE_FOOTER = "</u:SearchResponse>";
	static final String SORTCAPS_RESPONSE = "<u:GetSortCapabilitiesResponse xmlns:u=\"urn:schemas-upnp-org:service:ContentDirectory:1\"><SortCaps></SortCaps></u:GetSortCapabilitiesResponse>";
	static final String SEARCHCAPS_RESPONSE = "<u:GetSearchCapabilitiesResponse xmlns:u=\"urn:schemas-upnp-org:service:ContentDirectory:1\"><SearchCaps></SearchCaps></u:GetSearchCapabilitiesResponse>";
	static final String PROTOCOLINFO_RESPONSE = "<u:GetProtocolInfoResponse xmlns:u=\"urn:schemas-upnp-org:service:ConnectionManager:1\"><Source>http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_SM,http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_MED,http-get:*:image/jpeg:DLNA.ORG_PN=JPEG_LRG,http-get:*:audio/mpeg:DLNA.ORG_PN=MP3,http-get:*:audio/L16:DLNA.ORG_PN=LPCM,http-get:*:video/mpeg:DLNA.ORG_PN=AVC_TS_HD_24_AC3_ISO;SONY.COM_PN=AVC_TS_HD_24_AC3_ISO,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_HD_24_AC3;SONY.COM_PN=AVC_TS_HD_24_AC3,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_HD_24_AC3_T;SONY.COM_PN=AVC_TS_HD_24_AC3_T,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_PS_PAL,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_PS_NTSC,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_50_L2_T,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_60_L2_T,http-get:*:video/mpeg:DLNA.ORG_PN=MPEG_TS_SD_EU_ISO,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_EU,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_EU_T,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_50_AC3_T,http-get:*:video/mpeg:DLNA.ORG_PN=MPEG_TS_HD_50_L2_ISO;SONY.COM_PN=HD2_50_ISO,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_SD_60_AC3_T,http-get:*:video/mpeg:DLNA.ORG_PN=MPEG_TS_HD_60_L2_ISO;SONY.COM_PN=HD2_60_ISO,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_HD_50_L2_T;SONY.COM_PN=HD2_50_T,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=MPEG_TS_HD_60_L2_T;SONY.COM_PN=HD2_60_T,http-get:*:video/mpeg:DLNA.ORG_PN=AVC_TS_HD_50_AC3_ISO;SONY.COM_PN=AVC_TS_HD_50_AC3_ISO,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_HD_50_AC3;SONY.COM_PN=AVC_TS_HD_50_AC3,http-get:*:video/mpeg:DLNA.ORG_PN=AVC_TS_HD_60_AC3_ISO;SONY.COM_PN=AVC_TS_HD_60_AC3_ISO,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_HD_60_AC3;SONY.COM_PN=AVC_TS_HD_60_AC3,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_HD_50_AC3_T;SONY.COM_PN=AVC_TS_HD_50_AC3_T,http-get:*:video/vnd.dlna.mpeg-tts:DLNA.ORG_PN=AVC_TS_HD_60_AC3_T;SONY.COM_PN=AVC_TS_HD_60_AC3_T,http-get:*:video/x-mp2t-mphl-188:*,http-get:*:*:*,http-get:*:video/*:*,http-get:*:audio/*:*,http-get:*:image/*:*</Source><Sink></Sink></u:GetProtocolInfoResponse>";
	static final String RESULT_HEADER = "<Result>";
	static final String RESULT_FOOTER = "</Result>";
	static final String DIDL_HEADER = "&lt;DIDL-Lite xmlns=\"urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:upnp=\"urn:schemas-upnp-org:metadata-1-0/upnp/\"&gt;";
	static final String DIDL_FOOTER = "&lt;/DIDL-Lite&gt;";
	static final String XBOX_1 = "<u:IsValidatedResponse xmlns:u=\"urn:microsoft.com:service:X_MS_MediaReceiverRegistrar:1\">" + CRLF + "<Result>1</Result>" + CRLF + "</u:IsValidatedResponse>";
	static final String XBOX_2 = "<u:IsAuthorizedResponse xmlns:u=\"urn:microsoft.com:service:X_MS_MediaReceiverRegistrar:1\">" + CRLF + "<Result>1</Result>" + CRLF + "</u:IsAuthorizedResponse>";
	static final String UPNP_INVALID_ACTION = "<s:Fault><faultCode>s:Client</faultCode><faultString>UPnPError</faultString><detail><UPnPError xmlns=\"urn:schemas-upnp-org:control-1-0\"><errorCode>401</errorCode><errorDescription>Invalid Action</errorDescription></UPnPError></detail></s:Fault>";
	static final String SAMSUNG_FEATURE_LIST = "<u:X_GetFeatureListResponse xmlns:u=\"urn:schemas-upnp-org:service:ContentDirectory\">" + CRLF + "<FeatureList><?xml version=\"1.0\" encoding=\"UTF-8\"?><Features xmlns=\"urn:schemas-upnp-org:av:avs\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:schemas-upnp-org:av:avs http://www.upnp.org/schemas/av/avs.xsd\"><Feature name=\"samsung.com_BASICVIEW\" version=\"2\"><container id=\"1\" type=\"object.item.imageItem\"/><container id=\"1\" type=\"object.item.audioItem\"/><container id=\"1\" type=\"object.item.videoItem\"/><container id=\"1\" type=\"object.item.textItem\"/></Feature><Feature name=\"samsung.com_DCMVIEW\" version=\"1\"><container id=\"I_M\" type=\"IMAGE_Monthly\"/><container id=\"I_C\" type=\"IMAGE_Color\"/><container id=\"I_T\" type=\"IMAGE_Timeline\"/><container id=\"I_P\" type=\"IMAGE_Composition\"/><container id=\"I_F\" type=\"IMAGE_Folder\"/><container id=\"I_N\" type=\"IMAGE_Title\"/><container id=\"I_L\" type=\"IMAGE_LatestDate\"/><container id=\"I_E\" type=\"IMAGE_EarliestDate\"/><container id=\"A_G\" type=\"AUDIO_Genre\"/><container id=\"A_A\" type=\"AUDIO_Artist\"/><container id=\"A_F\" type=\"AUDIO_Folder\"/><container id=\"A_M\" type=\"AUDIO_Mood\"/><container id=\"A_T\" type=\"AUDIO_Title\"/><container id=\"A_L\" type=\"AUDIO_Album\"/><container id=\"V_T\" type=\"VIDEO_Title\"/><container id=\"V_D\" type=\"VIDEO_Date\"/><container id=\"V_F\" type=\"VIDEO_Folder\"/><container id=\"V_L\" type=\"VIDEO_LatestDate\"/><container id=\"V_E\" type=\"VIDEO_EarliestDate\"/></Feature></Features></FeatureList>" + "</u:X_GetFeatureListResponse>";
}

