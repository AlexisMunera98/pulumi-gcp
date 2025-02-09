// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.clouddeploy.outputs.DeliveryPipelineConditionPipelineReadyCondition;
import com.pulumi.gcp.clouddeploy.outputs.DeliveryPipelineConditionTargetsPresentCondition;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryPipelineCondition {
    private @Nullable List<DeliveryPipelineConditionPipelineReadyCondition> pipelineReadyConditions;
    private @Nullable List<DeliveryPipelineConditionTargetsPresentCondition> targetsPresentConditions;

    private DeliveryPipelineCondition() {}
    public List<DeliveryPipelineConditionPipelineReadyCondition> pipelineReadyConditions() {
        return this.pipelineReadyConditions == null ? List.of() : this.pipelineReadyConditions;
    }
    public List<DeliveryPipelineConditionTargetsPresentCondition> targetsPresentConditions() {
        return this.targetsPresentConditions == null ? List.of() : this.targetsPresentConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DeliveryPipelineConditionPipelineReadyCondition> pipelineReadyConditions;
        private @Nullable List<DeliveryPipelineConditionTargetsPresentCondition> targetsPresentConditions;
        public Builder() {}
        public Builder(DeliveryPipelineCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineReadyConditions = defaults.pipelineReadyConditions;
    	      this.targetsPresentConditions = defaults.targetsPresentConditions;
        }

        @CustomType.Setter
        public Builder pipelineReadyConditions(@Nullable List<DeliveryPipelineConditionPipelineReadyCondition> pipelineReadyConditions) {
            this.pipelineReadyConditions = pipelineReadyConditions;
            return this;
        }
        public Builder pipelineReadyConditions(DeliveryPipelineConditionPipelineReadyCondition... pipelineReadyConditions) {
            return pipelineReadyConditions(List.of(pipelineReadyConditions));
        }
        @CustomType.Setter
        public Builder targetsPresentConditions(@Nullable List<DeliveryPipelineConditionTargetsPresentCondition> targetsPresentConditions) {
            this.targetsPresentConditions = targetsPresentConditions;
            return this;
        }
        public Builder targetsPresentConditions(DeliveryPipelineConditionTargetsPresentCondition... targetsPresentConditions) {
            return targetsPresentConditions(List.of(targetsPresentConditions));
        }
        public DeliveryPipelineCondition build() {
            final var o = new DeliveryPipelineCondition();
            o.pipelineReadyConditions = pipelineReadyConditions;
            o.targetsPresentConditions = targetsPresentConditions;
            return o;
        }
    }
}
