// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Outputs
{

    [OutputType]
    public sealed class ZoneAssetStatus
    {
        public readonly int? ActiveAssets;
        public readonly int? SecurityPolicyApplyingAssets;
        /// <summary>
        /// Output only. The time when the zone was last updated.
        /// </summary>
        public readonly string? UpdateTime;

        [OutputConstructor]
        private ZoneAssetStatus(
            int? activeAssets,

            int? securityPolicyApplyingAssets,

            string? updateTime)
        {
            ActiveAssets = activeAssets;
            SecurityPolicyApplyingAssets = securityPolicyApplyingAssets;
            UpdateTime = updateTime;
        }
    }
}
