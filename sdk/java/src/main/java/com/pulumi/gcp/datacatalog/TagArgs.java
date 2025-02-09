// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.TagFieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagArgs Empty = new TagArgs();

    /**
     * Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
     * individual column based on that schema.
     * For attaching a tag to a nested column, use `.` to separate the column names. Example:
     * `outer_column.inner_column`
     * 
     */
    @Import(name="column")
    private @Nullable Output<String> column;

    /**
     * @return Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
     * individual column based on that schema.
     * For attaching a tag to a nested column, use `.` to separate the column names. Example:
     * `outer_column.inner_column`
     * 
     */
    public Optional<Output<String>> column() {
        return Optional.ofNullable(this.column);
    }

    /**
     * This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    @Import(name="fields", required=true)
    private Output<List<TagFieldArgs>> fields;

    /**
     * @return This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    public Output<List<TagFieldArgs>> fields() {
        return this.fields;
    }

    /**
     * The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
     * all entries in that group.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
     * all entries in that group.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * The resource name of the tag template that this tag uses. Example:
     * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
     * This field cannot be modified after creation.
     * 
     */
    @Import(name="template", required=true)
    private Output<String> template;

    /**
     * @return The resource name of the tag template that this tag uses. Example:
     * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
     * This field cannot be modified after creation.
     * 
     */
    public Output<String> template() {
        return this.template;
    }

    private TagArgs() {}

    private TagArgs(TagArgs $) {
        this.column = $.column;
        this.fields = $.fields;
        this.parent = $.parent;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagArgs $;

        public Builder() {
            $ = new TagArgs();
        }

        public Builder(TagArgs defaults) {
            $ = new TagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param column Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
         * individual column based on that schema.
         * For attaching a tag to a nested column, use `.` to separate the column names. Example:
         * `outer_column.inner_column`
         * 
         * @return builder
         * 
         */
        public Builder column(@Nullable Output<String> column) {
            $.column = column;
            return this;
        }

        /**
         * @param column Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
         * individual column based on that schema.
         * For attaching a tag to a nested column, use `.` to separate the column names. Example:
         * `outer_column.inner_column`
         * 
         * @return builder
         * 
         */
        public Builder column(String column) {
            return column(Output.of(column));
        }

        /**
         * @param fields This maps the ID of a tag field to the value of and additional information about that field.
         * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fields(Output<List<TagFieldArgs>> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields This maps the ID of a tag field to the value of and additional information about that field.
         * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fields(List<TagFieldArgs> fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param fields This maps the ID of a tag field to the value of and additional information about that field.
         * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fields(TagFieldArgs... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param parent The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
         * all entries in that group.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
         * all entries in that group.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param template The resource name of the tag template that this tag uses. Example:
         * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
         * This field cannot be modified after creation.
         * 
         * @return builder
         * 
         */
        public Builder template(Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template The resource name of the tag template that this tag uses. Example:
         * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
         * This field cannot be modified after creation.
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        public TagArgs build() {
            $.fields = Objects.requireNonNull($.fields, "expected parameter 'fields' to be non-null");
            $.template = Objects.requireNonNull($.template, "expected parameter 'template' to be non-null");
            return $;
        }
    }

}
