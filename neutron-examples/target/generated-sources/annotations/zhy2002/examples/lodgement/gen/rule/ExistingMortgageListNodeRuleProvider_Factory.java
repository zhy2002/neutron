package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageListNodeRuleProvider_Factory
    implements Factory<ExistingMortgageListNodeRuleProvider> {
  private final MembersInjector<ExistingMortgageListNodeRuleProvider>
      existingMortgageListNodeRuleProviderMembersInjector;

  public ExistingMortgageListNodeRuleProvider_Factory(
      MembersInjector<ExistingMortgageListNodeRuleProvider>
          existingMortgageListNodeRuleProviderMembersInjector) {
    assert existingMortgageListNodeRuleProviderMembersInjector != null;
    this.existingMortgageListNodeRuleProviderMembersInjector =
        existingMortgageListNodeRuleProviderMembersInjector;
  }

  @Override
  public ExistingMortgageListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        existingMortgageListNodeRuleProviderMembersInjector,
        new ExistingMortgageListNodeRuleProvider());
  }

  public static Factory<ExistingMortgageListNodeRuleProvider> create(
      MembersInjector<ExistingMortgageListNodeRuleProvider>
          existingMortgageListNodeRuleProviderMembersInjector) {
    return new ExistingMortgageListNodeRuleProvider_Factory(
        existingMortgageListNodeRuleProviderMembersInjector);
  }
}
