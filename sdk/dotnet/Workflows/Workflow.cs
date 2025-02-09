// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Workflows
{
    /// <summary>
    /// Workflow program to be executed by Workflows.
    /// 
    /// To get more information about Workflow, see:
    /// 
    /// * [API documentation](https://cloud.google.com/workflows/docs/reference/rest/v1/projects.locations.workflows)
    /// * How-to Guides
    ///     * [Managing Workflows](https://cloud.google.com/workflows/docs/creating-updating-workflow)
    /// 
    /// ## Example Usage
    /// ### Workflow Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testAccount = new Gcp.ServiceAccount.Account("testAccount", new()
    ///     {
    ///         AccountId = "my-account",
    ///         DisplayName = "Test Service Account",
    ///     });
    /// 
    ///     var example = new Gcp.Workflows.Workflow("example", new()
    ///     {
    ///         Region = "us-central1",
    ///         Description = "Magic",
    ///         ServiceAccount = testAccount.Id,
    ///         SourceContents = @$"# This is a sample workflow, feel free to replace it with your source code
    /// #
    /// # This workflow does the following:
    /// # - reads current time and date information from an external API and stores
    /// #   the response in CurrentDateTime variable
    /// # - retrieves a list of Wikipedia articles related to the day of the week
    /// #   from CurrentDateTime
    /// # - returns the list of articles as an output of the workflow
    /// # FYI, In terraform you need to escape the $$ or it will cause errors.
    /// 
    /// - getCurrentTime:
    ///     call: http.get
    ///     args:
    ///         url: https://us-central1-workflowsample.cloudfunctions.net/datetime
    ///     result: CurrentDateTime
    /// - readWikipedia:
    ///     call: http.get
    ///     args:
    ///         url: https://en.wikipedia.org/w/api.php
    ///         query:
    ///             action: opensearch
    ///             search: {CurrentDateTime.Body.DayOfTheWeek}
    ///     result: WikiResult
    /// - returnOutput:
    ///     return: {WikiResult.Body[1]}
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource does not support import.
    /// </summary>
    [GcpResourceType("gcp:workflows/workflow:Workflow")]
    public partial class Workflow : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The timestamp of when the workflow was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// A set of key/value label pairs to assign to this Workflow.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Name of the Workflow.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Creates a unique name beginning with the
        /// specified prefix. If this and name are unspecified, a random value is chosen for the name.
        /// </summary>
        [Output("namePrefix")]
        public Output<string> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The region of the workflow.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// The revision of the workflow. A new one is generated if the service account or source contents is changed.
        /// </summary>
        [Output("revisionId")]
        public Output<string> RevisionId { get; private set; } = null!;

        /// <summary>
        /// Name of the service account associated with the latest workflow version. This service
        /// account represents the identity of the workflow and determines what permissions the workflow has.
        /// Format: projects/{project}/serviceAccounts/{account}.
        /// </summary>
        [Output("serviceAccount")]
        public Output<string> ServiceAccount { get; private set; } = null!;

        /// <summary>
        /// Workflow code to be executed. The size limit is 32KB.
        /// </summary>
        [Output("sourceContents")]
        public Output<string?> SourceContents { get; private set; } = null!;

        /// <summary>
        /// State of the workflow deployment.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The timestamp of when the workflow was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Workflow resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Workflow(string name, WorkflowArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:workflows/workflow:Workflow", name, args ?? new WorkflowArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Workflow(string name, Input<string> id, WorkflowState? state = null, CustomResourceOptions? options = null)
            : base("gcp:workflows/workflow:Workflow", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Workflow resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Workflow Get(string name, Input<string> id, WorkflowState? state = null, CustomResourceOptions? options = null)
        {
            return new Workflow(name, id, state, options);
        }
    }

    public sealed class WorkflowArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// A set of key/value label pairs to assign to this Workflow.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the Workflow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the
        /// specified prefix. If this and name are unspecified, a random value is chosen for the name.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of the workflow.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Name of the service account associated with the latest workflow version. This service
        /// account represents the identity of the workflow and determines what permissions the workflow has.
        /// Format: projects/{project}/serviceAccounts/{account}.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// Workflow code to be executed. The size limit is 32KB.
        /// </summary>
        [Input("sourceContents")]
        public Input<string>? SourceContents { get; set; }

        public WorkflowArgs()
        {
        }
        public static new WorkflowArgs Empty => new WorkflowArgs();
    }

    public sealed class WorkflowState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The timestamp of when the workflow was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// A set of key/value label pairs to assign to this Workflow.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Name of the Workflow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the
        /// specified prefix. If this and name are unspecified, a random value is chosen for the name.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of the workflow.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The revision of the workflow. A new one is generated if the service account or source contents is changed.
        /// </summary>
        [Input("revisionId")]
        public Input<string>? RevisionId { get; set; }

        /// <summary>
        /// Name of the service account associated with the latest workflow version. This service
        /// account represents the identity of the workflow and determines what permissions the workflow has.
        /// Format: projects/{project}/serviceAccounts/{account}.
        /// </summary>
        [Input("serviceAccount")]
        public Input<string>? ServiceAccount { get; set; }

        /// <summary>
        /// Workflow code to be executed. The size limit is 32KB.
        /// </summary>
        [Input("sourceContents")]
        public Input<string>? SourceContents { get; set; }

        /// <summary>
        /// State of the workflow deployment.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The timestamp of when the workflow was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public WorkflowState()
        {
        }
        public static new WorkflowState Empty => new WorkflowState();
    }
}
