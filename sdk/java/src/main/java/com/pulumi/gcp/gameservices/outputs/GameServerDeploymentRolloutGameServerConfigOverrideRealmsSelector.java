// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector {
    /**
     * @return List of realms to match against.
     * 
     */
    private @Nullable List<String> realms;

    private GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector() {}
    /**
     * @return List of realms to match against.
     * 
     */
    public List<String> realms() {
        return this.realms == null ? List.of() : this.realms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> realms;
        public Builder() {}
        public Builder(GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realms = defaults.realms;
        }

        @CustomType.Setter
        public Builder realms(@Nullable List<String> realms) {
            this.realms = realms;
            return this;
        }
        public Builder realms(String... realms) {
            return realms(List.of(realms));
        }
        public GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector build() {
            final var o = new GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector();
            o.realms = realms;
            return o;
        }
    }
}
