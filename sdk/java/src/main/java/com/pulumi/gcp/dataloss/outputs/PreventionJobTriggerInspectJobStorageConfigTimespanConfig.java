// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJobStorageConfigTimespanConfig {
    /**
     * @return When the job is started by a JobTrigger we will automatically figure out a valid startTime to avoid
     * scanning files that have not been modified since the last time the JobTrigger executed. This will
     * be based on the time of the execution of the last run of the JobTrigger.
     * 
     */
    private @Nullable Boolean enableAutoPopulationOfTimespanConfig;
    /**
     * @return Exclude files or rows newer than this value. If set to zero, no upper time limit is applied.
     * 
     */
    private @Nullable String endTime;
    /**
     * @return Exclude files or rows older than this value.
     * 
     */
    private @Nullable String startTime;
    /**
     * @return Information on where to inspect
     * Structure is documented below.
     * 
     */
    private PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField timestampField;

    private PreventionJobTriggerInspectJobStorageConfigTimespanConfig() {}
    /**
     * @return When the job is started by a JobTrigger we will automatically figure out a valid startTime to avoid
     * scanning files that have not been modified since the last time the JobTrigger executed. This will
     * be based on the time of the execution of the last run of the JobTrigger.
     * 
     */
    public Optional<Boolean> enableAutoPopulationOfTimespanConfig() {
        return Optional.ofNullable(this.enableAutoPopulationOfTimespanConfig);
    }
    /**
     * @return Exclude files or rows newer than this value. If set to zero, no upper time limit is applied.
     * 
     */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return Exclude files or rows older than this value.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * @return Information on where to inspect
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField timestampField() {
        return this.timestampField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigTimespanConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableAutoPopulationOfTimespanConfig;
        private @Nullable String endTime;
        private @Nullable String startTime;
        private PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField timestampField;
        public Builder() {}
        public Builder(PreventionJobTriggerInspectJobStorageConfigTimespanConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutoPopulationOfTimespanConfig = defaults.enableAutoPopulationOfTimespanConfig;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.timestampField = defaults.timestampField;
        }

        @CustomType.Setter
        public Builder enableAutoPopulationOfTimespanConfig(@Nullable Boolean enableAutoPopulationOfTimespanConfig) {
            this.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
            return this;
        }
        @CustomType.Setter
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder timestampField(PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField timestampField) {
            this.timestampField = Objects.requireNonNull(timestampField);
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigTimespanConfig build() {
            final var o = new PreventionJobTriggerInspectJobStorageConfigTimespanConfig();
            o.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
            o.endTime = endTime;
            o.startTime = startTime;
            o.timestampField = timestampField;
            return o;
        }
    }
}
