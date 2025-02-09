// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsIdentifyingFieldGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of a BigQuery field to be returned with the findings.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsIdentifyingFieldGetArgs()
        {
        }
        public static new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsIdentifyingFieldGetArgs Empty => new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsIdentifyingFieldGetArgs();
    }
}
