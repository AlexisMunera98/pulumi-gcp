// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxPageFormParameterFillBehaviorInitialPromptFulfillment;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageFormParameterFillBehavior {
    /**
     * @return The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * Structure is documented below.
     * 
     */
    private @Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment;

    private CxPageFormParameterFillBehavior() {}
    /**
     * @return The fulfillment to provide the initial prompt that the agent can present to the user in order to fill the parameter.
     * Structure is documented below.
     * 
     */
    public Optional<CxPageFormParameterFillBehaviorInitialPromptFulfillment> initialPromptFulfillment() {
        return Optional.ofNullable(this.initialPromptFulfillment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehavior defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment;
        public Builder() {}
        public Builder(CxPageFormParameterFillBehavior defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialPromptFulfillment = defaults.initialPromptFulfillment;
        }

        @CustomType.Setter
        public Builder initialPromptFulfillment(@Nullable CxPageFormParameterFillBehaviorInitialPromptFulfillment initialPromptFulfillment) {
            this.initialPromptFulfillment = initialPromptFulfillment;
            return this;
        }
        public CxPageFormParameterFillBehavior build() {
            final var o = new CxPageFormParameterFillBehavior();
            o.initialPromptFulfillment = initialPromptFulfillment;
            return o;
        }
    }
}
