// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.tags.inputs.GetTagKeyArgs;
import com.pulumi.gcp.tags.inputs.GetTagKeyPlainArgs;
import com.pulumi.gcp.tags.inputs.GetTagValueArgs;
import com.pulumi.gcp.tags.inputs.GetTagValuePlainArgs;
import com.pulumi.gcp.tags.outputs.GetTagKeyResult;
import com.pulumi.gcp.tags.outputs.GetTagValueResult;
import java.util.concurrent.CompletableFuture;

public final class TagsFunctions {
    /**
     * Get a tag key within a GCP org by `parent` and `short_name`.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.tags.TagsFunctions;
     * import com.pulumi.gcp.tags.inputs.GetTagKeyArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var environmentTagKey = TagsFunctions.getTagKey(GetTagKeyArgs.builder()
     *             .parent(&#34;organizations/12345&#34;)
     *             .shortName(&#34;environment&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTagKeyResult> getTagKey(GetTagKeyArgs args) {
        return getTagKey(args, InvokeOptions.Empty);
    }
    /**
     * Get a tag key within a GCP org by `parent` and `short_name`.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.tags.TagsFunctions;
     * import com.pulumi.gcp.tags.inputs.GetTagKeyArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var environmentTagKey = TagsFunctions.getTagKey(GetTagKeyArgs.builder()
     *             .parent(&#34;organizations/12345&#34;)
     *             .shortName(&#34;environment&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTagKeyResult> getTagKeyPlain(GetTagKeyPlainArgs args) {
        return getTagKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a tag key within a GCP org by `parent` and `short_name`.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.tags.TagsFunctions;
     * import com.pulumi.gcp.tags.inputs.GetTagKeyArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var environmentTagKey = TagsFunctions.getTagKey(GetTagKeyArgs.builder()
     *             .parent(&#34;organizations/12345&#34;)
     *             .shortName(&#34;environment&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTagKeyResult> getTagKey(GetTagKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:tags/getTagKey:getTagKey", TypeShape.of(GetTagKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a tag key within a GCP org by `parent` and `short_name`.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.tags.TagsFunctions;
     * import com.pulumi.gcp.tags.inputs.GetTagKeyArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var environmentTagKey = TagsFunctions.getTagKey(GetTagKeyArgs.builder()
     *             .parent(&#34;organizations/12345&#34;)
     *             .shortName(&#34;environment&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTagKeyResult> getTagKeyPlain(GetTagKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:tags/getTagKey:getTagKey", TypeShape.of(GetTagKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a tag value by `parent` key and `short_name`.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.tags.TagsFunctions;
     * import com.pulumi.gcp.tags.inputs.GetTagValueArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var environmentProdTagValue = TagsFunctions.getTagValue(GetTagValueArgs.builder()
     *             .parent(&#34;tagKeys/56789&#34;)
     *             .shortName(&#34;production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTagValueResult> getTagValue(GetTagValueArgs args) {
        return getTagValue(args, InvokeOptions.Empty);
    }
    /**
     * Get a tag value by `parent` key and `short_name`.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.tags.TagsFunctions;
     * import com.pulumi.gcp.tags.inputs.GetTagValueArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var environmentProdTagValue = TagsFunctions.getTagValue(GetTagValueArgs.builder()
     *             .parent(&#34;tagKeys/56789&#34;)
     *             .shortName(&#34;production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTagValueResult> getTagValuePlain(GetTagValuePlainArgs args) {
        return getTagValuePlain(args, InvokeOptions.Empty);
    }
    /**
     * Get a tag value by `parent` key and `short_name`.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.tags.TagsFunctions;
     * import com.pulumi.gcp.tags.inputs.GetTagValueArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var environmentProdTagValue = TagsFunctions.getTagValue(GetTagValueArgs.builder()
     *             .parent(&#34;tagKeys/56789&#34;)
     *             .shortName(&#34;production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTagValueResult> getTagValue(GetTagValueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:tags/getTagValue:getTagValue", TypeShape.of(GetTagValueResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a tag value by `parent` key and `short_name`.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.tags.TagsFunctions;
     * import com.pulumi.gcp.tags.inputs.GetTagValueArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var environmentProdTagValue = TagsFunctions.getTagValue(GetTagValueArgs.builder()
     *             .parent(&#34;tagKeys/56789&#34;)
     *             .shortName(&#34;production&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTagValueResult> getTagValuePlain(GetTagValuePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:tags/getTagValue:getTagValue", TypeShape.of(GetTagValueResult.class), args, Utilities.withVersion(options));
    }
}
