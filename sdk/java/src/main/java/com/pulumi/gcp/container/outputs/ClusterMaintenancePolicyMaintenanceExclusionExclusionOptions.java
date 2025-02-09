// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterMaintenancePolicyMaintenanceExclusionExclusionOptions {
    /**
     * @return The scope of automatic upgrades to restrict in the exclusion window. One of: **NO_UPGRADES | NO_MINOR_UPGRADES | NO_MINOR_OR_NODE_UPGRADES**
     * 
     */
    private String scope;

    private ClusterMaintenancePolicyMaintenanceExclusionExclusionOptions() {}
    /**
     * @return The scope of automatic upgrades to restrict in the exclusion window. One of: **NO_UPGRADES | NO_MINOR_UPGRADES | NO_MINOR_OR_NODE_UPGRADES**
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMaintenancePolicyMaintenanceExclusionExclusionOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String scope;
        public Builder() {}
        public Builder(ClusterMaintenancePolicyMaintenanceExclusionExclusionOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
        }

        @CustomType.Setter
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public ClusterMaintenancePolicyMaintenanceExclusionExclusionOptions build() {
            final var o = new ClusterMaintenancePolicyMaintenanceExclusionExclusionOptions();
            o.scope = scope;
            return o;
        }
    }
}
