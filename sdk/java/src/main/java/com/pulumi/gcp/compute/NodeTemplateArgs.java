// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.NodeTemplateNodeTypeFlexibilityArgs;
import com.pulumi.gcp.compute.inputs.NodeTemplateServerBindingArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTemplateArgs Empty = new NodeTemplateArgs();

    /**
     * CPU overcommit.
     * Default value is `NONE`.
     * Possible values are `ENABLED` and `NONE`.
     * 
     */
    @Import(name="cpuOvercommitType")
    private @Nullable Output<String> cpuOvercommitType;

    /**
     * @return CPU overcommit.
     * Default value is `NONE`.
     * Possible values are `ENABLED` and `NONE`.
     * 
     */
    public Optional<Output<String>> cpuOvercommitType() {
        return Optional.ofNullable(this.cpuOvercommitType);
    }

    /**
     * An optional textual description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional textual description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Labels to use for node affinity, which will be used in
     * instance scheduling.
     * 
     */
    @Import(name="nodeAffinityLabels")
    private @Nullable Output<Map<String,String>> nodeAffinityLabels;

    /**
     * @return Labels to use for node affinity, which will be used in
     * instance scheduling.
     * 
     */
    public Optional<Output<Map<String,String>>> nodeAffinityLabels() {
        return Optional.ofNullable(this.nodeAffinityLabels);
    }

    /**
     * Node type to use for nodes group that are created from this template.
     * Only one of nodeTypeFlexibility and nodeType can be specified.
     * 
     */
    @Import(name="nodeType")
    private @Nullable Output<String> nodeType;

    /**
     * @return Node type to use for nodes group that are created from this template.
     * Only one of nodeTypeFlexibility and nodeType can be specified.
     * 
     */
    public Optional<Output<String>> nodeType() {
        return Optional.ofNullable(this.nodeType);
    }

    /**
     * Flexible properties for the desired node type. Node groups that
     * use this node template will create nodes of a type that matches
     * these properties. Only one of nodeTypeFlexibility and nodeType can
     * be specified.
     * Structure is documented below.
     * 
     */
    @Import(name="nodeTypeFlexibility")
    private @Nullable Output<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility;

    /**
     * @return Flexible properties for the desired node type. Node groups that
     * use this node template will create nodes of a type that matches
     * these properties. Only one of nodeTypeFlexibility and nodeType can
     * be specified.
     * Structure is documented below.
     * 
     */
    public Optional<Output<NodeTemplateNodeTypeFlexibilityArgs>> nodeTypeFlexibility() {
        return Optional.ofNullable(this.nodeTypeFlexibility);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Region where nodes using the node template will be created.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region where nodes using the node template will be created.
     * If it is not provided, the provider region is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The server binding policy for nodes using this template. Determines
     * where the nodes should restart following a maintenance event.
     * Structure is documented below.
     * 
     */
    @Import(name="serverBinding")
    private @Nullable Output<NodeTemplateServerBindingArgs> serverBinding;

    /**
     * @return The server binding policy for nodes using this template. Determines
     * where the nodes should restart following a maintenance event.
     * Structure is documented below.
     * 
     */
    public Optional<Output<NodeTemplateServerBindingArgs>> serverBinding() {
        return Optional.ofNullable(this.serverBinding);
    }

    private NodeTemplateArgs() {}

    private NodeTemplateArgs(NodeTemplateArgs $) {
        this.cpuOvercommitType = $.cpuOvercommitType;
        this.description = $.description;
        this.name = $.name;
        this.nodeAffinityLabels = $.nodeAffinityLabels;
        this.nodeType = $.nodeType;
        this.nodeTypeFlexibility = $.nodeTypeFlexibility;
        this.project = $.project;
        this.region = $.region;
        this.serverBinding = $.serverBinding;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTemplateArgs $;

        public Builder() {
            $ = new NodeTemplateArgs();
        }

        public Builder(NodeTemplateArgs defaults) {
            $ = new NodeTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpuOvercommitType CPU overcommit.
         * Default value is `NONE`.
         * Possible values are `ENABLED` and `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder cpuOvercommitType(@Nullable Output<String> cpuOvercommitType) {
            $.cpuOvercommitType = cpuOvercommitType;
            return this;
        }

        /**
         * @param cpuOvercommitType CPU overcommit.
         * Default value is `NONE`.
         * Possible values are `ENABLED` and `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder cpuOvercommitType(String cpuOvercommitType) {
            return cpuOvercommitType(Output.of(cpuOvercommitType));
        }

        /**
         * @param description An optional textual description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional textual description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeAffinityLabels Labels to use for node affinity, which will be used in
         * instance scheduling.
         * 
         * @return builder
         * 
         */
        public Builder nodeAffinityLabels(@Nullable Output<Map<String,String>> nodeAffinityLabels) {
            $.nodeAffinityLabels = nodeAffinityLabels;
            return this;
        }

        /**
         * @param nodeAffinityLabels Labels to use for node affinity, which will be used in
         * instance scheduling.
         * 
         * @return builder
         * 
         */
        public Builder nodeAffinityLabels(Map<String,String> nodeAffinityLabels) {
            return nodeAffinityLabels(Output.of(nodeAffinityLabels));
        }

        /**
         * @param nodeType Node type to use for nodes group that are created from this template.
         * Only one of nodeTypeFlexibility and nodeType can be specified.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(@Nullable Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType Node type to use for nodes group that are created from this template.
         * Only one of nodeTypeFlexibility and nodeType can be specified.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
        }

        /**
         * @param nodeTypeFlexibility Flexible properties for the desired node type. Node groups that
         * use this node template will create nodes of a type that matches
         * these properties. Only one of nodeTypeFlexibility and nodeType can
         * be specified.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeFlexibility(@Nullable Output<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility) {
            $.nodeTypeFlexibility = nodeTypeFlexibility;
            return this;
        }

        /**
         * @param nodeTypeFlexibility Flexible properties for the desired node type. Node groups that
         * use this node template will create nodes of a type that matches
         * these properties. Only one of nodeTypeFlexibility and nodeType can
         * be specified.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeFlexibility(NodeTemplateNodeTypeFlexibilityArgs nodeTypeFlexibility) {
            return nodeTypeFlexibility(Output.of(nodeTypeFlexibility));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region Region where nodes using the node template will be created.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region where nodes using the node template will be created.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param serverBinding The server binding policy for nodes using this template. Determines
         * where the nodes should restart following a maintenance event.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder serverBinding(@Nullable Output<NodeTemplateServerBindingArgs> serverBinding) {
            $.serverBinding = serverBinding;
            return this;
        }

        /**
         * @param serverBinding The server binding policy for nodes using this template. Determines
         * where the nodes should restart following a maintenance event.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder serverBinding(NodeTemplateServerBindingArgs serverBinding) {
            return serverBinding(Output.of(serverBinding));
        }

        public NodeTemplateArgs build() {
            return $;
        }
    }

}
