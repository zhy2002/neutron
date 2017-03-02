package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnInvestmentPropertyNodeRuleProvider_Factory
    implements Factory<OwnInvestmentPropertyNodeRuleProvider> {
  private final MembersInjector<OwnInvestmentPropertyNodeRuleProvider>
      ownInvestmentPropertyNodeRuleProviderMembersInjector;

  public OwnInvestmentPropertyNodeRuleProvider_Factory(
      MembersInjector<OwnInvestmentPropertyNodeRuleProvider>
          ownInvestmentPropertyNodeRuleProviderMembersInjector) {
    assert ownInvestmentPropertyNodeRuleProviderMembersInjector != null;
    this.ownInvestmentPropertyNodeRuleProviderMembersInjector =
        ownInvestmentPropertyNodeRuleProviderMembersInjector;
  }

  @Override
  public OwnInvestmentPropertyNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        ownInvestmentPropertyNodeRuleProviderMembersInjector,
        new OwnInvestmentPropertyNodeRuleProvider());
  }

  public static Factory<OwnInvestmentPropertyNodeRuleProvider> create(
      MembersInjector<OwnInvestmentPropertyNodeRuleProvider>
          ownInvestmentPropertyNodeRuleProviderMembersInjector) {
    return new OwnInvestmentPropertyNodeRuleProvider_Factory(
        ownInvestmentPropertyNodeRuleProviderMembersInjector);
  }
}
