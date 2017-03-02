package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBreakFeeNodeRuleProvider_Factory
    implements Factory<MortgageBreakFeeNodeRuleProvider> {
  private final MembersInjector<MortgageBreakFeeNodeRuleProvider>
      mortgageBreakFeeNodeRuleProviderMembersInjector;

  public MortgageBreakFeeNodeRuleProvider_Factory(
      MembersInjector<MortgageBreakFeeNodeRuleProvider>
          mortgageBreakFeeNodeRuleProviderMembersInjector) {
    assert mortgageBreakFeeNodeRuleProviderMembersInjector != null;
    this.mortgageBreakFeeNodeRuleProviderMembersInjector =
        mortgageBreakFeeNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageBreakFeeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageBreakFeeNodeRuleProviderMembersInjector, new MortgageBreakFeeNodeRuleProvider());
  }

  public static Factory<MortgageBreakFeeNodeRuleProvider> create(
      MembersInjector<MortgageBreakFeeNodeRuleProvider>
          mortgageBreakFeeNodeRuleProviderMembersInjector) {
    return new MortgageBreakFeeNodeRuleProvider_Factory(
        mortgageBreakFeeNodeRuleProviderMembersInjector);
  }
}
