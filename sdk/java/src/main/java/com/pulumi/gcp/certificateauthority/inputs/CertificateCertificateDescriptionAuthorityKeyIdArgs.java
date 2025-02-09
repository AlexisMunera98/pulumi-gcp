// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionAuthorityKeyIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionAuthorityKeyIdArgs Empty = new CertificateCertificateDescriptionAuthorityKeyIdArgs();

    /**
     * Optional. The value of this KeyId encoded in lowercase hexadecimal. This is most likely the 160 bit SHA-1 hash of the public key.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return Optional. The value of this KeyId encoded in lowercase hexadecimal. This is most likely the 160 bit SHA-1 hash of the public key.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    private CertificateCertificateDescriptionAuthorityKeyIdArgs() {}

    private CertificateCertificateDescriptionAuthorityKeyIdArgs(CertificateCertificateDescriptionAuthorityKeyIdArgs $) {
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateDescriptionAuthorityKeyIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateDescriptionAuthorityKeyIdArgs $;

        public Builder() {
            $ = new CertificateCertificateDescriptionAuthorityKeyIdArgs();
        }

        public Builder(CertificateCertificateDescriptionAuthorityKeyIdArgs defaults) {
            $ = new CertificateCertificateDescriptionAuthorityKeyIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyId Optional. The value of this KeyId encoded in lowercase hexadecimal. This is most likely the 160 bit SHA-1 hash of the public key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId Optional. The value of this KeyId encoded in lowercase hexadecimal. This is most likely the 160 bit SHA-1 hash of the public key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public CertificateCertificateDescriptionAuthorityKeyIdArgs build() {
            return $;
        }
    }

}
