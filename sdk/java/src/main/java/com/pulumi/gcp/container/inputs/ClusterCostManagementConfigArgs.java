// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterCostManagementConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCostManagementConfigArgs Empty = new ClusterCostManagementConfigArgs();

    /**
     * Whether to enable the [cost allocation](https://cloud.google.com/kubernetes-engine/docs/how-to/cost-allocations) feature.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable the [cost allocation](https://cloud.google.com/kubernetes-engine/docs/how-to/cost-allocations) feature.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private ClusterCostManagementConfigArgs() {}

    private ClusterCostManagementConfigArgs(ClusterCostManagementConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCostManagementConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCostManagementConfigArgs $;

        public Builder() {
            $ = new ClusterCostManagementConfigArgs();
        }

        public Builder(ClusterCostManagementConfigArgs defaults) {
            $ = new ClusterCostManagementConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable the [cost allocation](https://cloud.google.com/kubernetes-engine/docs/how-to/cost-allocations) feature.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable the [cost allocation](https://cloud.google.com/kubernetes-engine/docs/how-to/cost-allocations) feature.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterCostManagementConfigArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
