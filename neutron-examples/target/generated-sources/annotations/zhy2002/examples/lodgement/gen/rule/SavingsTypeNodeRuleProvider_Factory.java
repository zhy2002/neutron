package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsTypeNodeRuleProvider_Factory
    implements Factory<SavingsTypeNodeRuleProvider> {
  private final MembersInjector<SavingsTypeNodeRuleProvider>
      savingsTypeNodeRuleProviderMembersInjector;

  public SavingsTypeNodeRuleProvider_Factory(
      MembersInjector<SavingsTypeNodeRuleProvider> savingsTypeNodeRuleProviderMembersInjector) {
    assert savingsTypeNodeRuleProviderMembersInjector != null;
    this.savingsTypeNodeRuleProviderMembersInjector = savingsTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public SavingsTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        savingsTypeNodeRuleProviderMembersInjector, new SavingsTypeNodeRuleProvider());
  }

  public static Factory<SavingsTypeNodeRuleProvider> create(
      MembersInjector<SavingsTypeNodeRuleProvider> savingsTypeNodeRuleProviderMembersInjector) {
    return new SavingsTypeNodeRuleProvider_Factory(savingsTypeNodeRuleProviderMembersInjector);
  }
}
