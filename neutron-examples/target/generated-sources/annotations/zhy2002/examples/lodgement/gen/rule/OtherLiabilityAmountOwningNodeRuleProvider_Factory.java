package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityAmountOwningNodeRuleProvider_Factory
    implements Factory<OtherLiabilityAmountOwningNodeRuleProvider> {
  private final MembersInjector<OtherLiabilityAmountOwningNodeRuleProvider>
      otherLiabilityAmountOwningNodeRuleProviderMembersInjector;

  public OtherLiabilityAmountOwningNodeRuleProvider_Factory(
      MembersInjector<OtherLiabilityAmountOwningNodeRuleProvider>
          otherLiabilityAmountOwningNodeRuleProviderMembersInjector) {
    assert otherLiabilityAmountOwningNodeRuleProviderMembersInjector != null;
    this.otherLiabilityAmountOwningNodeRuleProviderMembersInjector =
        otherLiabilityAmountOwningNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherLiabilityAmountOwningNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityAmountOwningNodeRuleProviderMembersInjector,
        new OtherLiabilityAmountOwningNodeRuleProvider());
  }

  public static Factory<OtherLiabilityAmountOwningNodeRuleProvider> create(
      MembersInjector<OtherLiabilityAmountOwningNodeRuleProvider>
          otherLiabilityAmountOwningNodeRuleProviderMembersInjector) {
    return new OtherLiabilityAmountOwningNodeRuleProvider_Factory(
        otherLiabilityAmountOwningNodeRuleProviderMembersInjector);
  }
}
