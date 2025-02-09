// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTrafficArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTrafficArgs Empty = new ServiceTrafficArgs();

    /**
     * Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    @Import(name="percent")
    private @Nullable Output<Integer> percent;

    /**
     * @return Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    public Optional<Output<Integer>> percent() {
        return Optional.ofNullable(this.percent);
    }

    /**
     * Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    @Import(name="revision")
    private @Nullable Output<String> revision;

    /**
     * @return Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    public Optional<Output<String>> revision() {
        return Optional.ofNullable(this.revision);
    }

    /**
     * Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * The allocation type for this traffic target.
     * Possible values are `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST` and `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The allocation type for this traffic target.
     * Possible values are `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST` and `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ServiceTrafficArgs() {}

    private ServiceTrafficArgs(ServiceTrafficArgs $) {
        this.percent = $.percent;
        this.revision = $.revision;
        this.tag = $.tag;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTrafficArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTrafficArgs $;

        public Builder() {
            $ = new ServiceTrafficArgs();
        }

        public Builder(ServiceTrafficArgs defaults) {
            $ = new ServiceTrafficArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param percent Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder percent(@Nullable Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        /**
         * @param percent Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        /**
         * @param revision Revision to which to send this portion of traffic, if traffic allocation is by revision.
         * 
         * @return builder
         * 
         */
        public Builder revision(@Nullable Output<String> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision Revision to which to send this portion of traffic, if traffic allocation is by revision.
         * 
         * @return builder
         * 
         */
        public Builder revision(String revision) {
            return revision(Output.of(revision));
        }

        /**
         * @param tag Indicates a string to be part of the URI to exclusively reference this target.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag Indicates a string to be part of the URI to exclusively reference this target.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param type The allocation type for this traffic target.
         * Possible values are `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST` and `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The allocation type for this traffic target.
         * Possible values are `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST` and `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceTrafficArgs build() {
            return $;
        }
    }

}
