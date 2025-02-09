// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Organizations
{
    /// <summary>
    /// ## Import
    /// 
    /// IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
    /// 
    /// This member resource can be imported using the `org_id`, role, and member e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:organizations/iAMMember:IAMMember my_organization "your-orgid roles/viewer user:foo@example.com"
    /// ```
    /// 
    ///  IAM binding imports use space-delimited identifiers; the resource in question and the role.
    /// 
    /// This binding resource can be imported using the `org_id` and role, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:organizations/iAMMember:IAMMember my_organization "your-org-id roles/viewer"
    /// ```
    /// 
    ///  IAM policy imports use the identifier of the resource in question.
    /// 
    /// This policy resource can be imported using the `org_id`.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:organizations/iAMMember:IAMMember my_organization your-org-id
    /// ```
    /// 
    ///  IAM audit config imports use the identifier of the resource in question and the service, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import gcp:organizations/iAMMember:IAMMember my_organization "your-organization-id foo.googleapis.com"
    /// ```
    /// 
    ///  -&gt; **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
    /// 
    /// full name of the custom role, e.g. `organizations/{{org_id}}/roles/{{role_id}}`. -&gt; **Conditional IAM Bindings**If you're importing a IAM binding with a condition block, make sure
    /// 
    /// ```sh
    ///  $ pulumi import gcp:organizations/iAMMember:IAMMember to include the title of condition, e.g. `google_organization_iam_binding.my_organization "your-org-id roles/{{role_id}} condition-title"`
    /// ```
    /// </summary>
    [GcpResourceType("gcp:organizations/iAMMember:IAMMember")]
    public partial class IAMMember : global::Pulumi.CustomResource
    {
        /// <summary>
        /// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
        /// Structure is documented below.
        /// </summary>
        [Output("condition")]
        public Output<Outputs.IAMMemberCondition?> Condition { get; private set; } = null!;

        /// <summary>
        /// (Computed) The etag of the organization's IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        [Output("member")]
        public Output<string> Member { get; private set; } = null!;

        /// <summary>
        /// The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
        /// Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
        /// will not be inferred from the provider.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// The role that should be applied. Only one
        /// `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
        /// `organizations/{{org_id}}/roles/{{role_id}}`.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;


        /// <summary>
        /// Create a IAMMember resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IAMMember(string name, IAMMemberArgs args, CustomResourceOptions? options = null)
            : base("gcp:organizations/iAMMember:IAMMember", name, args ?? new IAMMemberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IAMMember(string name, Input<string> id, IAMMemberState? state = null, CustomResourceOptions? options = null)
            : base("gcp:organizations/iAMMember:IAMMember", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IAMMember resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IAMMember Get(string name, Input<string> id, IAMMemberState? state = null, CustomResourceOptions? options = null)
        {
            return new IAMMember(name, id, state, options);
        }
    }

    public sealed class IAMMemberArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
        /// Structure is documented below.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.IAMMemberConditionArgs>? Condition { get; set; }

        [Input("member", required: true)]
        public Input<string> Member { get; set; } = null!;

        /// <summary>
        /// The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
        /// Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
        /// will not be inferred from the provider.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// The role that should be applied. Only one
        /// `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
        /// `organizations/{{org_id}}/roles/{{role_id}}`.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public IAMMemberArgs()
        {
        }
        public static new IAMMemberArgs Empty => new IAMMemberArgs();
    }

    public sealed class IAMMemberState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
        /// Structure is documented below.
        /// </summary>
        [Input("condition")]
        public Input<Inputs.IAMMemberConditionGetArgs>? Condition { get; set; }

        /// <summary>
        /// (Computed) The etag of the organization's IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("member")]
        public Input<string>? Member { get; set; }

        /// <summary>
        /// The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
        /// Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
        /// will not be inferred from the provider.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// The role that should be applied. Only one
        /// `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
        /// `organizations/{{org_id}}/roles/{{role_id}}`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public IAMMemberState()
        {
        }
        public static new IAMMemberState Empty => new IAMMemberState();
    }
}
