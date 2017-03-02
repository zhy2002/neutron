package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProfitThisYearNodeRuleProvider_Factory
    implements Factory<ProfitThisYearNodeRuleProvider> {
  private final MembersInjector<ProfitThisYearNodeRuleProvider>
      profitThisYearNodeRuleProviderMembersInjector;

  public ProfitThisYearNodeRuleProvider_Factory(
      MembersInjector<ProfitThisYearNodeRuleProvider>
          profitThisYearNodeRuleProviderMembersInjector) {
    assert profitThisYearNodeRuleProviderMembersInjector != null;
    this.profitThisYearNodeRuleProviderMembersInjector =
        profitThisYearNodeRuleProviderMembersInjector;
  }

  @Override
  public ProfitThisYearNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        profitThisYearNodeRuleProviderMembersInjector, new ProfitThisYearNodeRuleProvider());
  }

  public static Factory<ProfitThisYearNodeRuleProvider> create(
      MembersInjector<ProfitThisYearNodeRuleProvider>
          profitThisYearNodeRuleProviderMembersInjector) {
    return new ProfitThisYearNodeRuleProvider_Factory(
        profitThisYearNodeRuleProviderMembersInjector);
  }
}
