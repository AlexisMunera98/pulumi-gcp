// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.organizations.inputs.IamAuditConfigAuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class IamAuditConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final IamAuditConfigArgs Empty = new IamAuditConfigArgs();

    /**
     * The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    @Import(name="auditLogConfigs", required=true)
    private Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs;

    /**
     * @return The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
     * 
     */
    public Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs() {
        return this.auditLogConfigs;
    }

    /**
     * The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
     * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
     * will not be inferred from the provider.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
     * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
     * will not be inferred from the provider.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_organization\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    @Import(name="service", required=true)
    private Output<String> service;

    /**
     * @return Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_organization\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    private IamAuditConfigArgs() {}

    private IamAuditConfigArgs(IamAuditConfigArgs $) {
        this.auditLogConfigs = $.auditLogConfigs;
        this.orgId = $.orgId;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamAuditConfigArgs $;

        public Builder() {
            $ = new IamAuditConfigArgs();
        }

        public Builder(IamAuditConfigArgs defaults) {
            $ = new IamAuditConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(Output<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs) {
            $.auditLogConfigs = auditLogConfigs;
            return this;
        }

        /**
         * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(List<IamAuditConfigAuditLogConfigArgs> auditLogConfigs) {
            return auditLogConfigs(Output.of(auditLogConfigs));
        }

        /**
         * @param auditLogConfigs The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder auditLogConfigs(IamAuditConfigAuditLogConfigArgs... auditLogConfigs) {
            return auditLogConfigs(List.of(auditLogConfigs));
        }

        /**
         * @param orgId The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
         * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
         * will not be inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
         * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
         * will not be inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param service Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_organization\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
         * 
         * @return builder
         * 
         */
        public Builder service(Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_organization\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `log_types` specified in each `audit_log_config` are enabled, and the `exempted_members` in each `audit_log_config` are exempted.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public IamAuditConfigArgs build() {
            $.auditLogConfigs = Objects.requireNonNull($.auditLogConfigs, "expected parameter 'auditLogConfigs' to be non-null");
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
