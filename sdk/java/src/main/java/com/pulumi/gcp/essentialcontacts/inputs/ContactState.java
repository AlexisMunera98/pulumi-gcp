// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.essentialcontacts.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContactState extends com.pulumi.resources.ResourceArgs {

    public static final ContactState Empty = new ContactState();

    /**
     * The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
     * 
     */
    @Import(name="languageTag")
    private @Nullable Output<String> languageTag;

    /**
     * @return The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
     * 
     */
    public Optional<Output<String>> languageTag() {
        return Optional.ofNullable(this.languageTag);
    }

    /**
     * The identifier for the contact. Format: {resourceType}/{resource_id}/contacts/{contact_id}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The identifier for the contact. Format: {resourceType}/{resource_id}/contacts/{contact_id}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The categories of notifications that the contact will receive communications for.
     * 
     */
    @Import(name="notificationCategorySubscriptions")
    private @Nullable Output<List<String>> notificationCategorySubscriptions;

    /**
     * @return The categories of notifications that the contact will receive communications for.
     * 
     */
    public Optional<Output<List<String>>> notificationCategorySubscriptions() {
        return Optional.ofNullable(this.notificationCategorySubscriptions);
    }

    /**
     * The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    private ContactState() {}

    private ContactState(ContactState $) {
        this.email = $.email;
        this.languageTag = $.languageTag;
        this.name = $.name;
        this.notificationCategorySubscriptions = $.notificationCategorySubscriptions;
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactState $;

        public Builder() {
            $ = new ContactState();
        }

        public Builder(ContactState defaults) {
            $ = new ContactState(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The email address to send notifications to. This does not need to be a Google account.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address to send notifications to. This does not need to be a Google account.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param languageTag The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
         * 
         * @return builder
         * 
         */
        public Builder languageTag(@Nullable Output<String> languageTag) {
            $.languageTag = languageTag;
            return this;
        }

        /**
         * @param languageTag The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
         * 
         * @return builder
         * 
         */
        public Builder languageTag(String languageTag) {
            return languageTag(Output.of(languageTag));
        }

        /**
         * @param name The identifier for the contact. Format: {resourceType}/{resource_id}/contacts/{contact_id}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The identifier for the contact. Format: {resourceType}/{resource_id}/contacts/{contact_id}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationCategorySubscriptions The categories of notifications that the contact will receive communications for.
         * 
         * @return builder
         * 
         */
        public Builder notificationCategorySubscriptions(@Nullable Output<List<String>> notificationCategorySubscriptions) {
            $.notificationCategorySubscriptions = notificationCategorySubscriptions;
            return this;
        }

        /**
         * @param notificationCategorySubscriptions The categories of notifications that the contact will receive communications for.
         * 
         * @return builder
         * 
         */
        public Builder notificationCategorySubscriptions(List<String> notificationCategorySubscriptions) {
            return notificationCategorySubscriptions(Output.of(notificationCategorySubscriptions));
        }

        /**
         * @param notificationCategorySubscriptions The categories of notifications that the contact will receive communications for.
         * 
         * @return builder
         * 
         */
        public Builder notificationCategorySubscriptions(String... notificationCategorySubscriptions) {
            return notificationCategorySubscriptions(List.of(notificationCategorySubscriptions));
        }

        /**
         * @param parent The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public ContactState build() {
            return $;
        }
    }

}
