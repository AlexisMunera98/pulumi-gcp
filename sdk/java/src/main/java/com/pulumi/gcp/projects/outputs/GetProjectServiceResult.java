// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectServiceResult {
    private Boolean disableDependentServices;
    private Boolean disableOnDestroy;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String project;
    private String service;

    private GetProjectServiceResult() {}
    public Boolean disableDependentServices() {
        return this.disableDependentServices;
    }
    public Boolean disableOnDestroy() {
        return this.disableOnDestroy;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disableDependentServices;
        private Boolean disableOnDestroy;
        private String id;
        private @Nullable String project;
        private String service;
        public Builder() {}
        public Builder(GetProjectServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableDependentServices = defaults.disableDependentServices;
    	      this.disableOnDestroy = defaults.disableOnDestroy;
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder disableDependentServices(Boolean disableDependentServices) {
            this.disableDependentServices = Objects.requireNonNull(disableDependentServices);
            return this;
        }
        @CustomType.Setter
        public Builder disableOnDestroy(Boolean disableOnDestroy) {
            this.disableOnDestroy = Objects.requireNonNull(disableOnDestroy);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GetProjectServiceResult build() {
            final var o = new GetProjectServiceResult();
            o.disableDependentServices = disableDependentServices;
            o.disableOnDestroy = disableOnDestroy;
            o.id = id;
            o.project = project;
            o.service = service;
            return o;
        }
    }
}
