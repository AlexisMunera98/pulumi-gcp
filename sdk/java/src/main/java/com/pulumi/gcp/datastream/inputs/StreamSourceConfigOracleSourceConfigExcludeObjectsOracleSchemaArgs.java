// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datastream.inputs.StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs Empty = new StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs();

    /**
     * Tables in the database.
     * Structure is documented below.
     * 
     */
    @Import(name="oracleTables")
    private @Nullable Output<List<StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs>> oracleTables;

    /**
     * @return Tables in the database.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs>>> oracleTables() {
        return Optional.ofNullable(this.oracleTables);
    }

    /**
     * Schema name.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return Schema name.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    private StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs() {}

    private StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs(StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs $) {
        this.oracleTables = $.oracleTables;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs $;

        public Builder() {
            $ = new StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs();
        }

        public Builder(StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs defaults) {
            $ = new StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param oracleTables Tables in the database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oracleTables(@Nullable Output<List<StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs>> oracleTables) {
            $.oracleTables = oracleTables;
            return this;
        }

        /**
         * @param oracleTables Tables in the database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oracleTables(List<StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs> oracleTables) {
            return oracleTables(Output.of(oracleTables));
        }

        /**
         * @param oracleTables Tables in the database.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oracleTables(StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaOracleTableArgs... oracleTables) {
            return oracleTables(List.of(oracleTables));
        }

        /**
         * @param schema Schema name.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Schema name.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public StreamSourceConfigOracleSourceConfigExcludeObjectsOracleSchemaArgs build() {
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            return $;
        }
    }

}
