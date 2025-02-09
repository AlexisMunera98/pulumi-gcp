// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs();

    /**
     * KMS wrapped key.
     * Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     * For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key).
     * Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     * Structure is documented below.
     * 
     */
    @Import(name="kmsWrapped")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs> kmsWrapped;

    /**
     * @return KMS wrapped key.
     * Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     * For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key).
     * Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs>> kmsWrapped() {
        return Optional.ofNullable(this.kmsWrapped);
    }

    /**
     * Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes.
     * Structure is documented below.
     * 
     */
    @Import(name="transient")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs> transient_;

    /**
     * @return Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs>> transient_() {
        return Optional.ofNullable(this.transient_);
    }

    /**
     * Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible.
     * Structure is documented below.
     * 
     */
    @Import(name="unwrapped")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs> unwrapped;

    /**
     * @return Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs>> unwrapped() {
        return Optional.ofNullable(this.unwrapped);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs $) {
        this.kmsWrapped = $.kmsWrapped;
        this.transient_ = $.transient_;
        this.unwrapped = $.unwrapped;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsWrapped KMS wrapped key.
         * Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
         * For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key).
         * Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder kmsWrapped(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs> kmsWrapped) {
            $.kmsWrapped = kmsWrapped;
            return this;
        }

        /**
         * @param kmsWrapped KMS wrapped key.
         * Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
         * For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key).
         * Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder kmsWrapped(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyKmsWrappedArgs kmsWrapped) {
            return kmsWrapped(Output.of(kmsWrapped));
        }

        /**
         * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder transient_(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs> transient_) {
            $.transient_ = transient_;
            return this;
        }

        /**
         * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder transient_(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyTransientArgs transient_) {
            return transient_(Output.of(transient_));
        }

        /**
         * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder unwrapped(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs> unwrapped) {
            $.unwrapped = unwrapped;
            return this;
        }

        /**
         * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder unwrapped(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyUnwrappedArgs unwrapped) {
            return unwrapped(Output.of(unwrapped));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationCryptoHashConfigCryptoKeyArgs build() {
            return $;
        }
    }

}
