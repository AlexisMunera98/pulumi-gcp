// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterReleaseChannel {
    /**
     * @return The selected release channel.
     * Accepted values are:
     * * UNSPECIFIED: Not set.
     * * RAPID: Weekly upgrade cadence; Early testers and developers who requires new features.
     * * REGULAR: Multiple per month upgrade cadence; Production users who need features not yet offered in the Stable channel.
     * * STABLE: Every few months upgrade cadence; Production users who need stability above all else, and for whom frequent upgrades are too risky.
     * 
     */
    private String channel;

    private ClusterReleaseChannel() {}
    /**
     * @return The selected release channel.
     * Accepted values are:
     * * UNSPECIFIED: Not set.
     * * RAPID: Weekly upgrade cadence; Early testers and developers who requires new features.
     * * REGULAR: Multiple per month upgrade cadence; Production users who need features not yet offered in the Stable channel.
     * * STABLE: Every few months upgrade cadence; Production users who need stability above all else, and for whom frequent upgrades are too risky.
     * 
     */
    public String channel() {
        return this.channel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterReleaseChannel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String channel;
        public Builder() {}
        public Builder(ClusterReleaseChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
        }

        @CustomType.Setter
        public Builder channel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        public ClusterReleaseChannel build() {
            final var o = new ClusterReleaseChannel();
            o.channel = channel;
            return o;
        }
    }
}
