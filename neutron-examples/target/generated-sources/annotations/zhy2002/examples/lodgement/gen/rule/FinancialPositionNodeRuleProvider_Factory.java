package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FinancialPositionNodeRuleProvider_Factory
    implements Factory<FinancialPositionNodeRuleProvider> {
  private final MembersInjector<FinancialPositionNodeRuleProvider>
      financialPositionNodeRuleProviderMembersInjector;

  public FinancialPositionNodeRuleProvider_Factory(
      MembersInjector<FinancialPositionNodeRuleProvider>
          financialPositionNodeRuleProviderMembersInjector) {
    assert financialPositionNodeRuleProviderMembersInjector != null;
    this.financialPositionNodeRuleProviderMembersInjector =
        financialPositionNodeRuleProviderMembersInjector;
  }

  @Override
  public FinancialPositionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        financialPositionNodeRuleProviderMembersInjector, new FinancialPositionNodeRuleProvider());
  }

  public static Factory<FinancialPositionNodeRuleProvider> create(
      MembersInjector<FinancialPositionNodeRuleProvider>
          financialPositionNodeRuleProviderMembersInjector) {
    return new FinancialPositionNodeRuleProvider_Factory(
        financialPositionNodeRuleProviderMembersInjector);
  }
}
