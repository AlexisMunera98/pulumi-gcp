// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudFunctionsV2.Outputs
{

    [OutputType]
    public sealed class GetFunctionBuildConfigSourceStorageSourceResult
    {
        public readonly string Bucket;
        public readonly int Generation;
        public readonly string Object;

        [OutputConstructor]
        private GetFunctionBuildConfigSourceStorageSourceResult(
            string bucket,

            int generation,

            string @object)
        {
            Bucket = bucket;
            Generation = generation;
            Object = @object;
        }
    }
}
