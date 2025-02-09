// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiIndexDeployedIndexArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the DeployedIndex in the above IndexEndpoint.
        /// </summary>
        [Input("deployedIndexId")]
        public Input<string>? DeployedIndexId { get; set; }

        /// <summary>
        /// A resource name of the IndexEndpoint.
        /// </summary>
        [Input("indexEndpoint")]
        public Input<string>? IndexEndpoint { get; set; }

        public AiIndexDeployedIndexArgs()
        {
        }
        public static new AiIndexDeployedIndexArgs Empty => new AiIndexDeployedIndexArgs();
    }
}
