// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiIndexIndexStatArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of shards in the Index.
        /// </summary>
        [Input("shardsCount")]
        public Input<int>? ShardsCount { get; set; }

        /// <summary>
        /// The number of vectors in the Index.
        /// </summary>
        [Input("vectorsCount")]
        public Input<string>? VectorsCount { get; set; }

        public AiIndexIndexStatArgs()
        {
        }
        public static new AiIndexIndexStatArgs Empty => new AiIndexIndexStatArgs();
    }
}
