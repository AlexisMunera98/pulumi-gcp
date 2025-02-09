// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryBigqueryTableSpecViewSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryTableSpecViewSpecArgs Empty = new EntryBigqueryTableSpecViewSpecArgs();

    /**
     * The query that defines the table view.
     * 
     */
    @Import(name="viewQuery")
    private @Nullable Output<String> viewQuery;

    /**
     * @return The query that defines the table view.
     * 
     */
    public Optional<Output<String>> viewQuery() {
        return Optional.ofNullable(this.viewQuery);
    }

    private EntryBigqueryTableSpecViewSpecArgs() {}

    private EntryBigqueryTableSpecViewSpecArgs(EntryBigqueryTableSpecViewSpecArgs $) {
        this.viewQuery = $.viewQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryBigqueryTableSpecViewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryBigqueryTableSpecViewSpecArgs $;

        public Builder() {
            $ = new EntryBigqueryTableSpecViewSpecArgs();
        }

        public Builder(EntryBigqueryTableSpecViewSpecArgs defaults) {
            $ = new EntryBigqueryTableSpecViewSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param viewQuery The query that defines the table view.
         * 
         * @return builder
         * 
         */
        public Builder viewQuery(@Nullable Output<String> viewQuery) {
            $.viewQuery = viewQuery;
            return this;
        }

        /**
         * @param viewQuery The query that defines the table view.
         * 
         * @return builder
         * 
         */
        public Builder viewQuery(String viewQuery) {
            return viewQuery(Output.of(viewQuery));
        }

        public EntryBigqueryTableSpecViewSpecArgs build() {
            return $;
        }
    }

}
