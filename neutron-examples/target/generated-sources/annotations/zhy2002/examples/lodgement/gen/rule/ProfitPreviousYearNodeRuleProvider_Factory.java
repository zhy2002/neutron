package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProfitPreviousYearNodeRuleProvider_Factory
    implements Factory<ProfitPreviousYearNodeRuleProvider> {
  private final MembersInjector<ProfitPreviousYearNodeRuleProvider>
      profitPreviousYearNodeRuleProviderMembersInjector;

  public ProfitPreviousYearNodeRuleProvider_Factory(
      MembersInjector<ProfitPreviousYearNodeRuleProvider>
          profitPreviousYearNodeRuleProviderMembersInjector) {
    assert profitPreviousYearNodeRuleProviderMembersInjector != null;
    this.profitPreviousYearNodeRuleProviderMembersInjector =
        profitPreviousYearNodeRuleProviderMembersInjector;
  }

  @Override
  public ProfitPreviousYearNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        profitPreviousYearNodeRuleProviderMembersInjector,
        new ProfitPreviousYearNodeRuleProvider());
  }

  public static Factory<ProfitPreviousYearNodeRuleProvider> create(
      MembersInjector<ProfitPreviousYearNodeRuleProvider>
          profitPreviousYearNodeRuleProviderMembersInjector) {
    return new ProfitPreviousYearNodeRuleProvider_Factory(
        profitPreviousYearNodeRuleProviderMembersInjector);
  }
}
