package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApprovalInPrincipleFlagNodeRuleProvider_Factory
    implements Factory<ApprovalInPrincipleFlagNodeRuleProvider> {
  private final MembersInjector<ApprovalInPrincipleFlagNodeRuleProvider>
      approvalInPrincipleFlagNodeRuleProviderMembersInjector;

  public ApprovalInPrincipleFlagNodeRuleProvider_Factory(
      MembersInjector<ApprovalInPrincipleFlagNodeRuleProvider>
          approvalInPrincipleFlagNodeRuleProviderMembersInjector) {
    assert approvalInPrincipleFlagNodeRuleProviderMembersInjector != null;
    this.approvalInPrincipleFlagNodeRuleProviderMembersInjector =
        approvalInPrincipleFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ApprovalInPrincipleFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        approvalInPrincipleFlagNodeRuleProviderMembersInjector,
        new ApprovalInPrincipleFlagNodeRuleProvider());
  }

  public static Factory<ApprovalInPrincipleFlagNodeRuleProvider> create(
      MembersInjector<ApprovalInPrincipleFlagNodeRuleProvider>
          approvalInPrincipleFlagNodeRuleProviderMembersInjector) {
    return new ApprovalInPrincipleFlagNodeRuleProvider_Factory(
        approvalInPrincipleFlagNodeRuleProviderMembersInjector);
  }
}
