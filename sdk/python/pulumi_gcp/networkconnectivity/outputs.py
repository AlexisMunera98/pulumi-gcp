# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'HubRoutingVpc',
    'SpokeLinkedInterconnectAttachments',
    'SpokeLinkedRouterApplianceInstances',
    'SpokeLinkedRouterApplianceInstancesInstance',
    'SpokeLinkedVpnTunnels',
]

@pulumi.output_type
class HubRoutingVpc(dict):
    def __init__(__self__, *,
                 uri: Optional[str] = None):
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter
    def uri(self) -> Optional[str]:
        return pulumi.get(self, "uri")


@pulumi.output_type
class SpokeLinkedInterconnectAttachments(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "siteToSiteDataTransfer":
            suggest = "site_to_site_data_transfer"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SpokeLinkedInterconnectAttachments. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SpokeLinkedInterconnectAttachments.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SpokeLinkedInterconnectAttachments.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 site_to_site_data_transfer: bool,
                 uris: Sequence[str]):
        """
        :param bool site_to_site_data_transfer: A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        :param Sequence[str] uris: The URIs of linked interconnect attachment resources
        """
        pulumi.set(__self__, "site_to_site_data_transfer", site_to_site_data_transfer)
        pulumi.set(__self__, "uris", uris)

    @property
    @pulumi.getter(name="siteToSiteDataTransfer")
    def site_to_site_data_transfer(self) -> bool:
        """
        A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        """
        return pulumi.get(self, "site_to_site_data_transfer")

    @property
    @pulumi.getter
    def uris(self) -> Sequence[str]:
        """
        The URIs of linked interconnect attachment resources
        """
        return pulumi.get(self, "uris")


@pulumi.output_type
class SpokeLinkedRouterApplianceInstances(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "siteToSiteDataTransfer":
            suggest = "site_to_site_data_transfer"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SpokeLinkedRouterApplianceInstances. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SpokeLinkedRouterApplianceInstances.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SpokeLinkedRouterApplianceInstances.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 instances: Sequence['outputs.SpokeLinkedRouterApplianceInstancesInstance'],
                 site_to_site_data_transfer: bool):
        """
        :param Sequence['SpokeLinkedRouterApplianceInstancesInstanceArgs'] instances: The list of router appliance instances
        :param bool site_to_site_data_transfer: A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        """
        pulumi.set(__self__, "instances", instances)
        pulumi.set(__self__, "site_to_site_data_transfer", site_to_site_data_transfer)

    @property
    @pulumi.getter
    def instances(self) -> Sequence['outputs.SpokeLinkedRouterApplianceInstancesInstance']:
        """
        The list of router appliance instances
        """
        return pulumi.get(self, "instances")

    @property
    @pulumi.getter(name="siteToSiteDataTransfer")
    def site_to_site_data_transfer(self) -> bool:
        """
        A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        """
        return pulumi.get(self, "site_to_site_data_transfer")


@pulumi.output_type
class SpokeLinkedRouterApplianceInstancesInstance(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "ipAddress":
            suggest = "ip_address"
        elif key == "virtualMachine":
            suggest = "virtual_machine"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SpokeLinkedRouterApplianceInstancesInstance. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SpokeLinkedRouterApplianceInstancesInstance.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SpokeLinkedRouterApplianceInstancesInstance.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 ip_address: Optional[str] = None,
                 virtual_machine: Optional[str] = None):
        """
        :param str ip_address: The IP address on the VM to use for peering.
        :param str virtual_machine: The URI of the virtual machine resource
        """
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if virtual_machine is not None:
            pulumi.set(__self__, "virtual_machine", virtual_machine)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[str]:
        """
        The IP address on the VM to use for peering.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="virtualMachine")
    def virtual_machine(self) -> Optional[str]:
        """
        The URI of the virtual machine resource
        """
        return pulumi.get(self, "virtual_machine")


@pulumi.output_type
class SpokeLinkedVpnTunnels(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "siteToSiteDataTransfer":
            suggest = "site_to_site_data_transfer"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SpokeLinkedVpnTunnels. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SpokeLinkedVpnTunnels.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SpokeLinkedVpnTunnels.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 site_to_site_data_transfer: bool,
                 uris: Sequence[str]):
        """
        :param bool site_to_site_data_transfer: A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        :param Sequence[str] uris: The URIs of linked VPN tunnel resources.
        """
        pulumi.set(__self__, "site_to_site_data_transfer", site_to_site_data_transfer)
        pulumi.set(__self__, "uris", uris)

    @property
    @pulumi.getter(name="siteToSiteDataTransfer")
    def site_to_site_data_transfer(self) -> bool:
        """
        A value that controls whether site-to-site data transfer is enabled for these resources. Note that data transfer is available only in supported locations.
        """
        return pulumi.get(self, "site_to_site_data_transfer")

    @property
    @pulumi.getter
    def uris(self) -> Sequence[str]:
        """
        The URIs of linked VPN tunnel resources.
        """
        return pulumi.get(self, "uris")


