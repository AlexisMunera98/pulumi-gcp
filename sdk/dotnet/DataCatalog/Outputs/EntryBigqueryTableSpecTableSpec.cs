// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataCatalog.Outputs
{

    [OutputType]
    public sealed class EntryBigqueryTableSpecTableSpec
    {
        /// <summary>
        /// If the table is a dated shard, i.e., with name pattern [prefix]YYYYMMDD, groupedEntry is the
        /// Data Catalog resource name of the date sharded grouped entry, for example,
        /// projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}.
        /// Otherwise, groupedEntry is empty.
        /// </summary>
        public readonly string? GroupedEntry;

        [OutputConstructor]
        private EntryBigqueryTableSpecTableSpec(string? groupedEntry)
        {
            GroupedEntry = groupedEntry;
        }
    }
}
