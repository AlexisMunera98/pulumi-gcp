// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memcache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceMemcacheNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMemcacheNodeArgs Empty = new InstanceMemcacheNodeArgs();

    /**
     * Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
     * 
     */
    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    /**
     * @return Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
     * 
     */
    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    /**
     * The port number of the Memcached server on this node.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number of the Memcached server on this node.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Current state of the Memcached node.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Current state of the Memcached node.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Location (GCP Zone) for the Memcached node.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return Location (GCP Zone) for the Memcached node.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceMemcacheNodeArgs() {}

    private InstanceMemcacheNodeArgs(InstanceMemcacheNodeArgs $) {
        this.host = $.host;
        this.nodeId = $.nodeId;
        this.port = $.port;
        this.state = $.state;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceMemcacheNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceMemcacheNodeArgs $;

        public Builder() {
            $ = new InstanceMemcacheNodeArgs();
        }

        public Builder(InstanceMemcacheNodeArgs defaults) {
            $ = new InstanceMemcacheNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param nodeId Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param nodeId Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        /**
         * @param port The port number of the Memcached server on this node.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number of the Memcached server on this node.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param state Current state of the Memcached node.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Current state of the Memcached node.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param zone Location (GCP Zone) for the Memcached node.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone Location (GCP Zone) for the Memcached node.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceMemcacheNodeArgs build() {
            return $;
        }
    }

}
