// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAttachedVersionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAttachedVersionsPlainArgs Empty = new GetAttachedVersionsPlainArgs();

    /**
     * The location to list versions for.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The location to list versions for.
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * ID of the project to list available platform versions for. Should match the project the cluster will be deployed to.
     * Defaults to the project that the provider is authenticated with.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return ID of the project to list available platform versions for. Should match the project the cluster will be deployed to.
     * Defaults to the project that the provider is authenticated with.
     * 
     */
    public String project() {
        return this.project;
    }

    private GetAttachedVersionsPlainArgs() {}

    private GetAttachedVersionsPlainArgs(GetAttachedVersionsPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAttachedVersionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAttachedVersionsPlainArgs $;

        public Builder() {
            $ = new GetAttachedVersionsPlainArgs();
        }

        public Builder(GetAttachedVersionsPlainArgs defaults) {
            $ = new GetAttachedVersionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location to list versions for.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param project ID of the project to list available platform versions for. Should match the project the cluster will be deployed to.
         * Defaults to the project that the provider is authenticated with.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public GetAttachedVersionsPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
