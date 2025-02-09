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
    public sealed class ServiceAttachmentConnectedEndpoint
    {
        /// <summary>
        /// The URL of the consumer forwarding rule.
        /// </summary>
        public readonly string? Endpoint;
        /// <summary>
        /// The status of the connection from the consumer forwarding rule to
        /// this service attachment.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private ServiceAttachmentConnectedEndpoint(
            string? endpoint,

            string? status)
        {
            Endpoint = endpoint;
            Status = status;
        }
    }
}
