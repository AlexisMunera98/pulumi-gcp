// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.PubSub.Outputs
{

    [OutputType]
    public sealed class GetSubscriptionDeadLetterPolicyResult
    {
        public readonly string DeadLetterTopic;
        public readonly int MaxDeliveryAttempts;

        [OutputConstructor]
        private GetSubscriptionDeadLetterPolicyResult(
            string deadLetterTopic,

            int maxDeliveryAttempts)
        {
            DeadLetterTopic = deadLetterTopic;
            MaxDeliveryAttempts = maxDeliveryAttempts;
        }
    }
}
