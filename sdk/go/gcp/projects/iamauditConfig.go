// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package projects

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
//
// This member resource can be imported using the `project_id`, role, and member e.g.
//
// ```sh
//
//	$ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project "your-project-id roles/viewer user:foo@example.com"
//
// ```
//
//	IAM binding imports use space-delimited identifiers; the resource in question and the role.
//
// This binding resource can be imported using the `project_id` and role, e.g.
//
// ```sh
//
//	$ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project "your-project-id roles/viewer"
//
// ```
//
//	IAM policy imports use the identifier of the resource in question.
//
// This policy resource can be imported using the `project_id`.
//
// ```sh
//
//	$ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project your-project-id
//
// ```
//
//	IAM audit config imports use the identifier of the resource in question and the service, e.g.
//
// ```sh
//
//	$ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig my_project "your-project-id foo.googleapis.com"
//
// ```
//
//	-> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
//
// full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`. -> **Conditional IAM Bindings**If you're importing a IAM binding with a condition block, make sure
//
// ```sh
//
//	$ pulumi import gcp:projects/iAMAuditConfig:IAMAuditConfig to include the title of condition, e.g. `google_project_iam_binding.my_project "{{your-project-id}} roles/{{role_id}} condition-title"`
//
// ```
type IAMAuditConfig struct {
	pulumi.CustomResourceState

	// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
	AuditLogConfigs IAMAuditConfigAuditLogConfigArrayOutput `pulumi:"auditLogConfigs"`
	// (Computed) The etag of the project's IAM policy.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The project id of the target project. This is not
	// inferred from the provider.
	Project pulumi.StringOutput `pulumi:"project"`
	// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `logTypes` specified in each `auditLogConfig` are enabled, and the `exemptedMembers` in each `auditLogConfig` are exempted.
	Service pulumi.StringOutput `pulumi:"service"`
}

// NewIAMAuditConfig registers a new resource with the given unique name, arguments, and options.
func NewIAMAuditConfig(ctx *pulumi.Context,
	name string, args *IAMAuditConfigArgs, opts ...pulumi.ResourceOption) (*IAMAuditConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuditLogConfigs == nil {
		return nil, errors.New("invalid value for required argument 'AuditLogConfigs'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	var resource IAMAuditConfig
	err := ctx.RegisterResource("gcp:projects/iAMAuditConfig:IAMAuditConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIAMAuditConfig gets an existing IAMAuditConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIAMAuditConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IAMAuditConfigState, opts ...pulumi.ResourceOption) (*IAMAuditConfig, error) {
	var resource IAMAuditConfig
	err := ctx.ReadResource("gcp:projects/iAMAuditConfig:IAMAuditConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IAMAuditConfig resources.
type iamauditConfigState struct {
	// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
	AuditLogConfigs []IAMAuditConfigAuditLogConfig `pulumi:"auditLogConfigs"`
	// (Computed) The etag of the project's IAM policy.
	Etag *string `pulumi:"etag"`
	// The project id of the target project. This is not
	// inferred from the provider.
	Project *string `pulumi:"project"`
	// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `logTypes` specified in each `auditLogConfig` are enabled, and the `exemptedMembers` in each `auditLogConfig` are exempted.
	Service *string `pulumi:"service"`
}

type IAMAuditConfigState struct {
	// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
	AuditLogConfigs IAMAuditConfigAuditLogConfigArrayInput
	// (Computed) The etag of the project's IAM policy.
	Etag pulumi.StringPtrInput
	// The project id of the target project. This is not
	// inferred from the provider.
	Project pulumi.StringPtrInput
	// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `logTypes` specified in each `auditLogConfig` are enabled, and the `exemptedMembers` in each `auditLogConfig` are exempted.
	Service pulumi.StringPtrInput
}

func (IAMAuditConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*iamauditConfigState)(nil)).Elem()
}

type iamauditConfigArgs struct {
	// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
	AuditLogConfigs []IAMAuditConfigAuditLogConfig `pulumi:"auditLogConfigs"`
	// The project id of the target project. This is not
	// inferred from the provider.
	Project string `pulumi:"project"`
	// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `logTypes` specified in each `auditLogConfig` are enabled, and the `exemptedMembers` in each `auditLogConfig` are exempted.
	Service string `pulumi:"service"`
}

// The set of arguments for constructing a IAMAuditConfig resource.
type IAMAuditConfigArgs struct {
	// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
	AuditLogConfigs IAMAuditConfigAuditLogConfigArrayInput
	// The project id of the target project. This is not
	// inferred from the provider.
	Project pulumi.StringInput
	// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `logTypes` specified in each `auditLogConfig` are enabled, and the `exemptedMembers` in each `auditLogConfig` are exempted.
	Service pulumi.StringInput
}

func (IAMAuditConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*iamauditConfigArgs)(nil)).Elem()
}

type IAMAuditConfigInput interface {
	pulumi.Input

	ToIAMAuditConfigOutput() IAMAuditConfigOutput
	ToIAMAuditConfigOutputWithContext(ctx context.Context) IAMAuditConfigOutput
}

func (*IAMAuditConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**IAMAuditConfig)(nil)).Elem()
}

func (i *IAMAuditConfig) ToIAMAuditConfigOutput() IAMAuditConfigOutput {
	return i.ToIAMAuditConfigOutputWithContext(context.Background())
}

func (i *IAMAuditConfig) ToIAMAuditConfigOutputWithContext(ctx context.Context) IAMAuditConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IAMAuditConfigOutput)
}

// IAMAuditConfigArrayInput is an input type that accepts IAMAuditConfigArray and IAMAuditConfigArrayOutput values.
// You can construct a concrete instance of `IAMAuditConfigArrayInput` via:
//
//	IAMAuditConfigArray{ IAMAuditConfigArgs{...} }
type IAMAuditConfigArrayInput interface {
	pulumi.Input

	ToIAMAuditConfigArrayOutput() IAMAuditConfigArrayOutput
	ToIAMAuditConfigArrayOutputWithContext(context.Context) IAMAuditConfigArrayOutput
}

type IAMAuditConfigArray []IAMAuditConfigInput

func (IAMAuditConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IAMAuditConfig)(nil)).Elem()
}

func (i IAMAuditConfigArray) ToIAMAuditConfigArrayOutput() IAMAuditConfigArrayOutput {
	return i.ToIAMAuditConfigArrayOutputWithContext(context.Background())
}

func (i IAMAuditConfigArray) ToIAMAuditConfigArrayOutputWithContext(ctx context.Context) IAMAuditConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IAMAuditConfigArrayOutput)
}

// IAMAuditConfigMapInput is an input type that accepts IAMAuditConfigMap and IAMAuditConfigMapOutput values.
// You can construct a concrete instance of `IAMAuditConfigMapInput` via:
//
//	IAMAuditConfigMap{ "key": IAMAuditConfigArgs{...} }
type IAMAuditConfigMapInput interface {
	pulumi.Input

	ToIAMAuditConfigMapOutput() IAMAuditConfigMapOutput
	ToIAMAuditConfigMapOutputWithContext(context.Context) IAMAuditConfigMapOutput
}

type IAMAuditConfigMap map[string]IAMAuditConfigInput

func (IAMAuditConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IAMAuditConfig)(nil)).Elem()
}

func (i IAMAuditConfigMap) ToIAMAuditConfigMapOutput() IAMAuditConfigMapOutput {
	return i.ToIAMAuditConfigMapOutputWithContext(context.Background())
}

func (i IAMAuditConfigMap) ToIAMAuditConfigMapOutputWithContext(ctx context.Context) IAMAuditConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IAMAuditConfigMapOutput)
}

type IAMAuditConfigOutput struct{ *pulumi.OutputState }

func (IAMAuditConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IAMAuditConfig)(nil)).Elem()
}

func (o IAMAuditConfigOutput) ToIAMAuditConfigOutput() IAMAuditConfigOutput {
	return o
}

func (o IAMAuditConfigOutput) ToIAMAuditConfigOutputWithContext(ctx context.Context) IAMAuditConfigOutput {
	return o
}

// The configuration for logging of each type of permission.  This can be specified multiple times.  Structure is documented below.
func (o IAMAuditConfigOutput) AuditLogConfigs() IAMAuditConfigAuditLogConfigArrayOutput {
	return o.ApplyT(func(v *IAMAuditConfig) IAMAuditConfigAuditLogConfigArrayOutput { return v.AuditLogConfigs }).(IAMAuditConfigAuditLogConfigArrayOutput)
}

// (Computed) The etag of the project's IAM policy.
func (o IAMAuditConfigOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *IAMAuditConfig) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The project id of the target project. This is not
// inferred from the provider.
func (o IAMAuditConfigOutput) Project() pulumi.StringOutput {
	return o.ApplyT(func(v *IAMAuditConfig) pulumi.StringOutput { return v.Project }).(pulumi.StringOutput)
}

// Service which will be enabled for audit logging.  The special value `allServices` covers all services.  Note that if there are google\_project\_iam\_audit\_config resources covering both `allServices` and a specific service then the union of the two AuditConfigs is used for that service: the `logTypes` specified in each `auditLogConfig` are enabled, and the `exemptedMembers` in each `auditLogConfig` are exempted.
func (o IAMAuditConfigOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *IAMAuditConfig) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

type IAMAuditConfigArrayOutput struct{ *pulumi.OutputState }

func (IAMAuditConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IAMAuditConfig)(nil)).Elem()
}

func (o IAMAuditConfigArrayOutput) ToIAMAuditConfigArrayOutput() IAMAuditConfigArrayOutput {
	return o
}

func (o IAMAuditConfigArrayOutput) ToIAMAuditConfigArrayOutputWithContext(ctx context.Context) IAMAuditConfigArrayOutput {
	return o
}

func (o IAMAuditConfigArrayOutput) Index(i pulumi.IntInput) IAMAuditConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IAMAuditConfig {
		return vs[0].([]*IAMAuditConfig)[vs[1].(int)]
	}).(IAMAuditConfigOutput)
}

type IAMAuditConfigMapOutput struct{ *pulumi.OutputState }

func (IAMAuditConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IAMAuditConfig)(nil)).Elem()
}

func (o IAMAuditConfigMapOutput) ToIAMAuditConfigMapOutput() IAMAuditConfigMapOutput {
	return o
}

func (o IAMAuditConfigMapOutput) ToIAMAuditConfigMapOutputWithContext(ctx context.Context) IAMAuditConfigMapOutput {
	return o
}

func (o IAMAuditConfigMapOutput) MapIndex(k pulumi.StringInput) IAMAuditConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IAMAuditConfig {
		return vs[0].(map[string]*IAMAuditConfig)[vs[1].(string)]
	}).(IAMAuditConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IAMAuditConfigInput)(nil)).Elem(), &IAMAuditConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*IAMAuditConfigArrayInput)(nil)).Elem(), IAMAuditConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IAMAuditConfigMapInput)(nil)).Elem(), IAMAuditConfigMap{})
	pulumi.RegisterOutputType(IAMAuditConfigOutput{})
	pulumi.RegisterOutputType(IAMAuditConfigArrayOutput{})
	pulumi.RegisterOutputType(IAMAuditConfigMapOutput{})
}
