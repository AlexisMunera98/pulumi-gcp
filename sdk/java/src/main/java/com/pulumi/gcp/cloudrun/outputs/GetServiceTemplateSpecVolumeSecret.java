// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecVolumeSecretItem;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecVolumeSecret {
    private Integer defaultMode;
    private List<GetServiceTemplateSpecVolumeSecretItem> items;
    private String secretName;

    private GetServiceTemplateSpecVolumeSecret() {}
    public Integer defaultMode() {
        return this.defaultMode;
    }
    public List<GetServiceTemplateSpecVolumeSecretItem> items() {
        return this.items;
    }
    public String secretName() {
        return this.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecVolumeSecret defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer defaultMode;
        private List<GetServiceTemplateSpecVolumeSecretItem> items;
        private String secretName;
        public Builder() {}
        public Builder(GetServiceTemplateSpecVolumeSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.secretName = defaults.secretName;
        }

        @CustomType.Setter
        public Builder defaultMode(Integer defaultMode) {
            this.defaultMode = Objects.requireNonNull(defaultMode);
            return this;
        }
        @CustomType.Setter
        public Builder items(List<GetServiceTemplateSpecVolumeSecretItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetServiceTemplateSpecVolumeSecretItem... items) {
            return items(List.of(items));
        }
        @CustomType.Setter
        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public GetServiceTemplateSpecVolumeSecret build() {
            final var o = new GetServiceTemplateSpecVolumeSecret();
            o.defaultMode = defaultMode;
            o.items = items;
            o.secretName = secretName;
            return o;
        }
    }
}
