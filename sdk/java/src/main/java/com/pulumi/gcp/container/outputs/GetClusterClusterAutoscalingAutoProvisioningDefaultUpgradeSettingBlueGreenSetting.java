// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSettingStandardRolloutPolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSetting {
    private String nodePoolSoakDuration;
    private List<GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSettingStandardRolloutPolicy> standardRolloutPolicies;

    private GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSetting() {}
    public String nodePoolSoakDuration() {
        return this.nodePoolSoakDuration;
    }
    public List<GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSettingStandardRolloutPolicy> standardRolloutPolicies() {
        return this.standardRolloutPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String nodePoolSoakDuration;
        private List<GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSettingStandardRolloutPolicy> standardRolloutPolicies;
        public Builder() {}
        public Builder(GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodePoolSoakDuration = defaults.nodePoolSoakDuration;
    	      this.standardRolloutPolicies = defaults.standardRolloutPolicies;
        }

        @CustomType.Setter
        public Builder nodePoolSoakDuration(String nodePoolSoakDuration) {
            this.nodePoolSoakDuration = Objects.requireNonNull(nodePoolSoakDuration);
            return this;
        }
        @CustomType.Setter
        public Builder standardRolloutPolicies(List<GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSettingStandardRolloutPolicy> standardRolloutPolicies) {
            this.standardRolloutPolicies = Objects.requireNonNull(standardRolloutPolicies);
            return this;
        }
        public Builder standardRolloutPolicies(GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSettingStandardRolloutPolicy... standardRolloutPolicies) {
            return standardRolloutPolicies(List.of(standardRolloutPolicies));
        }
        public GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSetting build() {
            final var o = new GetClusterClusterAutoscalingAutoProvisioningDefaultUpgradeSettingBlueGreenSetting();
            o.nodePoolSoakDuration = nodePoolSoakDuration;
            o.standardRolloutPolicies = standardRolloutPolicies;
            return o;
        }
    }
}
