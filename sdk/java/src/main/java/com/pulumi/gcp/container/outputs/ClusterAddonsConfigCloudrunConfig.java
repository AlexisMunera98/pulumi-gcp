// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAddonsConfigCloudrunConfig {
    /**
     * @return The status of the CloudRun addon. It is disabled by default. Set `disabled=false` to enable.
     * 
     */
    private Boolean disabled;
    /**
     * @return The load balancer type of CloudRun ingress service. It is external load balancer by default.
     * Set `load_balancer_type=LOAD_BALANCER_TYPE_INTERNAL` to configure it as internal load balancer.
     * 
     */
    private @Nullable String loadBalancerType;

    private ClusterAddonsConfigCloudrunConfig() {}
    /**
     * @return The status of the CloudRun addon. It is disabled by default. Set `disabled=false` to enable.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The load balancer type of CloudRun ingress service. It is external load balancer by default.
     * Set `load_balancer_type=LOAD_BALANCER_TYPE_INTERNAL` to configure it as internal load balancer.
     * 
     */
    public Optional<String> loadBalancerType() {
        return Optional.ofNullable(this.loadBalancerType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigCloudrunConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disabled;
        private @Nullable String loadBalancerType;
        public Builder() {}
        public Builder(ClusterAddonsConfigCloudrunConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerType(@Nullable String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public ClusterAddonsConfigCloudrunConfig build() {
            final var o = new ClusterAddonsConfigCloudrunConfig();
            o.disabled = disabled;
            o.loadBalancerType = loadBalancerType;
            return o;
        }
    }
}
