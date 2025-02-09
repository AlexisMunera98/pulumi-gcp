// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Inputs
{

    public sealed class TriggerRepositoryEventConfigPullRequestGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Regex of branches to match.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// Whether to block builds on a "/gcbrun" comment from a repository owner or collaborator.
        /// Possible values are `COMMENTS_DISABLED`, `COMMENTS_ENABLED`, and `COMMENTS_ENABLED_FOR_EXTERNAL_CONTRIBUTORS_ONLY`.
        /// </summary>
        [Input("commentControl")]
        public Input<string>? CommentControl { get; set; }

        /// <summary>
        /// If true, branches that do NOT match the git_ref will trigger a build.
        /// </summary>
        [Input("invertRegex")]
        public Input<bool>? InvertRegex { get; set; }

        public TriggerRepositoryEventConfigPullRequestGetArgs()
        {
        }
        public static new TriggerRepositoryEventConfigPullRequestGetArgs Empty => new TriggerRepositoryEventConfigPullRequestGetArgs();
    }
}
