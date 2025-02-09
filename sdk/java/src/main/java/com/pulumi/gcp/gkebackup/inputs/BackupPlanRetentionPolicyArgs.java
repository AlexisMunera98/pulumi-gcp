// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPlanRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPlanRetentionPolicyArgs Empty = new BackupPlanRetentionPolicyArgs();

    /**
     * Minimum age for a Backup created via this BackupPlan (in days).
     * Must be an integer value between 0-90 (inclusive).
     * A Backup created under this BackupPlan will not be deletable
     * until it reaches Backup&#39;s (create time + backup_delete_lock_days).
     * Updating this field of a BackupPlan does not affect existing Backups.
     * Backups created after a successful update will inherit this new value.
     * 
     */
    @Import(name="backupDeleteLockDays")
    private @Nullable Output<Integer> backupDeleteLockDays;

    /**
     * @return Minimum age for a Backup created via this BackupPlan (in days).
     * Must be an integer value between 0-90 (inclusive).
     * A Backup created under this BackupPlan will not be deletable
     * until it reaches Backup&#39;s (create time + backup_delete_lock_days).
     * Updating this field of a BackupPlan does not affect existing Backups.
     * Backups created after a successful update will inherit this new value.
     * 
     */
    public Optional<Output<Integer>> backupDeleteLockDays() {
        return Optional.ofNullable(this.backupDeleteLockDays);
    }

    /**
     * The default maximum age of a Backup created via this BackupPlan.
     * This field MUST be an integer value &gt;= 0 and &lt;= 365. If specified,
     * a Backup created under this BackupPlan will be automatically deleted
     * after its age reaches (createTime + backupRetainDays).
     * If not specified, Backups created under this BackupPlan will NOT be
     * subject to automatic deletion. Updating this field does NOT affect
     * existing Backups under it. Backups created AFTER a successful update
     * will automatically pick up the new value.
     * NOTE: backupRetainDays must be &gt;= backupDeleteLockDays.
     * If cronSchedule is defined, then this must be &lt;= 360 * the creation interval.]
     * 
     */
    @Import(name="backupRetainDays")
    private @Nullable Output<Integer> backupRetainDays;

    /**
     * @return The default maximum age of a Backup created via this BackupPlan.
     * This field MUST be an integer value &gt;= 0 and &lt;= 365. If specified,
     * a Backup created under this BackupPlan will be automatically deleted
     * after its age reaches (createTime + backupRetainDays).
     * If not specified, Backups created under this BackupPlan will NOT be
     * subject to automatic deletion. Updating this field does NOT affect
     * existing Backups under it. Backups created AFTER a successful update
     * will automatically pick up the new value.
     * NOTE: backupRetainDays must be &gt;= backupDeleteLockDays.
     * If cronSchedule is defined, then this must be &lt;= 360 * the creation interval.]
     * 
     */
    public Optional<Output<Integer>> backupRetainDays() {
        return Optional.ofNullable(this.backupRetainDays);
    }

    /**
     * This flag denotes whether the retention policy of this BackupPlan is locked.
     * If set to True, no further update is allowed on this policy, including
     * the locked field itself.
     * 
     */
    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    /**
     * @return This flag denotes whether the retention policy of this BackupPlan is locked.
     * If set to True, no further update is allowed on this policy, including
     * the locked field itself.
     * 
     */
    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    private BackupPlanRetentionPolicyArgs() {}

    private BackupPlanRetentionPolicyArgs(BackupPlanRetentionPolicyArgs $) {
        this.backupDeleteLockDays = $.backupDeleteLockDays;
        this.backupRetainDays = $.backupRetainDays;
        this.locked = $.locked;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPlanRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPlanRetentionPolicyArgs $;

        public Builder() {
            $ = new BackupPlanRetentionPolicyArgs();
        }

        public Builder(BackupPlanRetentionPolicyArgs defaults) {
            $ = new BackupPlanRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupDeleteLockDays Minimum age for a Backup created via this BackupPlan (in days).
         * Must be an integer value between 0-90 (inclusive).
         * A Backup created under this BackupPlan will not be deletable
         * until it reaches Backup&#39;s (create time + backup_delete_lock_days).
         * Updating this field of a BackupPlan does not affect existing Backups.
         * Backups created after a successful update will inherit this new value.
         * 
         * @return builder
         * 
         */
        public Builder backupDeleteLockDays(@Nullable Output<Integer> backupDeleteLockDays) {
            $.backupDeleteLockDays = backupDeleteLockDays;
            return this;
        }

        /**
         * @param backupDeleteLockDays Minimum age for a Backup created via this BackupPlan (in days).
         * Must be an integer value between 0-90 (inclusive).
         * A Backup created under this BackupPlan will not be deletable
         * until it reaches Backup&#39;s (create time + backup_delete_lock_days).
         * Updating this field of a BackupPlan does not affect existing Backups.
         * Backups created after a successful update will inherit this new value.
         * 
         * @return builder
         * 
         */
        public Builder backupDeleteLockDays(Integer backupDeleteLockDays) {
            return backupDeleteLockDays(Output.of(backupDeleteLockDays));
        }

        /**
         * @param backupRetainDays The default maximum age of a Backup created via this BackupPlan.
         * This field MUST be an integer value &gt;= 0 and &lt;= 365. If specified,
         * a Backup created under this BackupPlan will be automatically deleted
         * after its age reaches (createTime + backupRetainDays).
         * If not specified, Backups created under this BackupPlan will NOT be
         * subject to automatic deletion. Updating this field does NOT affect
         * existing Backups under it. Backups created AFTER a successful update
         * will automatically pick up the new value.
         * NOTE: backupRetainDays must be &gt;= backupDeleteLockDays.
         * If cronSchedule is defined, then this must be &lt;= 360 * the creation interval.]
         * 
         * @return builder
         * 
         */
        public Builder backupRetainDays(@Nullable Output<Integer> backupRetainDays) {
            $.backupRetainDays = backupRetainDays;
            return this;
        }

        /**
         * @param backupRetainDays The default maximum age of a Backup created via this BackupPlan.
         * This field MUST be an integer value &gt;= 0 and &lt;= 365. If specified,
         * a Backup created under this BackupPlan will be automatically deleted
         * after its age reaches (createTime + backupRetainDays).
         * If not specified, Backups created under this BackupPlan will NOT be
         * subject to automatic deletion. Updating this field does NOT affect
         * existing Backups under it. Backups created AFTER a successful update
         * will automatically pick up the new value.
         * NOTE: backupRetainDays must be &gt;= backupDeleteLockDays.
         * If cronSchedule is defined, then this must be &lt;= 360 * the creation interval.]
         * 
         * @return builder
         * 
         */
        public Builder backupRetainDays(Integer backupRetainDays) {
            return backupRetainDays(Output.of(backupRetainDays));
        }

        /**
         * @param locked This flag denotes whether the retention policy of this BackupPlan is locked.
         * If set to True, no further update is allowed on this policy, including
         * the locked field itself.
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param locked This flag denotes whether the retention policy of this BackupPlan is locked.
         * If set to True, no further update is allowed on this policy, including
         * the locked field itself.
         * 
         * @return builder
         * 
         */
        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public BackupPlanRetentionPolicyArgs build() {
            return $;
        }
    }

}
