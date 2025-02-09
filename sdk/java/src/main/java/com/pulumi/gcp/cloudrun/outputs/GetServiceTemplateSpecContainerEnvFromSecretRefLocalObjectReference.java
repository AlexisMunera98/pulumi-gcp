// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference {
    /**
     * @return The name of the Cloud Run Service.
     * 
     */
    private String name;

    private GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference() {}
    /**
     * @return The name of the Cloud Run Service.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference build() {
            final var o = new GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference();
            o.name = name;
            return o;
        }
    }
}
