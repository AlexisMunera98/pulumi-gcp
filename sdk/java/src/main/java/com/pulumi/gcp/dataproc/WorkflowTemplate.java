// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataproc.WorkflowTemplateArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateState;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJob;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateParameter;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacement;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Workflow Template is a reusable workflow configuration. It defines a graph of jobs with information on where to run those jobs.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dataproc.WorkflowTemplate;
 * import com.pulumi.gcp.dataproc.WorkflowTemplateArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs;
 * import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var template = new WorkflowTemplate(&#34;template&#34;, WorkflowTemplateArgs.builder()        
 *             .jobs(            
 *                 WorkflowTemplateJobArgs.builder()
 *                     .sparkJob(WorkflowTemplateJobSparkJobArgs.builder()
 *                         .mainClass(&#34;SomeClass&#34;)
 *                         .build())
 *                     .stepId(&#34;someJob&#34;)
 *                     .build(),
 *                 WorkflowTemplateJobArgs.builder()
 *                     .prerequisiteStepIds(&#34;someJob&#34;)
 *                     .prestoJob(WorkflowTemplateJobPrestoJobArgs.builder()
 *                         .queryFileUri(&#34;someuri&#34;)
 *                         .build())
 *                     .stepId(&#34;otherJob&#34;)
 *                     .build())
 *             .location(&#34;us-central1&#34;)
 *             .placement(WorkflowTemplatePlacementArgs.builder()
 *                 .managedCluster(WorkflowTemplatePlacementManagedClusterArgs.builder()
 *                     .clusterName(&#34;my-cluster&#34;)
 *                     .config(WorkflowTemplatePlacementManagedClusterConfigArgs.builder()
 *                         .gceClusterConfig(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigArgs.builder()
 *                             .tags(                            
 *                                 &#34;foo&#34;,
 *                                 &#34;bar&#34;)
 *                             .zone(&#34;us-central1-a&#34;)
 *                             .build())
 *                         .masterConfig(WorkflowTemplatePlacementManagedClusterConfigMasterConfigArgs.builder()
 *                             .diskConfig(WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs.builder()
 *                                 .bootDiskSizeGb(15)
 *                                 .bootDiskType(&#34;pd-ssd&#34;)
 *                                 .build())
 *                             .machineType(&#34;n1-standard-1&#34;)
 *                             .numInstances(1)
 *                             .build())
 *                         .secondaryWorkerConfig(WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs.builder()
 *                             .numInstances(2)
 *                             .build())
 *                         .softwareConfig(WorkflowTemplatePlacementManagedClusterConfigSoftwareConfigArgs.builder()
 *                             .imageVersion(&#34;2.0.35-debian10&#34;)
 *                             .build())
 *                         .workerConfig(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs.builder()
 *                             .diskConfig(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs.builder()
 *                                 .bootDiskSizeGb(10)
 *                                 .numLocalSsds(2)
 *                                 .build())
 *                             .machineType(&#34;n1-standard-2&#34;)
 *                             .numInstances(3)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * WorkflowTemplate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/workflowTemplate:WorkflowTemplate default projects/{{project}}/locations/{{location}}/workflowTemplates/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/workflowTemplate:WorkflowTemplate default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/workflowTemplate:WorkflowTemplate default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataproc/workflowTemplate:WorkflowTemplate")
public class WorkflowTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Output only. The time template was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The time template was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * (Beta only) Optional. Timeout duration for the DAG of jobs. You can use &#34;s&#34;, &#34;m&#34;, &#34;h&#34;, and &#34;d&#34; suffixes for second, minute, hour, and day duration values, respectively. The timeout duration must be from 10 minutes (&#34;10m&#34;) to 24 hours (&#34;24h&#34; or &#34;1d&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a (/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster), the cluster is deleted.
     * 
     */
    @Export(name="dagTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> dagTimeout;

    /**
     * @return (Beta only) Optional. Timeout duration for the DAG of jobs. You can use &#34;s&#34;, &#34;m&#34;, &#34;h&#34;, and &#34;d&#34; suffixes for second, minute, hour, and day duration values, respectively. The timeout duration must be from 10 minutes (&#34;10m&#34;) to 24 hours (&#34;24h&#34; or &#34;1d&#34;). The timer begins when the first job is submitted. If the workflow is running at the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running on a (/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster), the cluster is deleted.
     * 
     */
    public Output<Optional<String>> dagTimeout() {
        return Codegen.optional(this.dagTimeout);
    }
    /**
     * Required. The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    @Export(name="jobs", type=List.class, parameters={WorkflowTemplateJob.class})
    private Output<List<WorkflowTemplateJob>> jobs;

    /**
     * @return Required. The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    public Output<List<WorkflowTemplateJob>> jobs() {
        return this.jobs;
    }
    /**
     * Optional. The labels to associate with this job. Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: {0,63} No more than 32 labels can be associated with a given job.
     * (Optional)
     * Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance. Label **keys** must contain 1 to 63 characters, and must conform to (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a template.
     * (Optional)
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this job. Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: {0,63} No more than 32 labels can be associated with a given job.
     * (Optional)
     * Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created by the workflow instance. Label **keys** must contain 1 to 63 characters, and must conform to (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a template.
     * (Optional)
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location for the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Output only. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. * For `projects.regions.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}` * For `projects.locations.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Output only. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. * For `projects.regions.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}` * For `projects.locations.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={WorkflowTemplateParameter.class})
    private Output</* @Nullable */ List<WorkflowTemplateParameter>> parameters;

    /**
     * @return Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided when the template is instantiated.
     * 
     */
    public Output<Optional<List<WorkflowTemplateParameter>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * Required. WorkflowTemplate scheduling information.
     * 
     */
    @Export(name="placement", type=WorkflowTemplatePlacement.class, parameters={})
    private Output<WorkflowTemplatePlacement> placement;

    /**
     * @return Required. WorkflowTemplate scheduling information.
     * 
     */
    public Output<WorkflowTemplatePlacement> placement() {
        return this.placement;
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Output only. The time template was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The time template was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Optional. Used to perform a consistent read-modify-write. This field should be left blank for a `CreateWorkflowTemplate` request. It is required for an `UpdateWorkflowTemplate` request, and must match the current server version. A typical update template flow would fetch the current template with a `GetWorkflowTemplate` request, which will return the current template with the `version` field filled in with the current server version. The user updates other fields in the template, then returns it as part of the `UpdateWorkflowTemplate` request.
     * 
     * @deprecated
     * version is not useful as a configurable field, and will be removed in the future.
     * 
     */
    @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return Optional. Used to perform a consistent read-modify-write. This field should be left blank for a `CreateWorkflowTemplate` request. It is required for an `UpdateWorkflowTemplate` request, and must match the current server version. A typical update template flow would fetch the current template with a `GetWorkflowTemplate` request, which will return the current template with the `version` field filled in with the current server version. The user updates other fields in the template, then returns it as part of the `UpdateWorkflowTemplate` request.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkflowTemplate(String name) {
        this(name, WorkflowTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkflowTemplate(String name, WorkflowTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkflowTemplate(String name, WorkflowTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/workflowTemplate:WorkflowTemplate", name, args == null ? WorkflowTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkflowTemplate(String name, Output<String> id, @Nullable WorkflowTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/workflowTemplate:WorkflowTemplate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WorkflowTemplate get(String name, Output<String> id, @Nullable WorkflowTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkflowTemplate(name, id, state, options);
    }
}
