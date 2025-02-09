// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobLoadTimePartitioningArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobLoadTimePartitioningArgs Empty = new JobLoadTimePartitioningArgs();

    /**
     * Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
     * 
     */
    @Import(name="expirationMs")
    private @Nullable Output<String> expirationMs;

    /**
     * @return Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
     * 
     */
    public Optional<Output<String>> expirationMs() {
        return Optional.ofNullable(this.expirationMs);
    }

    /**
     * If not set, the table is partitioned by pseudo column &#39;_PARTITIONTIME&#39;; if set, the table is partitioned by this field.
     * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * A wrapper is used here because an empty string is an invalid value.
     * 
     */
    @Import(name="field")
    private @Nullable Output<String> field;

    /**
     * @return If not set, the table is partitioned by pseudo column &#39;_PARTITIONTIME&#39;; if set, the table is partitioned by this field.
     * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * A wrapper is used here because an empty string is an invalid value.
     * 
     */
    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    /**
     * The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
     * but in OnePlatform the field will be treated as unset.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
     * but in OnePlatform the field will be treated as unset.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private JobLoadTimePartitioningArgs() {}

    private JobLoadTimePartitioningArgs(JobLoadTimePartitioningArgs $) {
        this.expirationMs = $.expirationMs;
        this.field = $.field;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobLoadTimePartitioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobLoadTimePartitioningArgs $;

        public Builder() {
            $ = new JobLoadTimePartitioningArgs();
        }

        public Builder(JobLoadTimePartitioningArgs defaults) {
            $ = new JobLoadTimePartitioningArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationMs Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
         * 
         * @return builder
         * 
         */
        public Builder expirationMs(@Nullable Output<String> expirationMs) {
            $.expirationMs = expirationMs;
            return this;
        }

        /**
         * @param expirationMs Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
         * 
         * @return builder
         * 
         */
        public Builder expirationMs(String expirationMs) {
            return expirationMs(Output.of(expirationMs));
        }

        /**
         * @param field If not set, the table is partitioned by pseudo column &#39;_PARTITIONTIME&#39;; if set, the table is partitioned by this field.
         * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
         * A wrapper is used here because an empty string is an invalid value.
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field If not set, the table is partitioned by pseudo column &#39;_PARTITIONTIME&#39;; if set, the table is partitioned by this field.
         * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
         * A wrapper is used here because an empty string is an invalid value.
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param type The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
         * but in OnePlatform the field will be treated as unset.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
         * but in OnePlatform the field will be treated as unset.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public JobLoadTimePartitioningArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
