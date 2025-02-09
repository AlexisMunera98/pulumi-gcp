// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Projects
{
    /// <summary>
    /// ## Import
    /// 
    /// IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
    /// 
    /// This member resource can be imported using the `project_id`, role, and member e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project "your-project-id roles/viewer user:foo@example.com"
    /// ```
    /// 
    ///  IAM binding imports use space-delimited identifiers; the resource in question and the role.
    /// 
    /// This binding resource can be imported using the `project_id` and role, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project "your-project-id roles/viewer"
    /// ```
    /// 
    ///  IAM policy imports use the identifier of the resource in question.
    /// 
    /// This policy resource can be imported using the `project_id`.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project your-project-id
    /// ```
    /// 
    ///  IAM audit config imports use the identifier of the resource in question and the service, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project "your-project-id foo.googleapis.com"
    /// ```
    /// 
    ///  -&gt; **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
    /// 
    /// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`. -&gt; **Conditional IAM Bindings**If you're importing a IAM binding with a condition block, make sure
    /// 
    /// ```sh
    ///  $ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig to include the title of condition, e.g. `google_project_iam_binding.my_project "{{your-project-id}} roles/{{role_id}} condition-title"`
    /// ```
    /// </summary>
    [GcpResourceType("gcp:projects/iAMAuditConfig:IAMAuditConfig")]
    public partial class IAMAuditConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
        /// </summary>
        [Output("auditLogConfigs")]
        public Output<ImmutableArray<Outputs.IAMAuditConfigAuditLogConfig>> AuditLogConfigs { get; private set; } = null!;

        /// <summary>
        /// (Computed) The etag of the project's IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The project id of the target project. This is not
        /// inferred from the provider.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
        /// </summary>
        [Output("service")]
        public Output<string> Service { get; private set; } = null!;


        /// <summary>
        /// Create a IAMAuditConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IAMAuditConfig(string name, IAMAuditConfigArgs args, CustomResourceOptions? options = null)
            : base("gcp:projects/iAMAuditConfig:IAMAuditConfig", name, args ?? new IAMAuditConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IAMAuditConfig(string name, Input<string> id, IAMAuditConfigState? state = null, CustomResourceOptions? options = null)
            : base("gcp:projects/iAMAuditConfig:IAMAuditConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IAMAuditConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IAMAuditConfig Get(string name, Input<string> id, IAMAuditConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new IAMAuditConfig(name, id, state, options);
        }
    }

    public sealed class IAMAuditConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("auditLogConfigs", required: true)]
        private InputList<Inputs.IAMAuditConfigAuditLogConfigArgs>? _auditLogConfigs;

        /// <summary>
        /// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
        /// </summary>
        public InputList<Inputs.IAMAuditConfigAuditLogConfigArgs> AuditLogConfigs
        {
            get => _auditLogConfigs ?? (_auditLogConfigs = new InputList<Inputs.IAMAuditConfigAuditLogConfigArgs>());
            set => _auditLogConfigs = value;
        }

        /// <summary>
        /// The project id of the target project. This is not
        /// inferred from the provider.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        /// <summary>
        /// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public IAMAuditConfigArgs()
        {
        }
        public static new IAMAuditConfigArgs Empty => new IAMAuditConfigArgs();
    }

    public sealed class IAMAuditConfigState : global::Pulumi.ResourceArgs
    {
        [Input("auditLogConfigs")]
        private InputList<Inputs.IAMAuditConfigAuditLogConfigGetArgs>? _auditLogConfigs;

        /// <summary>
        /// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
        /// </summary>
        public InputList<Inputs.IAMAuditConfigAuditLogConfigGetArgs> AuditLogConfigs
        {
            get => _auditLogConfigs ?? (_auditLogConfigs = new InputList<Inputs.IAMAuditConfigAuditLogConfigGetArgs>());
            set => _auditLogConfigs = value;
        }

        /// <summary>
        /// (Computed) The etag of the project's IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The project id of the target project. This is not
        /// inferred from the provider.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        public IAMAuditConfigState()
        {
        }
        public static new IAMAuditConfigState Empty => new IAMAuditConfigState();
    }
}
