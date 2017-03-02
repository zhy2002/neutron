package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryNodeRuleProvider_Factory
    implements Factory<CreditHistoryNodeRuleProvider> {
  private final MembersInjector<CreditHistoryNodeRuleProvider>
      creditHistoryNodeRuleProviderMembersInjector;

  public CreditHistoryNodeRuleProvider_Factory(
      MembersInjector<CreditHistoryNodeRuleProvider> creditHistoryNodeRuleProviderMembersInjector) {
    assert creditHistoryNodeRuleProviderMembersInjector != null;
    this.creditHistoryNodeRuleProviderMembersInjector =
        creditHistoryNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditHistoryNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditHistoryNodeRuleProviderMembersInjector, new CreditHistoryNodeRuleProvider());
  }

  public static Factory<CreditHistoryNodeRuleProvider> create(
      MembersInjector<CreditHistoryNodeRuleProvider> creditHistoryNodeRuleProviderMembersInjector) {
    return new CreditHistoryNodeRuleProvider_Factory(creditHistoryNodeRuleProviderMembersInjector);
  }
}
