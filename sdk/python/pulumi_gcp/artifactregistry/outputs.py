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
    'RepositoryIamBindingCondition',
    'RepositoryIamMemberCondition',
    'RepositoryMavenConfig',
    'GetRepositoryMavenConfigResult',
]

@pulumi.output_type
class RepositoryIamBindingCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 title: str,
                 description: Optional[str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> str:
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class RepositoryIamMemberCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 title: str,
                 description: Optional[str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> str:
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class RepositoryMavenConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "allowSnapshotOverwrites":
            suggest = "allow_snapshot_overwrites"
        elif key == "versionPolicy":
            suggest = "version_policy"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryMavenConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryMavenConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryMavenConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 allow_snapshot_overwrites: Optional[bool] = None,
                 version_policy: Optional[str] = None):
        """
        :param bool allow_snapshot_overwrites: The repository with this flag will allow publishing the same
               snapshot versions.
        :param str version_policy: Version policy defines the versions that the registry will accept.
               Default value is `VERSION_POLICY_UNSPECIFIED`.
               Possible values are `VERSION_POLICY_UNSPECIFIED`, `RELEASE`, and `SNAPSHOT`.
        """
        if allow_snapshot_overwrites is not None:
            pulumi.set(__self__, "allow_snapshot_overwrites", allow_snapshot_overwrites)
        if version_policy is not None:
            pulumi.set(__self__, "version_policy", version_policy)

    @property
    @pulumi.getter(name="allowSnapshotOverwrites")
    def allow_snapshot_overwrites(self) -> Optional[bool]:
        """
        The repository with this flag will allow publishing the same
        snapshot versions.
        """
        return pulumi.get(self, "allow_snapshot_overwrites")

    @property
    @pulumi.getter(name="versionPolicy")
    def version_policy(self) -> Optional[str]:
        """
        Version policy defines the versions that the registry will accept.
        Default value is `VERSION_POLICY_UNSPECIFIED`.
        Possible values are `VERSION_POLICY_UNSPECIFIED`, `RELEASE`, and `SNAPSHOT`.
        """
        return pulumi.get(self, "version_policy")


@pulumi.output_type
class GetRepositoryMavenConfigResult(dict):
    def __init__(__self__, *,
                 allow_snapshot_overwrites: bool,
                 version_policy: str):
        pulumi.set(__self__, "allow_snapshot_overwrites", allow_snapshot_overwrites)
        pulumi.set(__self__, "version_policy", version_policy)

    @property
    @pulumi.getter(name="allowSnapshotOverwrites")
    def allow_snapshot_overwrites(self) -> bool:
        return pulumi.get(self, "allow_snapshot_overwrites")

    @property
    @pulumi.getter(name="versionPolicy")
    def version_policy(self) -> str:
        return pulumi.get(self, "version_policy")


