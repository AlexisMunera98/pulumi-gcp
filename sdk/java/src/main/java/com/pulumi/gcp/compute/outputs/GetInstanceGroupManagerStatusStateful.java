// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetInstanceGroupManagerStatusStatefulPerInstanceConfig;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceGroupManagerStatusStateful {
    private Boolean hasStatefulConfig;
    private List<GetInstanceGroupManagerStatusStatefulPerInstanceConfig> perInstanceConfigs;

    private GetInstanceGroupManagerStatusStateful() {}
    public Boolean hasStatefulConfig() {
        return this.hasStatefulConfig;
    }
    public List<GetInstanceGroupManagerStatusStatefulPerInstanceConfig> perInstanceConfigs() {
        return this.perInstanceConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupManagerStatusStateful defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean hasStatefulConfig;
        private List<GetInstanceGroupManagerStatusStatefulPerInstanceConfig> perInstanceConfigs;
        public Builder() {}
        public Builder(GetInstanceGroupManagerStatusStateful defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasStatefulConfig = defaults.hasStatefulConfig;
    	      this.perInstanceConfigs = defaults.perInstanceConfigs;
        }

        @CustomType.Setter
        public Builder hasStatefulConfig(Boolean hasStatefulConfig) {
            this.hasStatefulConfig = Objects.requireNonNull(hasStatefulConfig);
            return this;
        }
        @CustomType.Setter
        public Builder perInstanceConfigs(List<GetInstanceGroupManagerStatusStatefulPerInstanceConfig> perInstanceConfigs) {
            this.perInstanceConfigs = Objects.requireNonNull(perInstanceConfigs);
            return this;
        }
        public Builder perInstanceConfigs(GetInstanceGroupManagerStatusStatefulPerInstanceConfig... perInstanceConfigs) {
            return perInstanceConfigs(List.of(perInstanceConfigs));
        }
        public GetInstanceGroupManagerStatusStateful build() {
            final var o = new GetInstanceGroupManagerStatusStateful();
            o.hasStatefulConfig = hasStatefulConfig;
            o.perInstanceConfigs = perInstanceConfigs;
            return o;
        }
    }
}
