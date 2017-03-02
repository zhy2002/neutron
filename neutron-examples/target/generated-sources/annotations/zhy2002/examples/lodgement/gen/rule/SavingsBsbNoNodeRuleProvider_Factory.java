package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsBsbNoNodeRuleProvider_Factory
    implements Factory<SavingsBsbNoNodeRuleProvider> {
  private final MembersInjector<SavingsBsbNoNodeRuleProvider>
      savingsBsbNoNodeRuleProviderMembersInjector;

  public SavingsBsbNoNodeRuleProvider_Factory(
      MembersInjector<SavingsBsbNoNodeRuleProvider> savingsBsbNoNodeRuleProviderMembersInjector) {
    assert savingsBsbNoNodeRuleProviderMembersInjector != null;
    this.savingsBsbNoNodeRuleProviderMembersInjector = savingsBsbNoNodeRuleProviderMembersInjector;
  }

  @Override
  public SavingsBsbNoNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        savingsBsbNoNodeRuleProviderMembersInjector, new SavingsBsbNoNodeRuleProvider());
  }

  public static Factory<SavingsBsbNoNodeRuleProvider> create(
      MembersInjector<SavingsBsbNoNodeRuleProvider> savingsBsbNoNodeRuleProviderMembersInjector) {
    return new SavingsBsbNoNodeRuleProvider_Factory(savingsBsbNoNodeRuleProviderMembersInjector);
  }
}
