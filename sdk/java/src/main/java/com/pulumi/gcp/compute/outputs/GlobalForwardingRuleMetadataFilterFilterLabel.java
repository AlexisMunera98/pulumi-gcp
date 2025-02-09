// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GlobalForwardingRuleMetadataFilterFilterLabel {
    /**
     * @return Name of the metadata label. The length must be between
     * 1 and 1024 characters, inclusive.
     * 
     */
    private String name;
    /**
     * @return The value that the label must match. The value has a maximum
     * length of 1024 characters.
     * 
     */
    private String value;

    private GlobalForwardingRuleMetadataFilterFilterLabel() {}
    /**
     * @return Name of the metadata label. The length must be between
     * 1 and 1024 characters, inclusive.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value that the label must match. The value has a maximum
     * length of 1024 characters.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalForwardingRuleMetadataFilterFilterLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        public Builder() {}
        public Builder(GlobalForwardingRuleMetadataFilterFilterLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GlobalForwardingRuleMetadataFilterFilterLabel build() {
            final var o = new GlobalForwardingRuleMetadataFilterFilterLabel();
            o.name = name;
            o.value = value;
            return o;
        }
    }
}
