// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudtasks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class QueueStackdriverLoggingConfig {
    /**
     * @return Specifies the fraction of operations to write to Stackdriver Logging.
     * This field may contain any value between 0.0 and 1.0, inclusive. 0.0 is the
     * default and means that no operations are logged.
     * 
     */
    private Double samplingRatio;

    private QueueStackdriverLoggingConfig() {}
    /**
     * @return Specifies the fraction of operations to write to Stackdriver Logging.
     * This field may contain any value between 0.0 and 1.0, inclusive. 0.0 is the
     * default and means that no operations are logged.
     * 
     */
    public Double samplingRatio() {
        return this.samplingRatio;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueStackdriverLoggingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double samplingRatio;
        public Builder() {}
        public Builder(QueueStackdriverLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.samplingRatio = defaults.samplingRatio;
        }

        @CustomType.Setter
        public Builder samplingRatio(Double samplingRatio) {
            this.samplingRatio = Objects.requireNonNull(samplingRatio);
            return this;
        }
        public QueueStackdriverLoggingConfig build() {
            final var o = new QueueStackdriverLoggingConfig();
            o.samplingRatio = samplingRatio;
            return o;
        }
    }
}
