// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerEnvFromConfigMapRef;
import com.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerEnvFromSecretRef;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateSpecContainerEnvFrom {
    /**
     * @return The ConfigMap to select from.
     * Structure is documented below.
     * 
     */
    private @Nullable ServiceTemplateSpecContainerEnvFromConfigMapRef configMapRef;
    /**
     * @return An optional identifier to prepend to each key in the ConfigMap.
     * 
     */
    private @Nullable String prefix;
    /**
     * @return The Secret to select from.
     * Structure is documented below.
     * 
     */
    private @Nullable ServiceTemplateSpecContainerEnvFromSecretRef secretRef;

    private ServiceTemplateSpecContainerEnvFrom() {}
    /**
     * @return The ConfigMap to select from.
     * Structure is documented below.
     * 
     */
    public Optional<ServiceTemplateSpecContainerEnvFromConfigMapRef> configMapRef() {
        return Optional.ofNullable(this.configMapRef);
    }
    /**
     * @return An optional identifier to prepend to each key in the ConfigMap.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return The Secret to select from.
     * Structure is documented below.
     * 
     */
    public Optional<ServiceTemplateSpecContainerEnvFromSecretRef> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFrom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServiceTemplateSpecContainerEnvFromConfigMapRef configMapRef;
        private @Nullable String prefix;
        private @Nullable ServiceTemplateSpecContainerEnvFromSecretRef secretRef;
        public Builder() {}
        public Builder(ServiceTemplateSpecContainerEnvFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapRef = defaults.configMapRef;
    	      this.prefix = defaults.prefix;
    	      this.secretRef = defaults.secretRef;
        }

        @CustomType.Setter
        public Builder configMapRef(@Nullable ServiceTemplateSpecContainerEnvFromConfigMapRef configMapRef) {
            this.configMapRef = configMapRef;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder secretRef(@Nullable ServiceTemplateSpecContainerEnvFromSecretRef secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public ServiceTemplateSpecContainerEnvFrom build() {
            final var o = new ServiceTemplateSpecContainerEnvFrom();
            o.configMapRef = configMapRef;
            o.prefix = prefix;
            o.secretRef = secretRef;
            return o;
        }
    }
}
