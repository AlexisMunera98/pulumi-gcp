// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateSpecContainerPort {
    /**
     * @return Port number the container listens on. This must be a valid port number (between 1 and 65535). Defaults to &#34;8080&#34;.
     * 
     */
    private @Nullable Integer containerPort;
    /**
     * @return If specified, used to specify which protocol to use. Allowed values are &#34;http1&#34; (HTTP/1) and &#34;h2c&#34; (HTTP/2 end-to-end). Defaults to &#34;http1&#34;.
     * 
     */
    private @Nullable String name;
    /**
     * @return Protocol for port. Must be &#34;TCP&#34;. Defaults to &#34;TCP&#34;.
     * 
     */
    private @Nullable String protocol;

    private ServiceTemplateSpecContainerPort() {}
    /**
     * @return Port number the container listens on. This must be a valid port number (between 1 and 65535). Defaults to &#34;8080&#34;.
     * 
     */
    public Optional<Integer> containerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    /**
     * @return If specified, used to specify which protocol to use. Allowed values are &#34;http1&#34; (HTTP/1) and &#34;h2c&#34; (HTTP/2 end-to-end). Defaults to &#34;http1&#34;.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Protocol for port. Must be &#34;TCP&#34;. Defaults to &#34;TCP&#34;.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer containerPort;
        private @Nullable String name;
        private @Nullable String protocol;
        public Builder() {}
        public Builder(ServiceTemplateSpecContainerPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public ServiceTemplateSpecContainerPort build() {
            final var o = new ServiceTemplateSpecContainerPort();
            o.containerPort = containerPort;
            o.name = name;
            o.protocol = protocol;
            return o;
        }
    }
}
