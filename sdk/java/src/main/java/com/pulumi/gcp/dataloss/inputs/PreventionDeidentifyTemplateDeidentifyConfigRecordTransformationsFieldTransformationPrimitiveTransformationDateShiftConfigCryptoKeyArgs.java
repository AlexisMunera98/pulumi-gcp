// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs();

    /**
     * KMS wrapped key.
     * Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     * For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key).
     * Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     * Structure is documented below.
     * 
     */
    @Import(name="kmsWrapped")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs> kmsWrapped;

    /**
     * @return KMS wrapped key.
     * Include to use an existing data crypto key wrapped by KMS. The wrapped key must be a 128-, 192-, or 256-bit key. Authorization requires the following IAM permissions when sending a request to perform a crypto transformation using a KMS-wrapped crypto key: dlp.kms.encrypt
     * For more information, see [Creating a wrapped key](https://cloud.google.com/dlp/docs/create-wrapped-key).
     * Note: When you use Cloud KMS for cryptographic operations, [charges apply](https://cloud.google.com/kms/pricing).
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs>> kmsWrapped() {
        return Optional.ofNullable(this.kmsWrapped);
    }

    /**
     * Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes.
     * Structure is documented below.
     * 
     */
    @Import(name="transient")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs> transient_;

    /**
     * @return Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs>> transient_() {
        return Optional.ofNullable(this.transient_);
    }

    /**
     * Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible.
     * Structure is documented below.
     * 
     */
    @Import(name="unwrapped")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs> unwrapped;

    /**
     * @return Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs>> unwrapped() {
        return Optional.ofNullable(this.unwrapped);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs $) {
        this.kmsWrapped = $.kmsWrapped;
        this.transient_ = $.transient_;
        this.unwrapped = $.unwrapped;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs(Objects.requireNonNull(defaults));
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
        public Builder kmsWrapped(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs> kmsWrapped) {
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
        public Builder kmsWrapped(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyKmsWrappedArgs kmsWrapped) {
            return kmsWrapped(Output.of(kmsWrapped));
        }

        /**
         * @param transient_ Transient crypto key. Use this to have a random data crypto key generated. It will be discarded after the request finishes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder transient_(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs> transient_) {
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
        public Builder transient_(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyTransientArgs transient_) {
            return transient_(Output.of(transient_));
        }

        /**
         * @param unwrapped Unwrapped crypto key. Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder unwrapped(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs> unwrapped) {
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
        public Builder unwrapped(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyUnwrappedArgs unwrapped) {
            return unwrapped(Output.of(unwrapped));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationDateShiftConfigCryptoKeyArgs build() {
            return $;
        }
    }

}
