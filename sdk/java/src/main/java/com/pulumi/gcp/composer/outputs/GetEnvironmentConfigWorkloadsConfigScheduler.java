// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigWorkloadsConfigScheduler {
    private Integer count;
    private Double cpu;
    private Double memoryGb;
    private Double storageGb;

    private GetEnvironmentConfigWorkloadsConfigScheduler() {}
    public Integer count() {
        return this.count;
    }
    public Double cpu() {
        return this.cpu;
    }
    public Double memoryGb() {
        return this.memoryGb;
    }
    public Double storageGb() {
        return this.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfigScheduler defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer count;
        private Double cpu;
        private Double memoryGb;
        private Double storageGb;
        public Builder() {}
        public Builder(GetEnvironmentConfigWorkloadsConfigScheduler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        @CustomType.Setter
        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        @CustomType.Setter
        public Builder cpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        @CustomType.Setter
        public Builder memoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }
        @CustomType.Setter
        public Builder storageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }
        public GetEnvironmentConfigWorkloadsConfigScheduler build() {
            final var o = new GetEnvironmentConfigWorkloadsConfigScheduler();
            o.count = count;
            o.cpu = cpu;
            o.memoryGb = memoryGb;
            o.storageGb = storageGb;
            return o;
        }
    }
}
