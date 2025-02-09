// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 *
 * This member resource can be imported using the `hl7_v2_store_id`, role, and account e.g.
 *
 * ```sh
 *  $ pulumi import gcp:healthcare/hl7StoreIamMember:Hl7StoreIamMember hl7_v2_store_iam "your-project-id/location-name/dataset-name/hl7-v2-store-name roles/viewer user:foo@example.com"
 * ```
 *
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role.
 *
 * This binding resource can be imported using the `hl7_v2_store_id` and role, e.g.
 *
 * ```sh
 *  $ pulumi import gcp:healthcare/hl7StoreIamMember:Hl7StoreIamMember hl7_v2_store_iam "your-project-id/location-name/dataset-name/hl7-v2-store-name roles/viewer"
 * ```
 *
 *  IAM policy imports use the identifier of the resource in question.
 *
 * This policy resource can be imported using the `hl7_v2_store_id`, role, and account e.g.
 *
 * ```sh
 *  $ pulumi import gcp:healthcare/hl7StoreIamMember:Hl7StoreIamMember hl7_v2_store_iam your-project-id/location-name/dataset-name/hl7-v2-store-name
 * ```
 */
export class Hl7StoreIamMember extends pulumi.CustomResource {
    /**
     * Get an existing Hl7StoreIamMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: Hl7StoreIamMemberState, opts?: pulumi.CustomResourceOptions): Hl7StoreIamMember {
        return new Hl7StoreIamMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:healthcare/hl7StoreIamMember:Hl7StoreIamMember';

    /**
     * Returns true if the given object is an instance of Hl7StoreIamMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Hl7StoreIamMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Hl7StoreIamMember.__pulumiType;
    }

    public readonly condition!: pulumi.Output<outputs.healthcare.Hl7StoreIamMemberCondition | undefined>;
    /**
     * (Computed) The etag of the HL7v2 store's IAM policy.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     */
    public readonly hl7V2StoreId!: pulumi.Output<string>;
    public readonly member!: pulumi.Output<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    public readonly role!: pulumi.Output<string>;

    /**
     * Create a Hl7StoreIamMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: Hl7StoreIamMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: Hl7StoreIamMemberArgs | Hl7StoreIamMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as Hl7StoreIamMemberState | undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["hl7V2StoreId"] = state ? state.hl7V2StoreId : undefined;
            resourceInputs["member"] = state ? state.member : undefined;
            resourceInputs["role"] = state ? state.role : undefined;
        } else {
            const args = argsOrState as Hl7StoreIamMemberArgs | undefined;
            if ((!args || args.hl7V2StoreId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hl7V2StoreId'");
            }
            if ((!args || args.member === undefined) && !opts.urn) {
                throw new Error("Missing required property 'member'");
            }
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["hl7V2StoreId"] = args ? args.hl7V2StoreId : undefined;
            resourceInputs["member"] = args ? args.member : undefined;
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Hl7StoreIamMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Hl7StoreIamMember resources.
 */
export interface Hl7StoreIamMemberState {
    condition?: pulumi.Input<inputs.healthcare.Hl7StoreIamMemberCondition>;
    /**
     * (Computed) The etag of the HL7v2 store's IAM policy.
     */
    etag?: pulumi.Input<string>;
    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     */
    hl7V2StoreId?: pulumi.Input<string>;
    member?: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    role?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Hl7StoreIamMember resource.
 */
export interface Hl7StoreIamMemberArgs {
    condition?: pulumi.Input<inputs.healthcare.Hl7StoreIamMemberCondition>;
    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     */
    hl7V2StoreId: pulumi.Input<string>;
    member: pulumi.Input<string>;
    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     */
    role: pulumi.Input<string>;
}
