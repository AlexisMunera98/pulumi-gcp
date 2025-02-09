// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.apigee.InstanceArgs;
import com.pulumi.gcp.apigee.inputs.InstanceState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An `Instance` is the runtime dataplane in Apigee.
 * 
 * To get more information about Instance, see:
 * 
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances/create)
 * * How-to Guides
 *     * [Creating a runtime instance](https://cloud.google.com/apigee/docs/api-platform/get-started/create-instance)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Instance can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/instance:Instance default {{org_id}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/instance:Instance default {{org_id}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigee/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Optional. Customer accept list represents the list of projects (id/number) on customer
     * side that can privately connect to the service attachment. It is an optional field
     * which the customers can provide during the instance creation. By default, the customer
     * project associated with the Apigee organization will be included to the list.
     * 
     */
    @Export(name="consumerAcceptLists", type=List.class, parameters={String.class})
    private Output<List<String>> consumerAcceptLists;

    /**
     * @return Optional. Customer accept list represents the list of projects (id/number) on customer
     * side that can privately connect to the service attachment. It is an optional field
     * which the customers can provide during the instance creation. By default, the customer
     * project associated with the Apigee organization will be included to the list.
     * 
     */
    public Output<List<String>> consumerAcceptLists() {
        return this.consumerAcceptLists;
    }
    /**
     * Description of the instance.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the instance.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only.
     * Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
     */
    @Export(name="diskEncryptionKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> diskEncryptionKeyName;

    /**
     * @return Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only.
     * Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
     */
    public Output<Optional<String>> diskEncryptionKeyName() {
        return Codegen.optional(this.diskEncryptionKeyName);
    }
    /**
     * Display name of the instance.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display name of the instance.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Output only. Hostname or IP address of the exposed Apigee endpoint used by clients to connect to the service.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return Output only. Hostname or IP address of the exposed Apigee endpoint used by clients to connect to the service.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * IP range represents the customer-provided CIDR block of length 22 that will be used for
     * the Apigee instance creation. This optional range, if provided, should be freely
     * available as part of larger named range the customer has allocated to the Service
     * Networking peering. If this is not provided, Apigee will automatically request for any
     * available /22 CIDR block from Service Networking. The customer should use this CIDR block
     * for configuring their firewall needs to allow traffic from Apigee.
     * Input format: &#34;a.b.c.d/22&#34;
     * 
     */
    @Export(name="ipRange", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipRange;

    /**
     * @return IP range represents the customer-provided CIDR block of length 22 that will be used for
     * the Apigee instance creation. This optional range, if provided, should be freely
     * available as part of larger named range the customer has allocated to the Service
     * Networking peering. If this is not provided, Apigee will automatically request for any
     * available /22 CIDR block from Service Networking. The customer should use this CIDR block
     * for configuring their firewall needs to allow traffic from Apigee.
     * Input format: &#34;a.b.c.d/22&#34;
     * 
     */
    public Output<Optional<String>> ipRange() {
        return Codegen.optional(this.ipRange);
    }
    /**
     * Required. Compute Engine location where the instance resides.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Required. Compute Engine location where the instance resides.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource ID of the instance.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource ID of the instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Apigee Organization associated with the Apigee instance,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return The Apigee Organization associated with the Apigee instance,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * The size of the CIDR block range that will be reserved by the instance. For valid values,
     * see [CidrRange](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances#CidrRange) on the documentation.
     * 
     */
    @Export(name="peeringCidrRange", type=String.class, parameters={})
    private Output<String> peeringCidrRange;

    /**
     * @return The size of the CIDR block range that will be reserved by the instance. For valid values,
     * see [CidrRange](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances#CidrRange) on the documentation.
     * 
     */
    public Output<String> peeringCidrRange() {
        return this.peeringCidrRange;
    }
    /**
     * Output only. Port number of the exposed Apigee endpoint.
     * 
     */
    @Export(name="port", type=String.class, parameters={})
    private Output<String> port;

    /**
     * @return Output only. Port number of the exposed Apigee endpoint.
     * 
     */
    public Output<String> port() {
        return this.port;
    }
    /**
     * Output only. Resource name of the service attachment created for the instance in
     * the format: projects/*{@literal /}regions/*{@literal /}serviceAttachments/* Apigee customers can privately
     * forward traffic to this service attachment using the PSC endpoints.
     * 
     */
    @Export(name="serviceAttachment", type=String.class, parameters={})
    private Output<String> serviceAttachment;

    /**
     * @return Output only. Resource name of the service attachment created for the instance in
     * the format: projects/*{@literal /}regions/*{@literal /}serviceAttachments/* Apigee customers can privately
     * forward traffic to this service attachment using the PSC endpoints.
     * 
     */
    public Output<String> serviceAttachment() {
        return this.serviceAttachment;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
