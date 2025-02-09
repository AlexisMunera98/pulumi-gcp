// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiEndpointDeployedModelAutomaticResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiEndpointDeployedModelAutomaticResourceArgs Empty = new AiEndpointDeployedModelAutomaticResourceArgs();

    /**
     * The maximum number of replicas this DeployedModel may be deployed on when the traffic against it increases. If the requested value is too large, the deployment will error, but if deployment succeeds then the ability to scale the model to that many replicas is guaranteed (barring service outages). If traffic against the DeployedModel increases beyond what its replicas at maximum may handle, a portion of the traffic will be dropped. If this value is not provided, a no upper bound for scaling under heavy traffic will be assume, though Vertex AI may be unable to scale beyond certain replica number.
     * 
     */
    @Import(name="maxReplicaCount")
    private @Nullable Output<Integer> maxReplicaCount;

    /**
     * @return The maximum number of replicas this DeployedModel may be deployed on when the traffic against it increases. If the requested value is too large, the deployment will error, but if deployment succeeds then the ability to scale the model to that many replicas is guaranteed (barring service outages). If traffic against the DeployedModel increases beyond what its replicas at maximum may handle, a portion of the traffic will be dropped. If this value is not provided, a no upper bound for scaling under heavy traffic will be assume, though Vertex AI may be unable to scale beyond certain replica number.
     * 
     */
    public Optional<Output<Integer>> maxReplicaCount() {
        return Optional.ofNullable(this.maxReplicaCount);
    }

    /**
     * The minimum number of replicas this DeployedModel will be always deployed on. If traffic against it increases, it may dynamically be deployed onto more replicas up to max_replica_count, and as traffic decreases, some of these extra replicas may be freed. If the requested value is too large, the deployment will error.
     * 
     */
    @Import(name="minReplicaCount")
    private @Nullable Output<Integer> minReplicaCount;

    /**
     * @return The minimum number of replicas this DeployedModel will be always deployed on. If traffic against it increases, it may dynamically be deployed onto more replicas up to max_replica_count, and as traffic decreases, some of these extra replicas may be freed. If the requested value is too large, the deployment will error.
     * 
     */
    public Optional<Output<Integer>> minReplicaCount() {
        return Optional.ofNullable(this.minReplicaCount);
    }

    private AiEndpointDeployedModelAutomaticResourceArgs() {}

    private AiEndpointDeployedModelAutomaticResourceArgs(AiEndpointDeployedModelAutomaticResourceArgs $) {
        this.maxReplicaCount = $.maxReplicaCount;
        this.minReplicaCount = $.minReplicaCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiEndpointDeployedModelAutomaticResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiEndpointDeployedModelAutomaticResourceArgs $;

        public Builder() {
            $ = new AiEndpointDeployedModelAutomaticResourceArgs();
        }

        public Builder(AiEndpointDeployedModelAutomaticResourceArgs defaults) {
            $ = new AiEndpointDeployedModelAutomaticResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxReplicaCount The maximum number of replicas this DeployedModel may be deployed on when the traffic against it increases. If the requested value is too large, the deployment will error, but if deployment succeeds then the ability to scale the model to that many replicas is guaranteed (barring service outages). If traffic against the DeployedModel increases beyond what its replicas at maximum may handle, a portion of the traffic will be dropped. If this value is not provided, a no upper bound for scaling under heavy traffic will be assume, though Vertex AI may be unable to scale beyond certain replica number.
         * 
         * @return builder
         * 
         */
        public Builder maxReplicaCount(@Nullable Output<Integer> maxReplicaCount) {
            $.maxReplicaCount = maxReplicaCount;
            return this;
        }

        /**
         * @param maxReplicaCount The maximum number of replicas this DeployedModel may be deployed on when the traffic against it increases. If the requested value is too large, the deployment will error, but if deployment succeeds then the ability to scale the model to that many replicas is guaranteed (barring service outages). If traffic against the DeployedModel increases beyond what its replicas at maximum may handle, a portion of the traffic will be dropped. If this value is not provided, a no upper bound for scaling under heavy traffic will be assume, though Vertex AI may be unable to scale beyond certain replica number.
         * 
         * @return builder
         * 
         */
        public Builder maxReplicaCount(Integer maxReplicaCount) {
            return maxReplicaCount(Output.of(maxReplicaCount));
        }

        /**
         * @param minReplicaCount The minimum number of replicas this DeployedModel will be always deployed on. If traffic against it increases, it may dynamically be deployed onto more replicas up to max_replica_count, and as traffic decreases, some of these extra replicas may be freed. If the requested value is too large, the deployment will error.
         * 
         * @return builder
         * 
         */
        public Builder minReplicaCount(@Nullable Output<Integer> minReplicaCount) {
            $.minReplicaCount = minReplicaCount;
            return this;
        }

        /**
         * @param minReplicaCount The minimum number of replicas this DeployedModel will be always deployed on. If traffic against it increases, it may dynamically be deployed onto more replicas up to max_replica_count, and as traffic decreases, some of these extra replicas may be freed. If the requested value is too large, the deployment will error.
         * 
         * @return builder
         * 
         */
        public Builder minReplicaCount(Integer minReplicaCount) {
            return minReplicaCount(Output.of(minReplicaCount));
        }

        public AiEndpointDeployedModelAutomaticResourceArgs build() {
            return $;
        }
    }

}
