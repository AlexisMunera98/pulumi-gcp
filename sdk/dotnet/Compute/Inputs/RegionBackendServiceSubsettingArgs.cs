// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class RegionBackendServiceSubsettingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The algorithm used for subsetting.
        /// Possible values are `CONSISTENT_HASH_SUBSETTING`.
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        public RegionBackendServiceSubsettingArgs()
        {
        }
        public static new RegionBackendServiceSubsettingArgs Empty => new RegionBackendServiceSubsettingArgs();
    }
}
