/*
 * Copyright 2016 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, without warranties or
 * conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.vmware.photon.controller.nsxclient.utils;

/**
 * Helper class to generate the names for NSX related objects.
 */
public class NameUtils {

  ///
  /// Fabric Naming Constants
  ///
  public static final String FABRIC_NODE_NAME_PREFIX = "PC-FabricNode-";
  public static final String FABRIC_NODE_DESCRIPTION_PREFIX =
      "Photon Controller Fabric Node of VM  ";
  public static final String TRANSPORT_NODE_NAME_PREFIX = "PC-TransportNode-";
  public static final String TRANSPORT_NODE_DESCRIPTION_PREFIX =
      "Photon Controller Transport Node of VM ";
  public static final String TRANSPORT_ZONE_NAME_PREFIX = "PC-TransportZone-";
  public static final String TRANSPORT_ZONE_DESCRIPTION_PREFIX =
      "Photon Controller Transport Zone in Deployment ";

  ///
  /// Logical Switch and Router Naming Constants
  ///
  public static final String LOGICAL_SWITCH_NAME_PREFIX = "PC-LogicalSwitch-";
  public static final String LOGICAL_SWITCH_DESCRIPTION_PREFIX =
      "Photon Controller Logical Switch in Virtual Network ";
  public static final String LOGICAL_ROUTER_NAME_PREFIX = "PC-LogicalRouter-";
  public static final String LOGICAL_ROUTER_DESCRIPTION_PREFIX =
      "Photon Controller Logical Router in Virtual Network ";

  ///
  /// Logical Port Naming Constants
  ///
  public static final String LOGICAL_SWITCH_UPLINK_PORT_NAME_PREFIX = "PC-LogicalSwitch-Uplink-Port-";
  public static final String LOGICAL_SWITCH_UPLINK_PORT_DESCRIPTION_PREFIX =
      "Photon Controller Logical Switch Up-Link Port in Virtual Network ";
  public static final String LOGICAL_SWITCH_DOWNLINK_PORT_NAME_PREFIX = "PC-LogicalSwitch-Downlink-Port-";
  public static final String LOGICAL_ROUTER_DOWNLINK_PORT_NAME_PREFIX = "PC-LogicalRouter-Downlink-Port-";
  public static final String LOGICAL_ROUTER_DOWNLINK_PORT_DESCRIPTION_PREFIX =
      "Photon Controller Logical Router Down-link Port in Virtual Network ";
  public static final String LOGICAL_ROUTER_UPLINK_PORT_NAME_PREFIX = "PC-LogicalRouter-Uplink-Port-";
  public static final String LOGICAL_ROUTER_UPLINKD_PORT_DESCRIPTION_PREFIX =
      "Photon Controller Logical Router Up-link Port in Virtual Network ";
  public static final String TIER0_ROUTER_DOWNLINK_PORT_NAME_PREFIX = "PC-Tier0Router-Downlink-Port-";
  public static final String TIER0_ROUTER_DOWNLINK_PORT_DESCRIPTION_PREFIX =
      "Photon Controller Tier0 Router Down-link port in Virtual Network ";

  ///
  /// DHCP Service Naming Constants
  ///

  public static final String DHCP_RELAY_PROFILE_NAME_PREFIX = "PC-Dhcp-Relay-Profile-";
  public static final String DHCP_RELAY_PROFILE_DESCRIPTION_PREFIX =
      "Photon Controller DHCP Relay Profile in Deployment ";
  public static final String DHCP_RELAY_SERVICE_NAME_PREFIX = "PC-Dhcp-Relay-Service-";
  public static final String DHCP_RELAY_SERVICE_DESCRIPTION_PREFIX =
      "Photon Controller DHCP Relay Service in Deployment ";

  ///
  /// NAT Naming Constants
  ///
  public static final String DNAT_RULE_NAME_PREFIX = "PC-Dnat-";
  public static final String DNAT_RULE_DESCRIPTION_PREFIX = "Photon Controller DNAT ";

  public static String getFabricNodeName(String id) {
    return FABRIC_NODE_NAME_PREFIX + id;
  }

  public static String getFabricNodeDescription(String id) {
    return FABRIC_NODE_DESCRIPTION_PREFIX + id;
  }

  public static String getTransportNodeName(String id) {
    return TRANSPORT_NODE_NAME_PREFIX + id;
  }

  public static String getTransportNodeDescription(String id) {
    return TRANSPORT_NODE_DESCRIPTION_PREFIX + id;
  }

  public static String getTransportZoneName(String id) {
    return TRANSPORT_ZONE_NAME_PREFIX + id;
  }

  public static String getTransportZoneDescription(String id) {
    return TRANSPORT_ZONE_DESCRIPTION_PREFIX + id;
  }

  public static String getLogicalSwitchName(String id) {
    return LOGICAL_SWITCH_NAME_PREFIX + id;
  }

  public static String getLogicalSwitchDescription(String id) {
    return LOGICAL_SWITCH_DESCRIPTION_PREFIX + id;
  }

  public static String getLogicalRouterName(String id) {
    return LOGICAL_ROUTER_NAME_PREFIX + id;
  }

  public static String getLogicalRouterDescription(String id) {
    return LOGICAL_ROUTER_DESCRIPTION_PREFIX + id;
  }

  public static String getLogicalSwitchUplinkPortName(String id) {
    return LOGICAL_SWITCH_UPLINK_PORT_NAME_PREFIX + id;
  }

  public static String getLogicalSwitchUplinkPortDescription(String id) {
    return LOGICAL_SWITCH_UPLINK_PORT_DESCRIPTION_PREFIX + id;
  }

  public static String getLogicalSwitchDownlinkPortName(String id) {
    return LOGICAL_SWITCH_DOWNLINK_PORT_NAME_PREFIX + id;
  }

  public static String getLogicalRouterDownlinkPortName(String id) {
    return LOGICAL_ROUTER_DOWNLINK_PORT_NAME_PREFIX + id;
  }

  public static String getLogicalRouterDownlinkPortDescription(String id) {
    return LOGICAL_ROUTER_DOWNLINK_PORT_DESCRIPTION_PREFIX + id;
  }

  public static String getLogicalRouterUplinkPortName(String id) {
    return LOGICAL_ROUTER_UPLINK_PORT_NAME_PREFIX + id;
  }

  public static String getLogicalRouterUplinkdPortDescription(String id) {
    return LOGICAL_ROUTER_UPLINKD_PORT_DESCRIPTION_PREFIX + id;
  }

  public static String getTier0RouterDownlinkPortName(String id) {
    return TIER0_ROUTER_DOWNLINK_PORT_NAME_PREFIX + id;
  }

  public static String getTier0RouterDownlinkPortDescription(String id) {
    return TIER0_ROUTER_DOWNLINK_PORT_DESCRIPTION_PREFIX + id;
  }

  public static String getDhcpRelayProfileName(String id) {
    return DHCP_RELAY_PROFILE_NAME_PREFIX + id;
  }

  public static String getDhcpRelayProfileDescription(String id) {
    return DHCP_RELAY_PROFILE_DESCRIPTION_PREFIX + id;
  }

  public static String getDhcpRelayServiceName(String id) {
    return DHCP_RELAY_SERVICE_NAME_PREFIX + id;
  }

  public static String getDhcpRelayServiceDescription(String id) {
    return DHCP_RELAY_SERVICE_DESCRIPTION_PREFIX + id;
  }

  public static String getDnatRuleName(String id) {
    return DNAT_RULE_NAME_PREFIX + id;
  }

  public static String getDnatRuleDescription(String id) {
    return DNAT_RULE_DESCRIPTION_PREFIX + id;
  }
}
