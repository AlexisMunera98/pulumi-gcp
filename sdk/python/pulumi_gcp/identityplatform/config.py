# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ConfigArgs', 'Config']

@pulumi.input_type
class ConfigArgs:
    def __init__(__self__, *,
                 autodelete_anonymous_users: Optional[pulumi.Input[bool]] = None,
                 project: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Config resource.
        :param pulumi.Input[bool] autodelete_anonymous_users: Whether anonymous users will be auto-deleted after a period of 30 days
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        if autodelete_anonymous_users is not None:
            pulumi.set(__self__, "autodelete_anonymous_users", autodelete_anonymous_users)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter(name="autodeleteAnonymousUsers")
    def autodelete_anonymous_users(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether anonymous users will be auto-deleted after a period of 30 days
        """
        return pulumi.get(self, "autodelete_anonymous_users")

    @autodelete_anonymous_users.setter
    def autodelete_anonymous_users(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autodelete_anonymous_users", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)


@pulumi.input_type
class _ConfigState:
    def __init__(__self__, *,
                 autodelete_anonymous_users: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Config resources.
        :param pulumi.Input[bool] autodelete_anonymous_users: Whether anonymous users will be auto-deleted after a period of 30 days
        :param pulumi.Input[str] name: The name of the Config resource
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        if autodelete_anonymous_users is not None:
            pulumi.set(__self__, "autodelete_anonymous_users", autodelete_anonymous_users)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)

    @property
    @pulumi.getter(name="autodeleteAnonymousUsers")
    def autodelete_anonymous_users(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether anonymous users will be auto-deleted after a period of 30 days
        """
        return pulumi.get(self, "autodelete_anonymous_users")

    @autodelete_anonymous_users.setter
    def autodelete_anonymous_users(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autodelete_anonymous_users", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Config resource
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)


class Config(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autodelete_anonymous_users: Optional[pulumi.Input[bool]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Identity Platform configuration for a Cloud project. Identity Platform is an
        end-to-end authentication system for third-party users to access apps
        and services.

        This entity is created only once during intialization and cannot be deleted,
        individual Identity Providers may be disabled instead.  This resource may only
        be created in billing-enabled projects.

        To get more information about Config, see:

        * [API documentation](https://cloud.google.com/identity-platform/docs/reference/rest/v2/Config)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/identity-platform/docs)

        ## Example Usage

        ## Import

        Config can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:identityplatform/config:Config default projects/{{project}}/config
        ```

        ```sh
         $ pulumi import gcp:identityplatform/config:Config default projects/{{project}}
        ```

        ```sh
         $ pulumi import gcp:identityplatform/config:Config default {{project}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] autodelete_anonymous_users: Whether anonymous users will be auto-deleted after a period of 30 days
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ConfigArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Identity Platform configuration for a Cloud project. Identity Platform is an
        end-to-end authentication system for third-party users to access apps
        and services.

        This entity is created only once during intialization and cannot be deleted,
        individual Identity Providers may be disabled instead.  This resource may only
        be created in billing-enabled projects.

        To get more information about Config, see:

        * [API documentation](https://cloud.google.com/identity-platform/docs/reference/rest/v2/Config)
        * How-to Guides
            * [Official Documentation](https://cloud.google.com/identity-platform/docs)

        ## Example Usage

        ## Import

        Config can be imported using any of these accepted formats

        ```sh
         $ pulumi import gcp:identityplatform/config:Config default projects/{{project}}/config
        ```

        ```sh
         $ pulumi import gcp:identityplatform/config:Config default projects/{{project}}
        ```

        ```sh
         $ pulumi import gcp:identityplatform/config:Config default {{project}}
        ```

        :param str resource_name: The name of the resource.
        :param ConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autodelete_anonymous_users: Optional[pulumi.Input[bool]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConfigArgs.__new__(ConfigArgs)

            __props__.__dict__["autodelete_anonymous_users"] = autodelete_anonymous_users
            __props__.__dict__["project"] = project
            __props__.__dict__["name"] = None
        super(Config, __self__).__init__(
            'gcp:identityplatform/config:Config',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            autodelete_anonymous_users: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project: Optional[pulumi.Input[str]] = None) -> 'Config':
        """
        Get an existing Config resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] autodelete_anonymous_users: Whether anonymous users will be auto-deleted after a period of 30 days
        :param pulumi.Input[str] name: The name of the Config resource
        :param pulumi.Input[str] project: The ID of the project in which the resource belongs.
               If it is not provided, the provider project is used.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConfigState.__new__(_ConfigState)

        __props__.__dict__["autodelete_anonymous_users"] = autodelete_anonymous_users
        __props__.__dict__["name"] = name
        __props__.__dict__["project"] = project
        return Config(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autodeleteAnonymousUsers")
    def autodelete_anonymous_users(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether anonymous users will be auto-deleted after a period of 30 days
        """
        return pulumi.get(self, "autodelete_anonymous_users")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Config resource
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> pulumi.Output[str]:
        """
        The ID of the project in which the resource belongs.
        If it is not provided, the provider project is used.
        """
        return pulumi.get(self, "project")

