// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceMetadata {
    private @Nullable Map<String,String> annotations;
    /**
     * @return A sequence number representing a specific generation of the desired state.
     * 
     */
    private @Nullable Integer generation;
    /**
     * @return Map of string keys and values that can be used to organize and categorize
     * (scope and select) objects. May match selectors of replication controllers
     * and routes.
     * More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    private @Nullable Map<String,String> labels;
    /**
     * @return In Cloud Run the namespace must be equal to either the
     * project ID or project number.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return An opaque value that represents the internal version of this object that
     * can be used by clients to determine when objects have changed. May be used
     * for optimistic concurrency, change detection, and the watch operation on a
     * resource or set of resources. They may only be valid for a
     * particular resource or set of resources.
     * More info:
     * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    private @Nullable String resourceVersion;
    /**
     * @return SelfLink is a URL representing this object.
     * 
     */
    private @Nullable String selfLink;
    /**
     * @return UID is a unique id generated by the server on successful creation of a resource and is not
     * allowed to change on PUT operations.
     * More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    private @Nullable String uid;

    private ServiceMetadata() {}
    public Map<String,String> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    /**
     * @return A sequence number representing a specific generation of the desired state.
     * 
     */
    public Optional<Integer> generation() {
        return Optional.ofNullable(this.generation);
    }
    /**
     * @return Map of string keys and values that can be used to organize and categorize
     * (scope and select) objects. May match selectors of replication controllers
     * and routes.
     * More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return In Cloud Run the namespace must be equal to either the
     * project ID or project number.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return An opaque value that represents the internal version of this object that
     * can be used by clients to determine when objects have changed. May be used
     * for optimistic concurrency, change detection, and the watch operation on a
     * resource or set of resources. They may only be valid for a
     * particular resource or set of resources.
     * More info:
     * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    public Optional<String> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }
    /**
     * @return SelfLink is a URL representing this object.
     * 
     */
    public Optional<String> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }
    /**
     * @return UID is a unique id generated by the server on successful creation of a resource and is not
     * allowed to change on PUT operations.
     * More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> annotations;
        private @Nullable Integer generation;
        private @Nullable Map<String,String> labels;
        private @Nullable String namespace;
        private @Nullable String resourceVersion;
        private @Nullable String selfLink;
        private @Nullable String uid;
        public Builder() {}
        public Builder(ServiceMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.namespace = defaults.namespace;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder generation(@Nullable Integer generation) {
            this.generation = generation;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder resourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        public ServiceMetadata build() {
            final var o = new ServiceMetadata();
            o.annotations = annotations;
            o.generation = generation;
            o.labels = labels;
            o.namespace = namespace;
            o.resourceVersion = resourceVersion;
            o.selfLink = selfLink;
            o.uid = uid;
            return o;
        }
    }
}
