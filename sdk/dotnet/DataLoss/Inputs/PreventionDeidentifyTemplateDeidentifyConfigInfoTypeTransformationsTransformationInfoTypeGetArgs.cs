// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the information type.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs()
        {
        }
        public static new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs Empty => new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationInfoTypeGetArgs();
    }
}
