// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionHealthCheckLogConfig {
    /**
     * @return Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
     */
    private @Nullable Boolean enable;

    private RegionHealthCheckLogConfig() {}
    /**
     * @return Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionHealthCheckLogConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enable;
        public Builder() {}
        public Builder(RegionHealthCheckLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        public RegionHealthCheckLogConfig build() {
            final var o = new RegionHealthCheckLogConfig();
            o.enable = enable;
            return o;
        }
    }
}
