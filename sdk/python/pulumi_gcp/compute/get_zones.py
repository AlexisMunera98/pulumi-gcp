# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetZonesResult',
    'AwaitableGetZonesResult',
    'get_zones',
    'get_zones_output',
]

@pulumi.output_type
class GetZonesResult:
    """
    A collection of values returned by getZones.
    """
    def __init__(__self__, id=None, names=None, project=None, region=None, status=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of zones available in the given region
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter
    def project(self) -> str:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetZonesResult(GetZonesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZonesResult(
            id=self.id,
            names=self.names,
            project=self.project,
            region=self.region,
            status=self.status)


def get_zones(project: Optional[str] = None,
              region: Optional[str] = None,
              status: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZonesResult:
    """
    Provides access to available Google Compute zones in a region for a given project.
    See more about [regions and zones](https://cloud.google.com/compute/docs/regions-zones/regions-zones) in the upstream docs.


    :param str project: Project from which to list available zones. Defaults to project declared in the provider.
    :param str region: Region from which to list available zones. Defaults to region declared in the provider.
    :param str status: Allows to filter list of zones based on their current status. Status can be either `UP` or `DOWN`.
           Defaults to no filtering (all available zones - both `UP` and `DOWN`).
    """
    __args__ = dict()
    __args__['project'] = project
    __args__['region'] = region
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:compute/getZones:getZones', __args__, opts=opts, typ=GetZonesResult).value

    return AwaitableGetZonesResult(
        id=__ret__.id,
        names=__ret__.names,
        project=__ret__.project,
        region=__ret__.region,
        status=__ret__.status)


@_utilities.lift_output_func(get_zones)
def get_zones_output(project: Optional[pulumi.Input[Optional[str]]] = None,
                     region: Optional[pulumi.Input[Optional[str]]] = None,
                     status: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetZonesResult]:
    """
    Provides access to available Google Compute zones in a region for a given project.
    See more about [regions and zones](https://cloud.google.com/compute/docs/regions-zones/regions-zones) in the upstream docs.


    :param str project: Project from which to list available zones. Defaults to project declared in the provider.
    :param str region: Region from which to list available zones. Defaults to region declared in the provider.
    :param str status: Allows to filter list of zones based on their current status. Status can be either `UP` or `DOWN`.
           Defaults to no filtering (all available zones - both `UP` and `DOWN`).
    """
    ...
