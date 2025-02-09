// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.alloydb.inputs.ClusterAutomatedBackupPolicyArgs;
import com.pulumi.gcp.alloydb.inputs.ClusterInitialUserArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The automated backup policy for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day, has a backup window of 1 hour, and retains backups for 14 days.
     * Structure is documented below.
     * 
     */
    @Import(name="automatedBackupPolicy")
    private @Nullable Output<ClusterAutomatedBackupPolicyArgs> automatedBackupPolicy;

    /**
     * @return The automated backup policy for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day, has a backup window of 1 hour, and retains backups for 14 days.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterAutomatedBackupPolicyArgs>> automatedBackupPolicy() {
        return Optional.ofNullable(this.automatedBackupPolicy);
    }

    /**
     * The ID of the alloydb cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The ID of the alloydb cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * User-settable and human-readable display name for the Cluster.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User-settable and human-readable display name for the Cluster.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Initial user to setup during cluster creation.
     * Structure is documented below.
     * 
     */
    @Import(name="initialUser")
    private @Nullable Output<ClusterInitialUserArgs> initialUser;

    /**
     * @return Initial user to setup during cluster creation.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterInitialUserArgs>> initialUser() {
        return Optional.ofNullable(this.initialUser);
    }

    /**
     * User-defined labels for the alloydb cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for the alloydb cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location where the alloydb cluster should reside.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where the alloydb cluster should reside.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.automatedBackupPolicy = $.automatedBackupPolicy;
        this.clusterId = $.clusterId;
        this.displayName = $.displayName;
        this.initialUser = $.initialUser;
        this.labels = $.labels;
        this.location = $.location;
        this.network = $.network;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automatedBackupPolicy The automated backup policy for this cluster.
         * If no policy is provided then the default policy will be used. The default policy takes one backup a day, has a backup window of 1 hour, and retains backups for 14 days.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder automatedBackupPolicy(@Nullable Output<ClusterAutomatedBackupPolicyArgs> automatedBackupPolicy) {
            $.automatedBackupPolicy = automatedBackupPolicy;
            return this;
        }

        /**
         * @param automatedBackupPolicy The automated backup policy for this cluster.
         * If no policy is provided then the default policy will be used. The default policy takes one backup a day, has a backup window of 1 hour, and retains backups for 14 days.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder automatedBackupPolicy(ClusterAutomatedBackupPolicyArgs automatedBackupPolicy) {
            return automatedBackupPolicy(Output.of(automatedBackupPolicy));
        }

        /**
         * @param clusterId The ID of the alloydb cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the alloydb cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param displayName User-settable and human-readable display name for the Cluster.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User-settable and human-readable display name for the Cluster.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param initialUser Initial user to setup during cluster creation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initialUser(@Nullable Output<ClusterInitialUserArgs> initialUser) {
            $.initialUser = initialUser;
            return this;
        }

        /**
         * @param initialUser Initial user to setup during cluster creation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initialUser(ClusterInitialUserArgs initialUser) {
            return initialUser(Output.of(initialUser));
        }

        /**
         * @param labels User-defined labels for the alloydb cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels for the alloydb cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location where the alloydb cluster should reside.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where the alloydb cluster should reside.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param network The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
         * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
         * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ClusterArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            return $;
        }
    }

}
