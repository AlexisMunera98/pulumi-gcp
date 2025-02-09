// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs Empty = new RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs();

    /**
     * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 308, 404, 405, 410, 421, 451 and 501
     * can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    @Import(name="code")
    private @Nullable Output<Integer> code;

    /**
     * @return The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 308, 404, 405, 410, 421, 451 and 501
     * can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    public Optional<Output<Integer>> code() {
        return Optional.ofNullable(this.code);
    }

    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs() {}

    private RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs(RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs $) {
        this.code = $.code;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs $;

        public Builder() {
            $ = new RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs();
        }

        public Builder(RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs defaults) {
            $ = new RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 308, 404, 405, 410, 421, 451 and 501
         * can be specified as values, and you cannot specify a status code more than once.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<Integer> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 308, 404, 405, 410, 421, 451 and 501
         * can be specified as values, and you cannot specify a status code more than once.
         * 
         * @return builder
         * 
         */
        public Builder code(Integer code) {
            return code(Output.of(code));
        }

        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        public RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs build() {
            return $;
        }
    }

}
