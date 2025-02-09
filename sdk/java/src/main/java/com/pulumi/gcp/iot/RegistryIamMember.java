// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.iot.RegistryIamMemberArgs;
import com.pulumi.gcp.iot.inputs.RegistryIamMemberState;
import com.pulumi.gcp.iot.outputs.RegistryIamMemberCondition;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Cloud IoT Core DeviceRegistry. Each of these resources serves a different use case:
 * 
 * * `gcp.iot.RegistryIamPolicy`: Authoritative. Sets the IAM policy for the deviceregistry and replaces any existing policy already attached.
 * * `gcp.iot.RegistryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the deviceregistry are preserved.
 * * `gcp.iot.RegistryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the deviceregistry are preserved.
 * 
 * &gt; **Note:** `gcp.iot.RegistryIamPolicy` **cannot** be used in conjunction with `gcp.iot.RegistryIamBinding` and `gcp.iot.RegistryIamMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.iot.RegistryIamBinding` resources **can be** used in conjunction with `gcp.iot.RegistryIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_cloudiot\_registry\_iam\_policy
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
 * import com.pulumi.gcp.iot.RegistryIamPolicy;
 * import com.pulumi.gcp.iot.RegistryIamPolicyArgs;
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
 *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBindingArgs.builder()
 *                 .role(&#34;roles/viewer&#34;)
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         var policy = new RegistryIamPolicy(&#34;policy&#34;, RegistryIamPolicyArgs.builder()        
 *             .project(google_cloudiot_registry.test-registry().project())
 *             .region(google_cloudiot_registry.test-registry().region())
 *             .policyData(admin.applyValue(getIAMPolicyResult -&gt; getIAMPolicyResult.policyData()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_cloudiot\_registry\_iam\_binding
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iot.RegistryIamBinding;
 * import com.pulumi.gcp.iot.RegistryIamBindingArgs;
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
 *         var binding = new RegistryIamBinding(&#34;binding&#34;, RegistryIamBindingArgs.builder()        
 *             .project(google_cloudiot_registry.test-registry().project())
 *             .region(google_cloudiot_registry.test-registry().region())
 *             .role(&#34;roles/viewer&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_cloudiot\_registry\_iam\_member
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iot.RegistryIamMember;
 * import com.pulumi.gcp.iot.RegistryIamMemberArgs;
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
 *         var member = new RegistryIamMember(&#34;member&#34;, RegistryIamMemberArgs.builder()        
 *             .project(google_cloudiot_registry.test-registry().project())
 *             .region(google_cloudiot_registry.test-registry().region())
 *             .role(&#34;roles/viewer&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms* projects/{{project}}/locations/{{location}}/registries/{{name}} * {{project}}/{{location}}/{{name}} * {{location}}/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Cloud IoT Core deviceregistry IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iot/registryIamMember:RegistryIamMember editor &#34;projects/{{project}}/locations/{{location}}/registries/{{device_registry}} roles/viewer user:jane@example.com&#34;
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iot/registryIamMember:RegistryIamMember editor &#34;projects/{{project}}/locations/{{location}}/registries/{{device_registry}} roles/viewer&#34;
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iot/registryIamMember:RegistryIamMember editor projects/{{project}}/locations/{{location}}/registries/{{device_registry}}
 * ```
 * 
 *  -&gt; **Custom Roles**If you&#39;re importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:iot/registryIamMember:RegistryIamMember")
public class RegistryIamMember extends com.pulumi.resources.CustomResource {
    @Export(name="condition", type=RegistryIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ RegistryIamMemberCondition> condition;

    public Output<Optional<RegistryIamMemberCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region in which the created registry should reside.
     * If it is not provided, the provider region is used.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region in which the created registry should reside.
     * If it is not provided, the provider region is used.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.iot.RegistryIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.iot.RegistryIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryIamMember(String name) {
        this(name, RegistryIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryIamMember(String name, RegistryIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryIamMember(String name, RegistryIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iot/registryIamMember:RegistryIamMember", name, args == null ? RegistryIamMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegistryIamMember(String name, Output<String> id, @Nullable RegistryIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iot/registryIamMember:RegistryIamMember", name, state, makeResourceOptions(options, id));
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
    public static RegistryIamMember get(String name, Output<String> id, @Nullable RegistryIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegistryIamMember(name, id, state, options);
    }
}
