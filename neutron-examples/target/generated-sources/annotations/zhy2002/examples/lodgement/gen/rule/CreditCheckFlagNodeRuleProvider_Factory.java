package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCheckFlagNodeRuleProvider_Factory
    implements Factory<CreditCheckFlagNodeRuleProvider> {
  private final MembersInjector<CreditCheckFlagNodeRuleProvider>
      creditCheckFlagNodeRuleProviderMembersInjector;

  public CreditCheckFlagNodeRuleProvider_Factory(
      MembersInjector<CreditCheckFlagNodeRuleProvider>
          creditCheckFlagNodeRuleProviderMembersInjector) {
    assert creditCheckFlagNodeRuleProviderMembersInjector != null;
    this.creditCheckFlagNodeRuleProviderMembersInjector =
        creditCheckFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCheckFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCheckFlagNodeRuleProviderMembersInjector, new CreditCheckFlagNodeRuleProvider());
  }

  public static Factory<CreditCheckFlagNodeRuleProvider> create(
      MembersInjector<CreditCheckFlagNodeRuleProvider>
          creditCheckFlagNodeRuleProviderMembersInjector) {
    return new CreditCheckFlagNodeRuleProvider_Factory(
        creditCheckFlagNodeRuleProviderMembersInjector);
  }
}
