// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The text response message.
        /// Structure is documented below.
        /// </summary>
        [Input("text")]
        public Input<Inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs>? Text { get; set; }

        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs()
        {
        }
        public static new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs Empty => new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs();
    }
}
