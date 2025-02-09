// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BucketIAMPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketIAMPolicyArgs Empty = new BucketIAMPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    private BucketIAMPolicyArgs() {}

    private BucketIAMPolicyArgs(BucketIAMPolicyArgs $) {
        this.bucket = $.bucket;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketIAMPolicyArgs $;

        public Builder() {
            $ = new BucketIAMPolicyArgs();
        }

        public Builder(BucketIAMPolicyArgs defaults) {
            $ = new BucketIAMPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public BucketIAMPolicyArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}
