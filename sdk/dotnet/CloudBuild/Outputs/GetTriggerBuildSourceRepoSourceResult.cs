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
    public sealed class GetTriggerBuildSourceRepoSourceResult
    {
        public readonly string BranchName;
        public readonly string CommitSha;
        public readonly string Dir;
        public readonly bool InvertRegex;
        public readonly string ProjectId;
        public readonly string RepoName;
        public readonly ImmutableDictionary<string, string> Substitutions;
        public readonly string TagName;

        [OutputConstructor]
        private GetTriggerBuildSourceRepoSourceResult(
            string branchName,

            string commitSha,

            string dir,

            bool invertRegex,

            string projectId,

            string repoName,

            ImmutableDictionary<string, string> substitutions,

            string tagName)
        {
            BranchName = branchName;
            CommitSha = commitSha;
            Dir = dir;
            InvertRegex = invertRegex;
            ProjectId = projectId;
            RepoName = repoName;
            Substitutions = substitutions;
            TagName = tagName;
        }
    }
}
