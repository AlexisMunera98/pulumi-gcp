// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class EnvironmentConfigWorkloadsConfig
    {
        public readonly Outputs.EnvironmentConfigWorkloadsConfigScheduler? Scheduler;
        public readonly Outputs.EnvironmentConfigWorkloadsConfigTriggerer? Triggerer;
        public readonly Outputs.EnvironmentConfigWorkloadsConfigWebServer? WebServer;
        public readonly Outputs.EnvironmentConfigWorkloadsConfigWorker? Worker;

        [OutputConstructor]
        private EnvironmentConfigWorkloadsConfig(
            Outputs.EnvironmentConfigWorkloadsConfigScheduler? scheduler,

            Outputs.EnvironmentConfigWorkloadsConfigTriggerer? triggerer,

            Outputs.EnvironmentConfigWorkloadsConfigWebServer? webServer,

            Outputs.EnvironmentConfigWorkloadsConfigWorker? worker)
        {
            Scheduler = scheduler;
            Triggerer = triggerer;
            WebServer = webServer;
            Worker = worker;
        }
    }
}
