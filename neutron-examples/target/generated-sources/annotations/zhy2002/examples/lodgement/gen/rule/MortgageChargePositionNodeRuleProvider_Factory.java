package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageChargePositionNodeRuleProvider_Factory
    implements Factory<MortgageChargePositionNodeRuleProvider> {
  private final MembersInjector<MortgageChargePositionNodeRuleProvider>
      mortgageChargePositionNodeRuleProviderMembersInjector;

  public MortgageChargePositionNodeRuleProvider_Factory(
      MembersInjector<MortgageChargePositionNodeRuleProvider>
          mortgageChargePositionNodeRuleProviderMembersInjector) {
    assert mortgageChargePositionNodeRuleProviderMembersInjector != null;
    this.mortgageChargePositionNodeRuleProviderMembersInjector =
        mortgageChargePositionNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageChargePositionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageChargePositionNodeRuleProviderMembersInjector,
        new MortgageChargePositionNodeRuleProvider());
  }

  public static Factory<MortgageChargePositionNodeRuleProvider> create(
      MembersInjector<MortgageChargePositionNodeRuleProvider>
          mortgageChargePositionNodeRuleProviderMembersInjector) {
    return new MortgageChargePositionNodeRuleProvider_Factory(
        mortgageChargePositionNodeRuleProviderMembersInjector);
  }
}
