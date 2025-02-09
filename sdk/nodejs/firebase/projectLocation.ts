// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * ProjectLocation can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:firebase/projectLocation:ProjectLocation default projects/{{project}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:firebase/projectLocation:ProjectLocation default {{project}}
 * ```
 */
export class ProjectLocation extends pulumi.CustomResource {
    /**
     * Get an existing ProjectLocation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectLocationState, opts?: pulumi.CustomResourceOptions): ProjectLocation {
        return new ProjectLocation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:firebase/projectLocation:ProjectLocation';

    /**
     * Returns true if the given object is an instance of ProjectLocation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProjectLocation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProjectLocation.__pulumiType;
    }

    /**
     * The ID of the default GCP resource location for the Project. The location must be one of the available GCP
     * resource locations.
     */
    public readonly locationId!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;

    /**
     * Create a ProjectLocation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectLocationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectLocationArgs | ProjectLocationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectLocationState | undefined;
            resourceInputs["locationId"] = state ? state.locationId : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
        } else {
            const args = argsOrState as ProjectLocationArgs | undefined;
            if ((!args || args.locationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'locationId'");
            }
            resourceInputs["locationId"] = args ? args.locationId : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProjectLocation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProjectLocation resources.
 */
export interface ProjectLocationState {
    /**
     * The ID of the default GCP resource location for the Project. The location must be one of the available GCP
     * resource locations.
     */
    locationId?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ProjectLocation resource.
 */
export interface ProjectLocationArgs {
    /**
     * The ID of the default GCP resource location for the Project. The location must be one of the available GCP
     * resource locations.
     */
    locationId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
