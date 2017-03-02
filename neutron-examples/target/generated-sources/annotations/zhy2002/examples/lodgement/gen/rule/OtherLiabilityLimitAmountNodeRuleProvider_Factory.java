package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityLimitAmountNodeRuleProvider_Factory
    implements Factory<OtherLiabilityLimitAmountNodeRuleProvider> {
  private final MembersInjector<OtherLiabilityLimitAmountNodeRuleProvider>
      otherLiabilityLimitAmountNodeRuleProviderMembersInjector;

  public OtherLiabilityLimitAmountNodeRuleProvider_Factory(
      MembersInjector<OtherLiabilityLimitAmountNodeRuleProvider>
          otherLiabilityLimitAmountNodeRuleProviderMembersInjector) {
    assert otherLiabilityLimitAmountNodeRuleProviderMembersInjector != null;
    this.otherLiabilityLimitAmountNodeRuleProviderMembersInjector =
        otherLiabilityLimitAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherLiabilityLimitAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityLimitAmountNodeRuleProviderMembersInjector,
        new OtherLiabilityLimitAmountNodeRuleProvider());
  }

  public static Factory<OtherLiabilityLimitAmountNodeRuleProvider> create(
      MembersInjector<OtherLiabilityLimitAmountNodeRuleProvider>
          otherLiabilityLimitAmountNodeRuleProviderMembersInjector) {
    return new OtherLiabilityLimitAmountNodeRuleProvider_Factory(
        otherLiabilityLimitAmountNodeRuleProviderMembersInjector);
  }
}
