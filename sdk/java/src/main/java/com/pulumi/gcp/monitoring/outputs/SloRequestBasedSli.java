// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.SloRequestBasedSliDistributionCut;
import com.pulumi.gcp.monitoring.outputs.SloRequestBasedSliGoodTotalRatio;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloRequestBasedSli {
    /**
     * @return Used when good_service is defined by a count of values aggregated in a
     * Distribution that fall into a good range. The total_service is the
     * total count of all values aggregated in the Distribution.
     * Defines a distribution TimeSeries filter and thresholds used for
     * measuring good service and total service.
     * Exactly one of `distribution_cut` or `good_total_ratio` can be set.
     * Structure is documented below.
     * 
     */
    private @Nullable SloRequestBasedSliDistributionCut distributionCut;
    /**
     * @return A means to compute a ratio of `good_service` to `total_service`.
     * Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
     * Must specify exactly two of good, bad, and total service filters.
     * The relationship good_service + bad_service = total_service
     * will be assumed.
     * Exactly one of `distribution_cut` or `good_total_ratio` can be set.
     * Structure is documented below.
     * 
     */
    private @Nullable SloRequestBasedSliGoodTotalRatio goodTotalRatio;

    private SloRequestBasedSli() {}
    /**
     * @return Used when good_service is defined by a count of values aggregated in a
     * Distribution that fall into a good range. The total_service is the
     * total count of all values aggregated in the Distribution.
     * Defines a distribution TimeSeries filter and thresholds used for
     * measuring good service and total service.
     * Exactly one of `distribution_cut` or `good_total_ratio` can be set.
     * Structure is documented below.
     * 
     */
    public Optional<SloRequestBasedSliDistributionCut> distributionCut() {
        return Optional.ofNullable(this.distributionCut);
    }
    /**
     * @return A means to compute a ratio of `good_service` to `total_service`.
     * Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
     * Must specify exactly two of good, bad, and total service filters.
     * The relationship good_service + bad_service = total_service
     * will be assumed.
     * Exactly one of `distribution_cut` or `good_total_ratio` can be set.
     * Structure is documented below.
     * 
     */
    public Optional<SloRequestBasedSliGoodTotalRatio> goodTotalRatio() {
        return Optional.ofNullable(this.goodTotalRatio);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloRequestBasedSli defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SloRequestBasedSliDistributionCut distributionCut;
        private @Nullable SloRequestBasedSliGoodTotalRatio goodTotalRatio;
        public Builder() {}
        public Builder(SloRequestBasedSli defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionCut = defaults.distributionCut;
    	      this.goodTotalRatio = defaults.goodTotalRatio;
        }

        @CustomType.Setter
        public Builder distributionCut(@Nullable SloRequestBasedSliDistributionCut distributionCut) {
            this.distributionCut = distributionCut;
            return this;
        }
        @CustomType.Setter
        public Builder goodTotalRatio(@Nullable SloRequestBasedSliGoodTotalRatio goodTotalRatio) {
            this.goodTotalRatio = goodTotalRatio;
            return this;
        }
        public SloRequestBasedSli build() {
            final var o = new SloRequestBasedSli();
            o.distributionCut = distributionCut;
            o.goodTotalRatio = goodTotalRatio;
            return o;
        }
    }
}
