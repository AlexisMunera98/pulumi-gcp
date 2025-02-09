// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PatchDeploymentRolloutDisruptionBudget {
    /**
     * @return Specifies a fixed value.
     * 
     */
    private @Nullable Integer fixed;
    /**
     * @return Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    private @Nullable Integer percentage;

    private PatchDeploymentRolloutDisruptionBudget() {}
    /**
     * @return Specifies a fixed value.
     * 
     */
    public Optional<Integer> fixed() {
        return Optional.ofNullable(this.fixed);
    }
    /**
     * @return Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    public Optional<Integer> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRolloutDisruptionBudget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer fixed;
        private @Nullable Integer percentage;
        public Builder() {}
        public Builder(PatchDeploymentRolloutDisruptionBudget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder fixed(@Nullable Integer fixed) {
            this.fixed = fixed;
            return this;
        }
        @CustomType.Setter
        public Builder percentage(@Nullable Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public PatchDeploymentRolloutDisruptionBudget build() {
            final var o = new PatchDeploymentRolloutDisruptionBudget();
            o.fixed = fixed;
            o.percentage = percentage;
            return o;
        }
    }
}
