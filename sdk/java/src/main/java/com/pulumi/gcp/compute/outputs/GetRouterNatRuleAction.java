// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouterNatRuleAction {
    private List<String> sourceNatActiveIps;
    private List<String> sourceNatDrainIps;

    private GetRouterNatRuleAction() {}
    public List<String> sourceNatActiveIps() {
        return this.sourceNatActiveIps;
    }
    public List<String> sourceNatDrainIps() {
        return this.sourceNatDrainIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterNatRuleAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> sourceNatActiveIps;
        private List<String> sourceNatDrainIps;
        public Builder() {}
        public Builder(GetRouterNatRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceNatActiveIps = defaults.sourceNatActiveIps;
    	      this.sourceNatDrainIps = defaults.sourceNatDrainIps;
        }

        @CustomType.Setter
        public Builder sourceNatActiveIps(List<String> sourceNatActiveIps) {
            this.sourceNatActiveIps = Objects.requireNonNull(sourceNatActiveIps);
            return this;
        }
        public Builder sourceNatActiveIps(String... sourceNatActiveIps) {
            return sourceNatActiveIps(List.of(sourceNatActiveIps));
        }
        @CustomType.Setter
        public Builder sourceNatDrainIps(List<String> sourceNatDrainIps) {
            this.sourceNatDrainIps = Objects.requireNonNull(sourceNatDrainIps);
            return this;
        }
        public Builder sourceNatDrainIps(String... sourceNatDrainIps) {
            return sourceNatDrainIps(List.of(sourceNatDrainIps));
        }
        public GetRouterNatRuleAction build() {
            final var o = new GetRouterNatRuleAction();
            o.sourceNatActiveIps = sourceNatActiveIps;
            o.sourceNatDrainIps = sourceNatDrainIps;
            return o;
        }
    }
}
