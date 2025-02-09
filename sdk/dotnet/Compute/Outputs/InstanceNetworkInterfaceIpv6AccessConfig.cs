// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class InstanceNetworkInterfaceIpv6AccessConfig
    {
        public readonly string? ExternalIpv6;
        public readonly string? ExternalIpv6PrefixLength;
        /// <summary>
        /// The [networking tier][network-tier] used for configuring this instance.
        /// This field can take the following values: PREMIUM, FIXED_STANDARD or STANDARD. If this field is
        /// not specified, it is assumed to be PREMIUM.
        /// subnet has an external subnet. Only PREMIUM or STANDARD tier is valid for IPv6.
        /// </summary>
        public readonly string NetworkTier;
        /// <summary>
        /// The DNS domain name for the public PTR record.
        /// To set this field on an instance, you must be verified as the owner of the domain.
        /// See [the docs](https://cloud.google.com/compute/docs/instances/create-ptr-record) for how
        /// to become verified as a domain owner.
        /// records for the external IPv6 ranges..
        /// </summary>
        public readonly string? PublicPtrDomainName;

        [OutputConstructor]
        private InstanceNetworkInterfaceIpv6AccessConfig(
            string? externalIpv6,

            string? externalIpv6PrefixLength,

            string networkTier,

            string? publicPtrDomainName)
        {
            ExternalIpv6 = externalIpv6;
            ExternalIpv6PrefixLength = externalIpv6PrefixLength;
            NetworkTier = networkTier;
            PublicPtrDomainName = publicPtrDomainName;
        }
    }
}
