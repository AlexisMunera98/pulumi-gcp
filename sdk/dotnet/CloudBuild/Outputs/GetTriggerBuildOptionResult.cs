// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Outputs
{

    [OutputType]
    public sealed class GetTriggerBuildOptionResult
    {
        public readonly int DiskSizeGb;
        public readonly bool DynamicSubstitutions;
        public readonly ImmutableArray<string> Envs;
        public readonly string LogStreamingOption;
        public readonly string Logging;
        public readonly string MachineType;
        public readonly string RequestedVerifyOption;
        public readonly ImmutableArray<string> SecretEnvs;
        public readonly ImmutableArray<string> SourceProvenanceHashes;
        public readonly string SubstitutionOption;
        public readonly ImmutableArray<Outputs.GetTriggerBuildOptionVolumeResult> Volumes;
        public readonly string WorkerPool;

        [OutputConstructor]
        private GetTriggerBuildOptionResult(
            int diskSizeGb,

            bool dynamicSubstitutions,

            ImmutableArray<string> envs,

            string logStreamingOption,

            string logging,

            string machineType,

            string requestedVerifyOption,

            ImmutableArray<string> secretEnvs,

            ImmutableArray<string> sourceProvenanceHashes,

            string substitutionOption,

            ImmutableArray<Outputs.GetTriggerBuildOptionVolumeResult> volumes,

            string workerPool)
        {
            DiskSizeGb = diskSizeGb;
            DynamicSubstitutions = dynamicSubstitutions;
            Envs = envs;
            LogStreamingOption = logStreamingOption;
            Logging = logging;
            MachineType = machineType;
            RequestedVerifyOption = requestedVerifyOption;
            SecretEnvs = secretEnvs;
            SourceProvenanceHashes = sourceProvenanceHashes;
            SubstitutionOption = substitutionOption;
            Volumes = volumes;
            WorkerPool = workerPool;
        }
    }
}
