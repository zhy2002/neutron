package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageNodeRuleProvider_Factory
    implements Factory<ExistingMortgageNodeRuleProvider> {
  private final MembersInjector<ExistingMortgageNodeRuleProvider>
      existingMortgageNodeRuleProviderMembersInjector;

  public ExistingMortgageNodeRuleProvider_Factory(
      MembersInjector<ExistingMortgageNodeRuleProvider>
          existingMortgageNodeRuleProviderMembersInjector) {
    assert existingMortgageNodeRuleProviderMembersInjector != null;
    this.existingMortgageNodeRuleProviderMembersInjector =
        existingMortgageNodeRuleProviderMembersInjector;
  }

  @Override
  public ExistingMortgageNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        existingMortgageNodeRuleProviderMembersInjector, new ExistingMortgageNodeRuleProvider());
  }

  public static Factory<ExistingMortgageNodeRuleProvider> create(
      MembersInjector<ExistingMortgageNodeRuleProvider>
          existingMortgageNodeRuleProviderMembersInjector) {
    return new ExistingMortgageNodeRuleProvider_Factory(
        existingMortgageNodeRuleProviderMembersInjector);
  }
}
