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
    'GetTopicResult',
    'AwaitableGetTopicResult',
    'get_topic',
    'get_topic_output',
]

@pulumi.output_type
class GetTopicResult:
    """
    A collection of values returned by getTopic.
    """
    def __init__(__self__, id=None, kms_key_name=None, labels=None, message_retention_duration=None, message_storage_policies=None, name=None, project=None, schema_settings=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kms_key_name and not isinstance(kms_key_name, str):
            raise TypeError("Expected argument 'kms_key_name' to be a str")
        pulumi.set(__self__, "kms_key_name", kms_key_name)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if message_retention_duration and not isinstance(message_retention_duration, str):
            raise TypeError("Expected argument 'message_retention_duration' to be a str")
        pulumi.set(__self__, "message_retention_duration", message_retention_duration)
        if message_storage_policies and not isinstance(message_storage_policies, list):
            raise TypeError("Expected argument 'message_storage_policies' to be a list")
        pulumi.set(__self__, "message_storage_policies", message_storage_policies)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project and not isinstance(project, str):
            raise TypeError("Expected argument 'project' to be a str")
        pulumi.set(__self__, "project", project)
        if schema_settings and not isinstance(schema_settings, list):
            raise TypeError("Expected argument 'schema_settings' to be a list")
        pulumi.set(__self__, "schema_settings", schema_settings)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kmsKeyName")
    def kms_key_name(self) -> str:
        return pulumi.get(self, "kms_key_name")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, str]:
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="messageRetentionDuration")
    def message_retention_duration(self) -> str:
        return pulumi.get(self, "message_retention_duration")

    @property
    @pulumi.getter(name="messageStoragePolicies")
    def message_storage_policies(self) -> Sequence['outputs.GetTopicMessageStoragePolicyResult']:
        return pulumi.get(self, "message_storage_policies")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> Optional[str]:
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="schemaSettings")
    def schema_settings(self) -> Sequence['outputs.GetTopicSchemaSettingResult']:
        return pulumi.get(self, "schema_settings")


class AwaitableGetTopicResult(GetTopicResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTopicResult(
            id=self.id,
            kms_key_name=self.kms_key_name,
            labels=self.labels,
            message_retention_duration=self.message_retention_duration,
            message_storage_policies=self.message_storage_policies,
            name=self.name,
            project=self.project,
            schema_settings=self.schema_settings)


def get_topic(name: Optional[str] = None,
              project: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTopicResult:
    """
    Get information about a Google Cloud Pub/Sub Topic. For more information see
    the [official documentation](https://cloud.google.com/pubsub/docs/)
    and [API](https://cloud.google.com/pubsub/docs/apis).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_pubsub_topic = gcp.pubsub.get_topic(name="my-pubsub-topic")
    ```


    :param str name: The name of the Cloud Pub/Sub Topic.
    :param str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['project'] = project
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:pubsub/getTopic:getTopic', __args__, opts=opts, typ=GetTopicResult).value

    return AwaitableGetTopicResult(
        id=__ret__.id,
        kms_key_name=__ret__.kms_key_name,
        labels=__ret__.labels,
        message_retention_duration=__ret__.message_retention_duration,
        message_storage_policies=__ret__.message_storage_policies,
        name=__ret__.name,
        project=__ret__.project,
        schema_settings=__ret__.schema_settings)


@_utilities.lift_output_func(get_topic)
def get_topic_output(name: Optional[pulumi.Input[str]] = None,
                     project: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTopicResult]:
    """
    Get information about a Google Cloud Pub/Sub Topic. For more information see
    the [official documentation](https://cloud.google.com/pubsub/docs/)
    and [API](https://cloud.google.com/pubsub/docs/apis).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_pubsub_topic = gcp.pubsub.get_topic(name="my-pubsub-topic")
    ```


    :param str name: The name of the Cloud Pub/Sub Topic.
    :param str project: The project in which the resource belongs. If it
           is not provided, the provider project is used.
    """
    ...
