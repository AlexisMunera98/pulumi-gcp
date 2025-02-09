// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun.Outputs
{

    [OutputType]
    public sealed class ServiceTemplateSpecContainerStartupProbeTcpSocket
    {
        /// <summary>
        /// Port number to access on the container. Number must be in the range 1 to 65535.
        /// </summary>
        public readonly int? Port;

        [OutputConstructor]
        private ServiceTemplateSpecContainerStartupProbeTcpSocket(int? port)
        {
            Port = port;
        }
    }
}
