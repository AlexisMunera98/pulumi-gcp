// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserSqlServerUserDetail {
    private @Nullable Boolean disabled;
    private @Nullable List<String> serverRoles;

    private UserSqlServerUserDetail() {}
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    public List<String> serverRoles() {
        return this.serverRoles == null ? List.of() : this.serverRoles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSqlServerUserDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable List<String> serverRoles;
        public Builder() {}
        public Builder(UserSqlServerUserDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.serverRoles = defaults.serverRoles;
        }

        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder serverRoles(@Nullable List<String> serverRoles) {
            this.serverRoles = serverRoles;
            return this;
        }
        public Builder serverRoles(String... serverRoles) {
            return serverRoles(List.of(serverRoles));
        }
        public UserSqlServerUserDetail build() {
            final var o = new UserSqlServerUserDetail();
            o.disabled = disabled;
            o.serverRoles = serverRoles;
            return o;
        }
    }
}
