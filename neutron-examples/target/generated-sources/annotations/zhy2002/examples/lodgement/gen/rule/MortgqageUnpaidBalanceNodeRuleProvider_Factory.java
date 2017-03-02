package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgqageUnpaidBalanceNodeRuleProvider_Factory
    implements Factory<MortgqageUnpaidBalanceNodeRuleProvider> {
  private final MembersInjector<MortgqageUnpaidBalanceNodeRuleProvider>
      mortgqageUnpaidBalanceNodeRuleProviderMembersInjector;

  public MortgqageUnpaidBalanceNodeRuleProvider_Factory(
      MembersInjector<MortgqageUnpaidBalanceNodeRuleProvider>
          mortgqageUnpaidBalanceNodeRuleProviderMembersInjector) {
    assert mortgqageUnpaidBalanceNodeRuleProviderMembersInjector != null;
    this.mortgqageUnpaidBalanceNodeRuleProviderMembersInjector =
        mortgqageUnpaidBalanceNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgqageUnpaidBalanceNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgqageUnpaidBalanceNodeRuleProviderMembersInjector,
        new MortgqageUnpaidBalanceNodeRuleProvider());
  }

  public static Factory<MortgqageUnpaidBalanceNodeRuleProvider> create(
      MembersInjector<MortgqageUnpaidBalanceNodeRuleProvider>
          mortgqageUnpaidBalanceNodeRuleProviderMembersInjector) {
    return new MortgqageUnpaidBalanceNodeRuleProvider_Factory(
        mortgqageUnpaidBalanceNodeRuleProviderMembersInjector);
  }
}
