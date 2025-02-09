// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiMetadataStoreStateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The disk utilization of the MetadataStore in bytes.
        /// </summary>
        [Input("diskUtilizationBytes")]
        public Input<string>? DiskUtilizationBytes { get; set; }

        public AiMetadataStoreStateArgs()
        {
        }
        public static new AiMetadataStoreStateArgs Empty => new AiMetadataStoreStateArgs();
    }
}
