// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageSchedulingMaxRunDurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageSchedulingMaxRunDurationArgs Empty = new InstanceFromMachineImageSchedulingMaxRunDurationArgs();

    @Import(name="nanos")
    private @Nullable Output<Integer> nanos;

    public Optional<Output<Integer>> nanos() {
        return Optional.ofNullable(this.nanos);
    }

    @Import(name="seconds", required=true)
    private Output<Integer> seconds;

    public Output<Integer> seconds() {
        return this.seconds;
    }

    private InstanceFromMachineImageSchedulingMaxRunDurationArgs() {}

    private InstanceFromMachineImageSchedulingMaxRunDurationArgs(InstanceFromMachineImageSchedulingMaxRunDurationArgs $) {
        this.nanos = $.nanos;
        this.seconds = $.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageSchedulingMaxRunDurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageSchedulingMaxRunDurationArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageSchedulingMaxRunDurationArgs();
        }

        public Builder(InstanceFromMachineImageSchedulingMaxRunDurationArgs defaults) {
            $ = new InstanceFromMachineImageSchedulingMaxRunDurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder nanos(@Nullable Output<Integer> nanos) {
            $.nanos = nanos;
            return this;
        }

        public Builder nanos(Integer nanos) {
            return nanos(Output.of(nanos));
        }

        public Builder seconds(Output<Integer> seconds) {
            $.seconds = seconds;
            return this;
        }

        public Builder seconds(Integer seconds) {
            return seconds(Output.of(seconds));
        }

        public InstanceFromMachineImageSchedulingMaxRunDurationArgs build() {
            $.seconds = Objects.requireNonNull($.seconds, "expected parameter 'seconds' to be non-null");
            return $;
        }
    }

}
