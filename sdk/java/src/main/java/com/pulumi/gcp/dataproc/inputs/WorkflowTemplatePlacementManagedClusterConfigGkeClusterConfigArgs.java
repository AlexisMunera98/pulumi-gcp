// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs();

    /**
     * Optional. A target for the deployment.
     * 
     */
    @Import(name="namespacedGkeDeploymentTarget")
    private @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget;

    /**
     * @return Optional. A target for the deployment.
     * 
     */
    public Optional<Output<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetArgs>> namespacedGkeDeploymentTarget() {
        return Optional.ofNullable(this.namespacedGkeDeploymentTarget);
    }

    private WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs $) {
        this.namespacedGkeDeploymentTarget = $.namespacedGkeDeploymentTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespacedGkeDeploymentTarget Optional. A target for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder namespacedGkeDeploymentTarget(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget) {
            $.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
            return this;
        }

        /**
         * @param namespacedGkeDeploymentTarget Optional. A target for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder namespacedGkeDeploymentTarget(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTargetArgs namespacedGkeDeploymentTarget) {
            return namespacedGkeDeploymentTarget(Output.of(namespacedGkeDeploymentTarget));
        }

        public WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigArgs build() {
            return $;
        }
    }

}
