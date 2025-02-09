// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.InstanceGroupArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupState;
import com.pulumi.gcp.compute.outputs.InstanceGroupNamedPort;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Instance group can be imported using the `zone` and `name` with an optional `project`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroup:InstanceGroup webservers us-central1-a/terraform-webservers
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroup:InstanceGroup webservers big-project/us-central1-a/terraform-webservers
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroup:InstanceGroup webservers projects/big-project/zones/us-central1-a/instanceGroups/terraform-webservers
 * ```
 * 
 */
@ResourceType(type="gcp:compute/instanceGroup:InstanceGroup")
public class InstanceGroup extends com.pulumi.resources.CustomResource {
    /**
     * An optional textual description of the instance
     * group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional textual description of the instance
     * group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The list of instances in the group, in `self_link` format.
     * When adding instances they must all be in the same network and zone as the instance group.
     * 
     */
    @Export(name="instances", type=List.class, parameters={String.class})
    private Output<List<String>> instances;

    /**
     * @return The list of instances in the group, in `self_link` format.
     * When adding instances they must all be in the same network and zone as the instance group.
     * 
     */
    public Output<List<String>> instances() {
        return this.instances;
    }
    /**
     * The name of the instance group. Must be 1-63
     * characters long and comply with
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
     * include lowercase letters, numbers, and hyphens.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the instance group. Must be 1-63
     * characters long and comply with
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
     * include lowercase letters, numbers, and hyphens.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The named port configuration. See the section below
     * for details on configuration. Structure is documented below.
     * 
     */
    @Export(name="namedPorts", type=List.class, parameters={InstanceGroupNamedPort.class})
    private Output</* @Nullable */ List<InstanceGroupNamedPort>> namedPorts;

    /**
     * @return The named port configuration. See the section below
     * for details on configuration. Structure is documented below.
     * 
     */
    public Output<Optional<List<InstanceGroupNamedPort>>> namedPorts() {
        return Codegen.optional(this.namedPorts);
    }
    /**
     * The URL of the network the instance group is in. If
     * this is different from the network where the instances are in, the creation
     * fails. Defaults to the network where the instances are in (if neither
     * `network` nor `instances` is specified, this field will be blank).
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The URL of the network the instance group is in. If
     * this is different from the network where the instances are in, the creation
     * fails. Defaults to the network where the instances are in (if neither
     * `network` nor `instances` is specified, this field will be blank).
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The number of instances in the group.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return The number of instances in the group.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * The zone that this instance group should be created in.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The zone that this instance group should be created in.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceGroup(String name) {
        this(name, InstanceGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceGroup(String name, @Nullable InstanceGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceGroup(String name, @Nullable InstanceGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceGroup:InstanceGroup", name, args == null ? InstanceGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceGroup(String name, Output<String> id, @Nullable InstanceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceGroup:InstanceGroup", name, state, makeResourceOptions(options, id));
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
    public static InstanceGroup get(String name, Output<String> id, @Nullable InstanceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceGroup(name, id, state, options);
    }
}
