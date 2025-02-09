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
    'GameServerClusterConnectionInfoArgs',
    'GameServerClusterConnectionInfoGkeClusterReferenceArgs',
    'GameServerConfigFleetConfigArgs',
    'GameServerConfigScalingConfigArgs',
    'GameServerConfigScalingConfigScheduleArgs',
    'GameServerConfigScalingConfigSelectorArgs',
    'GameServerDeploymentRolloutGameServerConfigOverrideArgs',
    'GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs',
]

@pulumi.input_type
class GameServerClusterConnectionInfoArgs:
    def __init__(__self__, *,
                 gke_cluster_reference: pulumi.Input['GameServerClusterConnectionInfoGkeClusterReferenceArgs'],
                 namespace: pulumi.Input[str]):
        """
        :param pulumi.Input['GameServerClusterConnectionInfoGkeClusterReferenceArgs'] gke_cluster_reference: Reference of the GKE cluster where the game servers are installed.
               Structure is documented below.
        :param pulumi.Input[str] namespace: Namespace designated on the game server cluster where the game server
               instances will be created. The namespace existence will be validated
               during creation.
        """
        pulumi.set(__self__, "gke_cluster_reference", gke_cluster_reference)
        pulumi.set(__self__, "namespace", namespace)

    @property
    @pulumi.getter(name="gkeClusterReference")
    def gke_cluster_reference(self) -> pulumi.Input['GameServerClusterConnectionInfoGkeClusterReferenceArgs']:
        """
        Reference of the GKE cluster where the game servers are installed.
        Structure is documented below.
        """
        return pulumi.get(self, "gke_cluster_reference")

    @gke_cluster_reference.setter
    def gke_cluster_reference(self, value: pulumi.Input['GameServerClusterConnectionInfoGkeClusterReferenceArgs']):
        pulumi.set(self, "gke_cluster_reference", value)

    @property
    @pulumi.getter
    def namespace(self) -> pulumi.Input[str]:
        """
        Namespace designated on the game server cluster where the game server
        instances will be created. The namespace existence will be validated
        during creation.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: pulumi.Input[str]):
        pulumi.set(self, "namespace", value)


@pulumi.input_type
class GameServerClusterConnectionInfoGkeClusterReferenceArgs:
    def __init__(__self__, *,
                 cluster: pulumi.Input[str]):
        """
        :param pulumi.Input[str] cluster: The full or partial name of a GKE cluster, using one of the following
               forms:
               * `projects/{project_id}/locations/{location}/clusters/{cluster_id}`
               * `locations/{location}/clusters/{cluster_id}`
               * `{cluster_id}`
               If project and location are not specified, the project and location of the
               GameServerCluster resource are used to generate the full name of the
               GKE cluster.
        """
        pulumi.set(__self__, "cluster", cluster)

    @property
    @pulumi.getter
    def cluster(self) -> pulumi.Input[str]:
        """
        The full or partial name of a GKE cluster, using one of the following
        forms:
        * `projects/{project_id}/locations/{location}/clusters/{cluster_id}`
        * `locations/{location}/clusters/{cluster_id}`
        * `{cluster_id}`
        If project and location are not specified, the project and location of the
        GameServerCluster resource are used to generate the full name of the
        GKE cluster.
        """
        return pulumi.get(self, "cluster")

    @cluster.setter
    def cluster(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster", value)


@pulumi.input_type
class GameServerConfigFleetConfigArgs:
    def __init__(__self__, *,
                 fleet_spec: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] fleet_spec: The fleet spec, which is sent to Agones to configure fleet.
               The spec can be passed as inline json but it is recommended to use a file reference
               instead. File references can contain the json or yaml format of the fleet spec. Eg:
               * fleet_spec = jsonencode(yamldecode(file("fleet_configs.yaml")))
               * fleet_spec = file("fleet_configs.json")
               The format of the spec can be found :
               `https://agones.dev/site/docs/reference/fleet/`.
        :param pulumi.Input[str] name: The name of the FleetConfig.
        """
        pulumi.set(__self__, "fleet_spec", fleet_spec)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="fleetSpec")
    def fleet_spec(self) -> pulumi.Input[str]:
        """
        The fleet spec, which is sent to Agones to configure fleet.
        The spec can be passed as inline json but it is recommended to use a file reference
        instead. File references can contain the json or yaml format of the fleet spec. Eg:
        * fleet_spec = jsonencode(yamldecode(file("fleet_configs.yaml")))
        * fleet_spec = file("fleet_configs.json")
        The format of the spec can be found :
        `https://agones.dev/site/docs/reference/fleet/`.
        """
        return pulumi.get(self, "fleet_spec")

    @fleet_spec.setter
    def fleet_spec(self, value: pulumi.Input[str]):
        pulumi.set(self, "fleet_spec", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the FleetConfig.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class GameServerConfigScalingConfigArgs:
    def __init__(__self__, *,
                 fleet_autoscaler_spec: pulumi.Input[str],
                 name: pulumi.Input[str],
                 schedules: Optional[pulumi.Input[Sequence[pulumi.Input['GameServerConfigScalingConfigScheduleArgs']]]] = None,
                 selectors: Optional[pulumi.Input[Sequence[pulumi.Input['GameServerConfigScalingConfigSelectorArgs']]]] = None):
        """
        :param pulumi.Input[str] fleet_autoscaler_spec: Fleet autoscaler spec, which is sent to Agones.
               Example spec can be found :
               https://agones.dev/site/docs/reference/fleetautoscaler/
        :param pulumi.Input[str] name: The name of the ScalingConfig
        :param pulumi.Input[Sequence[pulumi.Input['GameServerConfigScalingConfigScheduleArgs']]] schedules: The schedules to which this scaling config applies.
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input['GameServerConfigScalingConfigSelectorArgs']]] selectors: Labels used to identify the clusters to which this scaling config
               applies. A cluster is subject to this scaling config if its labels match
               any of the selector entries.
               Structure is documented below.
        """
        pulumi.set(__self__, "fleet_autoscaler_spec", fleet_autoscaler_spec)
        pulumi.set(__self__, "name", name)
        if schedules is not None:
            pulumi.set(__self__, "schedules", schedules)
        if selectors is not None:
            pulumi.set(__self__, "selectors", selectors)

    @property
    @pulumi.getter(name="fleetAutoscalerSpec")
    def fleet_autoscaler_spec(self) -> pulumi.Input[str]:
        """
        Fleet autoscaler spec, which is sent to Agones.
        Example spec can be found :
        https://agones.dev/site/docs/reference/fleetautoscaler/
        """
        return pulumi.get(self, "fleet_autoscaler_spec")

    @fleet_autoscaler_spec.setter
    def fleet_autoscaler_spec(self, value: pulumi.Input[str]):
        pulumi.set(self, "fleet_autoscaler_spec", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the ScalingConfig
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schedules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GameServerConfigScalingConfigScheduleArgs']]]]:
        """
        The schedules to which this scaling config applies.
        Structure is documented below.
        """
        return pulumi.get(self, "schedules")

    @schedules.setter
    def schedules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GameServerConfigScalingConfigScheduleArgs']]]]):
        pulumi.set(self, "schedules", value)

    @property
    @pulumi.getter
    def selectors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GameServerConfigScalingConfigSelectorArgs']]]]:
        """
        Labels used to identify the clusters to which this scaling config
        applies. A cluster is subject to this scaling config if its labels match
        any of the selector entries.
        Structure is documented below.
        """
        return pulumi.get(self, "selectors")

    @selectors.setter
    def selectors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GameServerConfigScalingConfigSelectorArgs']]]]):
        pulumi.set(self, "selectors", value)


@pulumi.input_type
class GameServerConfigScalingConfigScheduleArgs:
    def __init__(__self__, *,
                 cron_job_duration: Optional[pulumi.Input[str]] = None,
                 cron_spec: Optional[pulumi.Input[str]] = None,
                 end_time: Optional[pulumi.Input[str]] = None,
                 start_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] cron_job_duration: The duration for the cron job event. The duration of the event is effective
               after the cron job's start time.
               A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
        :param pulumi.Input[str] cron_spec: The cron definition of the scheduled event. See
               https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
               defined by the realm.
        :param pulumi.Input[str] end_time: The end time of the event.
               A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[str] start_time: The start time of the event.
               A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
        """
        if cron_job_duration is not None:
            pulumi.set(__self__, "cron_job_duration", cron_job_duration)
        if cron_spec is not None:
            pulumi.set(__self__, "cron_spec", cron_spec)
        if end_time is not None:
            pulumi.set(__self__, "end_time", end_time)
        if start_time is not None:
            pulumi.set(__self__, "start_time", start_time)

    @property
    @pulumi.getter(name="cronJobDuration")
    def cron_job_duration(self) -> Optional[pulumi.Input[str]]:
        """
        The duration for the cron job event. The duration of the event is effective
        after the cron job's start time.
        A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
        """
        return pulumi.get(self, "cron_job_duration")

    @cron_job_duration.setter
    def cron_job_duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cron_job_duration", value)

    @property
    @pulumi.getter(name="cronSpec")
    def cron_spec(self) -> Optional[pulumi.Input[str]]:
        """
        The cron definition of the scheduled event. See
        https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
        defined by the realm.
        """
        return pulumi.get(self, "cron_spec")

    @cron_spec.setter
    def cron_spec(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cron_spec", value)

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> Optional[pulumi.Input[str]]:
        """
        The end time of the event.
        A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "end_time")

    @end_time.setter
    def end_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_time", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[str]]:
        """
        The start time of the event.
        A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_time", value)


@pulumi.input_type
class GameServerConfigScalingConfigSelectorArgs:
    def __init__(__self__, *,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Set of labels to group by.
        """
        if labels is not None:
            pulumi.set(__self__, "labels", labels)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Set of labels to group by.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)


@pulumi.input_type
class GameServerDeploymentRolloutGameServerConfigOverrideArgs:
    def __init__(__self__, *,
                 config_version: Optional[pulumi.Input[str]] = None,
                 realms_selector: Optional[pulumi.Input['GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs']] = None):
        """
        :param pulumi.Input[str] config_version: Version of the configuration.
        :param pulumi.Input['GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs'] realms_selector: Selection by realms.
               Structure is documented below.
        """
        if config_version is not None:
            pulumi.set(__self__, "config_version", config_version)
        if realms_selector is not None:
            pulumi.set(__self__, "realms_selector", realms_selector)

    @property
    @pulumi.getter(name="configVersion")
    def config_version(self) -> Optional[pulumi.Input[str]]:
        """
        Version of the configuration.
        """
        return pulumi.get(self, "config_version")

    @config_version.setter
    def config_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_version", value)

    @property
    @pulumi.getter(name="realmsSelector")
    def realms_selector(self) -> Optional[pulumi.Input['GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs']]:
        """
        Selection by realms.
        Structure is documented below.
        """
        return pulumi.get(self, "realms_selector")

    @realms_selector.setter
    def realms_selector(self, value: Optional[pulumi.Input['GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs']]):
        pulumi.set(self, "realms_selector", value)


@pulumi.input_type
class GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs:
    def __init__(__self__, *,
                 realms: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] realms: List of realms to match against.
        """
        if realms is not None:
            pulumi.set(__self__, "realms", realms)

    @property
    @pulumi.getter
    def realms(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of realms to match against.
        """
        return pulumi.get(self, "realms")

    @realms.setter
    def realms(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "realms", value)


