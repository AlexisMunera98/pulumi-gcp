// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class AttachedClusterLoggingConfigComponentConfig
    {
        /// <summary>
        /// The components to be enabled.
        /// Each value may be one of `SYSTEM_COMPONENTS` and `WORKLOADS`.
        /// </summary>
        public readonly ImmutableArray<string> EnableComponents;

        [OutputConstructor]
        private AttachedClusterLoggingConfigComponentConfig(ImmutableArray<string> enableComponents)
        {
            EnableComponents = enableComponents;
        }
    }
}
