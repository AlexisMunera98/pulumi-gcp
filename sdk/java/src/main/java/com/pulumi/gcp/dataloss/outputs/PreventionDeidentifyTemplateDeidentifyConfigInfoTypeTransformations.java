// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations {
    /**
     * @return Transformation for each infoType. Cannot specify more than one for a given infoType.
     * Structure is documented below.
     * 
     */
    private List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation> transformations;

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations() {}
    /**
     * @return Transformation for each infoType. Cannot specify more than one for a given infoType.
     * Structure is documented below.
     * 
     */
    public List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation> transformations() {
        return this.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation> transformations;
        public Builder() {}
        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        @CustomType.Setter
        public Builder transformations(List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation> transformations) {
            this.transformations = Objects.requireNonNull(transformations);
            return this;
        }
        public Builder transformations(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformation... transformations) {
            return transformations(List.of(transformations));
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations build() {
            final var o = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations();
            o.transformations = transformations;
            return o;
        }
    }
}
