// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.MetastoreServiceNetworkConfigConsumer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MetastoreServiceNetworkConfig {
    /**
     * @return The consumer-side network configuration for the Dataproc Metastore instance.
     * Structure is documented below.
     * 
     */
    private List<MetastoreServiceNetworkConfigConsumer> consumers;

    private MetastoreServiceNetworkConfig() {}
    /**
     * @return The consumer-side network configuration for the Dataproc Metastore instance.
     * Structure is documented below.
     * 
     */
    public List<MetastoreServiceNetworkConfigConsumer> consumers() {
        return this.consumers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreServiceNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<MetastoreServiceNetworkConfigConsumer> consumers;
        public Builder() {}
        public Builder(MetastoreServiceNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumers = defaults.consumers;
        }

        @CustomType.Setter
        public Builder consumers(List<MetastoreServiceNetworkConfigConsumer> consumers) {
            this.consumers = Objects.requireNonNull(consumers);
            return this;
        }
        public Builder consumers(MetastoreServiceNetworkConfigConsumer... consumers) {
            return consumers(List.of(consumers));
        }
        public MetastoreServiceNetworkConfig build() {
            final var o = new MetastoreServiceNetworkConfig();
            o.consumers = consumers;
            return o;
        }
    }
}
