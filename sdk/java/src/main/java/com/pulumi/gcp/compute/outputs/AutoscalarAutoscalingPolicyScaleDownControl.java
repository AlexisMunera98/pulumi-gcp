// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscalarAutoscalingPolicyScaleDownControl {
    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    private @Nullable AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas;
    /**
     * @return How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    private @Nullable Integer timeWindowSec;

    private AutoscalarAutoscalingPolicyScaleDownControl() {}
    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Optional<AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas> maxScaledDownReplicas() {
        return Optional.ofNullable(this.maxScaledDownReplicas);
    }
    /**
     * @return How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    public Optional<Integer> timeWindowSec() {
        return Optional.ofNullable(this.timeWindowSec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyScaleDownControl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas;
        private @Nullable Integer timeWindowSec;
        public Builder() {}
        public Builder(AutoscalarAutoscalingPolicyScaleDownControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledDownReplicas = defaults.maxScaledDownReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        @CustomType.Setter
        public Builder maxScaledDownReplicas(@Nullable AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas) {
            this.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder timeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }
        public AutoscalarAutoscalingPolicyScaleDownControl build() {
            final var o = new AutoscalarAutoscalingPolicyScaleDownControl();
            o.maxScaledDownReplicas = maxScaledDownReplicas;
            o.timeWindowSec = timeWindowSec;
            return o;
        }
    }
}
