// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackupRunResult {
    private Integer backupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instance;
    /**
     * @return Location of the backups.
     * 
     */
    private String location;
    private @Nullable Boolean mostRecent;
    private String project;
    /**
     * @return The time the backup operation actually started in UTC timezone in RFC 3339 format, for
     * example 2012-11-15T16:19:00.094Z.
     * 
     */
    private String startTime;
    /**
     * @return The status of this run. Refer to [API reference](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/backupRuns#SqlBackupRunStatus) for possible status values.
     * 
     */
    private String status;

    private GetBackupRunResult() {}
    public Integer backupId() {
        return this.backupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instance() {
        return this.instance;
    }
    /**
     * @return Location of the backups.
     * 
     */
    public String location() {
        return this.location;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    public String project() {
        return this.project;
    }
    /**
     * @return The time the backup operation actually started in UTC timezone in RFC 3339 format, for
     * example 2012-11-15T16:19:00.094Z.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The status of this run. Refer to [API reference](https://cloud.google.com/sql/docs/mysql/admin-api/rest/v1beta4/backupRuns#SqlBackupRunStatus) for possible status values.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupRunResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer backupId;
        private String id;
        private String instance;
        private String location;
        private @Nullable Boolean mostRecent;
        private String project;
        private String startTime;
        private String status;
        public Builder() {}
        public Builder(GetBackupRunResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.id = defaults.id;
    	      this.instance = defaults.instance;
    	      this.location = defaults.location;
    	      this.mostRecent = defaults.mostRecent;
    	      this.project = defaults.project;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder backupId(Integer backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetBackupRunResult build() {
            final var o = new GetBackupRunResult();
            o.backupId = backupId;
            o.id = id;
            o.instance = instance;
            o.location = location;
            o.mostRecent = mostRecent;
            o.project = project;
            o.startTime = startTime;
            o.status = status;
            return o;
        }
    }
}
