// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabase;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StreamBackfillAllMysqlExcludedObjects {
    /**
     * @return MySQL databases on the server
     * Structure is documented below.
     * 
     */
    private List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabase> mysqlDatabases;

    private StreamBackfillAllMysqlExcludedObjects() {}
    /**
     * @return MySQL databases on the server
     * Structure is documented below.
     * 
     */
    public List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabase> mysqlDatabases() {
        return this.mysqlDatabases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamBackfillAllMysqlExcludedObjects defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabase> mysqlDatabases;
        public Builder() {}
        public Builder(StreamBackfillAllMysqlExcludedObjects defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlDatabases = defaults.mysqlDatabases;
        }

        @CustomType.Setter
        public Builder mysqlDatabases(List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabase> mysqlDatabases) {
            this.mysqlDatabases = Objects.requireNonNull(mysqlDatabases);
            return this;
        }
        public Builder mysqlDatabases(StreamBackfillAllMysqlExcludedObjectsMysqlDatabase... mysqlDatabases) {
            return mysqlDatabases(List.of(mysqlDatabases));
        }
        public StreamBackfillAllMysqlExcludedObjects build() {
            final var o = new StreamBackfillAllMysqlExcludedObjects();
            o.mysqlDatabases = mysqlDatabases;
            return o;
        }
    }
}
