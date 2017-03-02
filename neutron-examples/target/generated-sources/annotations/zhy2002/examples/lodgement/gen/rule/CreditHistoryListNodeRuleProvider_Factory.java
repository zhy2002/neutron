package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryListNodeRuleProvider_Factory
    implements Factory<CreditHistoryListNodeRuleProvider> {
  private final MembersInjector<CreditHistoryListNodeRuleProvider>
      creditHistoryListNodeRuleProviderMembersInjector;

  public CreditHistoryListNodeRuleProvider_Factory(
      MembersInjector<CreditHistoryListNodeRuleProvider>
          creditHistoryListNodeRuleProviderMembersInjector) {
    assert creditHistoryListNodeRuleProviderMembersInjector != null;
    this.creditHistoryListNodeRuleProviderMembersInjector =
        creditHistoryListNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditHistoryListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditHistoryListNodeRuleProviderMembersInjector, new CreditHistoryListNodeRuleProvider());
  }

  public static Factory<CreditHistoryListNodeRuleProvider> create(
      MembersInjector<CreditHistoryListNodeRuleProvider>
          creditHistoryListNodeRuleProviderMembersInjector) {
    return new CreditHistoryListNodeRuleProvider_Factory(
        creditHistoryListNodeRuleProviderMembersInjector);
  }
}
