// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig
{
    /// <summary>
    /// Represents an OSPolicyAssignment resource.
    /// 
    /// ## Example Usage
    /// ### Fixed_os_policy_assignment
    /// An example of an osconfig os policy assignment with fixed rollout disruption budget
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var primary = new Gcp.OsConfig.OsPolicyAssignment("primary", new()
    ///     {
    ///         Description = "A test os policy assignment",
    ///         InstanceFilter = new Gcp.OsConfig.Inputs.OsPolicyAssignmentInstanceFilterArgs
    ///         {
    ///             All = false,
    ///             ExclusionLabels = new[]
    ///             {
    ///                 new Gcp.OsConfig.Inputs.OsPolicyAssignmentInstanceFilterExclusionLabelArgs
    ///                 {
    ///                     Labels = 
    ///                     {
    ///                         { "label-two", "value-two" },
    ///                     },
    ///                 },
    ///             },
    ///             InclusionLabels = new[]
    ///             {
    ///                 new Gcp.OsConfig.Inputs.OsPolicyAssignmentInstanceFilterInclusionLabelArgs
    ///                 {
    ///                     Labels = 
    ///                     {
    ///                         { "label-one", "value-one" },
    ///                     },
    ///                 },
    ///             },
    ///             Inventories = new[]
    ///             {
    ///                 new Gcp.OsConfig.Inputs.OsPolicyAssignmentInstanceFilterInventoryArgs
    ///                 {
    ///                     OsShortName = "centos",
    ///                     OsVersion = "8.*",
    ///                 },
    ///             },
    ///         },
    ///         Location = "us-west1-a",
    ///         OsPolicies = new[]
    ///         {
    ///             new Gcp.OsConfig.Inputs.OsPolicyAssignmentOsPolicyArgs
    ///             {
    ///                 AllowNoResourceGroupMatch = false,
    ///                 Description = "A test os policy",
    ///                 Id = "policy",
    ///                 Mode = "VALIDATION",
    ///                 ResourceGroups = new[]
    ///                 {
    ///                     new Gcp.OsConfig.Inputs.OsPolicyAssignmentOsPolicyResourceGroupArgs
    ///                     {
    ///                         InventoryFilters = new[]
    ///                         {
    ///                             new Gcp.OsConfig.Inputs.OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs
    ///                             {
    ///                                 OsShortName = "centos",
    ///                                 OsVersion = "8.*",
    ///                             },
    ///                         },
    ///                         Resources = new[]
    ///                         {
    ///                             new Gcp.OsConfig.Inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs
    ///                             {
    ///                                 Id = "apt",
    ///                                 Pkg = new Gcp.OsConfig.Inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgArgs
    ///                                 {
    ///                                     Apt = new Gcp.OsConfig.Inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptArgs
    ///                                     {
    ///                                         Name = "bazel",
    ///                                     },
    ///                                     DesiredState = "INSTALLED",
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Project = "my-project-name",
    ///         Rollout = new Gcp.OsConfig.Inputs.OsPolicyAssignmentRolloutArgs
    ///         {
    ///             DisruptionBudget = new Gcp.OsConfig.Inputs.OsPolicyAssignmentRolloutDisruptionBudgetArgs
    ///             {
    ///                 Fixed = 1,
    ///             },
    ///             MinWaitDuration = "3.5s",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// OSPolicyAssignment can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:osconfig/osPolicyAssignment:OsPolicyAssignment default projects/{{project}}/locations/{{location}}/osPolicyAssignments/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:osconfig/osPolicyAssignment:OsPolicyAssignment default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:osconfig/osPolicyAssignment:OsPolicyAssignment default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:osconfig/osPolicyAssignment:OsPolicyAssignment")]
    public partial class OsPolicyAssignment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Output only. Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS policies from this revision. For a given OS policy assignment, there is only one revision with a value of `true` for this field.
        /// </summary>
        [Output("baseline")]
        public Output<bool> Baseline { get; private set; } = null!;

        /// <summary>
        /// Output only. Indicates that this revision deletes the OS policy assignment.
        /// </summary>
        [Output("deleted")]
        public Output<bool> Deleted { get; private set; } = null!;

        /// <summary>
        /// Policy description. Length of the description is limited to 1024 characters.
        /// (Optional)
        /// OS policy assignment description. Length of the description is limited to 1024 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The etag for this OS policy assignment. If this is provided on update, it must match the server's etag.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Required. Filter to select VMs.
        /// </summary>
        [Output("instanceFilter")]
        public Output<Outputs.OsPolicyAssignmentInstanceFilter> InstanceFilter { get; private set; } = null!;

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Resource name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Required. List of OS policies to be applied to the VMs.
        /// </summary>
        [Output("osPolicies")]
        public Output<ImmutableArray<Outputs.OsPolicyAssignmentOsPolicy>> OsPolicies { get; private set; } = null!;

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Output only. Indicates that reconciliation is in progress for the revision. This value is `true` when the `rollout_state` is one of: * IN_PROGRESS * CANCELLING
        /// </summary>
        [Output("reconciling")]
        public Output<bool> Reconciling { get; private set; } = null!;

        /// <summary>
        /// Output only. The timestamp that the revision was created.
        /// </summary>
        [Output("revisionCreateTime")]
        public Output<string> RevisionCreateTime { get; private set; } = null!;

        /// <summary>
        /// Output only. The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy assignment
        /// </summary>
        [Output("revisionId")]
        public Output<string> RevisionId { get; private set; } = null!;

        /// <summary>
        /// Required. Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
        /// </summary>
        [Output("rollout")]
        public Output<Outputs.OsPolicyAssignmentRollout> Rollout { get; private set; } = null!;

        /// <summary>
        /// Output only. OS policy assignment rollout state Possible values: ROLLOUT_STATE_UNSPECIFIED, IN_PROGRESS, CANCELLING, CANCELLED, SUCCEEDED
        /// </summary>
        [Output("rolloutState")]
        public Output<string> RolloutState { get; private set; } = null!;

        /// <summary>
        /// Set to true to skip awaiting rollout during resource creation and update.
        /// </summary>
        [Output("skipAwaitRollout")]
        public Output<bool?> SkipAwaitRollout { get; private set; } = null!;

        /// <summary>
        /// Output only. Server generated unique id for the OS policy assignment resource.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;


        /// <summary>
        /// Create a OsPolicyAssignment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OsPolicyAssignment(string name, OsPolicyAssignmentArgs args, CustomResourceOptions? options = null)
            : base("gcp:osconfig/osPolicyAssignment:OsPolicyAssignment", name, args ?? new OsPolicyAssignmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OsPolicyAssignment(string name, Input<string> id, OsPolicyAssignmentState? state = null, CustomResourceOptions? options = null)
            : base("gcp:osconfig/osPolicyAssignment:OsPolicyAssignment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OsPolicyAssignment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OsPolicyAssignment Get(string name, Input<string> id, OsPolicyAssignmentState? state = null, CustomResourceOptions? options = null)
        {
            return new OsPolicyAssignment(name, id, state, options);
        }
    }

    public sealed class OsPolicyAssignmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Policy description. Length of the description is limited to 1024 characters.
        /// (Optional)
        /// OS policy assignment description. Length of the description is limited to 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Required. Filter to select VMs.
        /// </summary>
        [Input("instanceFilter", required: true)]
        public Input<Inputs.OsPolicyAssignmentInstanceFilterArgs> InstanceFilter { get; set; } = null!;

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Resource name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("osPolicies", required: true)]
        private InputList<Inputs.OsPolicyAssignmentOsPolicyArgs>? _osPolicies;

        /// <summary>
        /// Required. List of OS policies to be applied to the VMs.
        /// </summary>
        public InputList<Inputs.OsPolicyAssignmentOsPolicyArgs> OsPolicies
        {
            get => _osPolicies ?? (_osPolicies = new InputList<Inputs.OsPolicyAssignmentOsPolicyArgs>());
            set => _osPolicies = value;
        }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Required. Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
        /// </summary>
        [Input("rollout", required: true)]
        public Input<Inputs.OsPolicyAssignmentRolloutArgs> Rollout { get; set; } = null!;

        /// <summary>
        /// Set to true to skip awaiting rollout during resource creation and update.
        /// </summary>
        [Input("skipAwaitRollout")]
        public Input<bool>? SkipAwaitRollout { get; set; }

        public OsPolicyAssignmentArgs()
        {
        }
        public static new OsPolicyAssignmentArgs Empty => new OsPolicyAssignmentArgs();
    }

    public sealed class OsPolicyAssignmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Output only. Indicates that this revision has been successfully rolled out in this zone and new VMs will be assigned OS policies from this revision. For a given OS policy assignment, there is only one revision with a value of `true` for this field.
        /// </summary>
        [Input("baseline")]
        public Input<bool>? Baseline { get; set; }

        /// <summary>
        /// Output only. Indicates that this revision deletes the OS policy assignment.
        /// </summary>
        [Input("deleted")]
        public Input<bool>? Deleted { get; set; }

        /// <summary>
        /// Policy description. Length of the description is limited to 1024 characters.
        /// (Optional)
        /// OS policy assignment description. Length of the description is limited to 1024 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The etag for this OS policy assignment. If this is provided on update, it must match the server's etag.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Required. Filter to select VMs.
        /// </summary>
        [Input("instanceFilter")]
        public Input<Inputs.OsPolicyAssignmentInstanceFilterGetArgs>? InstanceFilter { get; set; }

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Resource name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("osPolicies")]
        private InputList<Inputs.OsPolicyAssignmentOsPolicyGetArgs>? _osPolicies;

        /// <summary>
        /// Required. List of OS policies to be applied to the VMs.
        /// </summary>
        public InputList<Inputs.OsPolicyAssignmentOsPolicyGetArgs> OsPolicies
        {
            get => _osPolicies ?? (_osPolicies = new InputList<Inputs.OsPolicyAssignmentOsPolicyGetArgs>());
            set => _osPolicies = value;
        }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Output only. Indicates that reconciliation is in progress for the revision. This value is `true` when the `rollout_state` is one of: * IN_PROGRESS * CANCELLING
        /// </summary>
        [Input("reconciling")]
        public Input<bool>? Reconciling { get; set; }

        /// <summary>
        /// Output only. The timestamp that the revision was created.
        /// </summary>
        [Input("revisionCreateTime")]
        public Input<string>? RevisionCreateTime { get; set; }

        /// <summary>
        /// Output only. The assignment revision ID A new revision is committed whenever a rollout is triggered for a OS policy assignment
        /// </summary>
        [Input("revisionId")]
        public Input<string>? RevisionId { get; set; }

        /// <summary>
        /// Required. Rollout to deploy the OS policy assignment. A rollout is triggered in the following situations: 1) OSPolicyAssignment is created. 2) OSPolicyAssignment is updated and the update contains changes to one of the following fields: - instance_filter - os_policies 3) OSPolicyAssignment is deleted.
        /// </summary>
        [Input("rollout")]
        public Input<Inputs.OsPolicyAssignmentRolloutGetArgs>? Rollout { get; set; }

        /// <summary>
        /// Output only. OS policy assignment rollout state Possible values: ROLLOUT_STATE_UNSPECIFIED, IN_PROGRESS, CANCELLING, CANCELLED, SUCCEEDED
        /// </summary>
        [Input("rolloutState")]
        public Input<string>? RolloutState { get; set; }

        /// <summary>
        /// Set to true to skip awaiting rollout during resource creation and update.
        /// </summary>
        [Input("skipAwaitRollout")]
        public Input<bool>? SkipAwaitRollout { get; set; }

        /// <summary>
        /// Output only. Server generated unique id for the OS policy assignment resource.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        public OsPolicyAssignmentState()
        {
        }
        public static new OsPolicyAssignmentState Empty => new OsPolicyAssignmentState();
    }
}
