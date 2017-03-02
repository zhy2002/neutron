package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccountHolderReferenceNodeRuleProvider_Factory
    implements Factory<AccountHolderReferenceNodeRuleProvider> {
  private final MembersInjector<AccountHolderReferenceNodeRuleProvider>
      accountHolderReferenceNodeRuleProviderMembersInjector;

  public AccountHolderReferenceNodeRuleProvider_Factory(
      MembersInjector<AccountHolderReferenceNodeRuleProvider>
          accountHolderReferenceNodeRuleProviderMembersInjector) {
    assert accountHolderReferenceNodeRuleProviderMembersInjector != null;
    this.accountHolderReferenceNodeRuleProviderMembersInjector =
        accountHolderReferenceNodeRuleProviderMembersInjector;
  }

  @Override
  public AccountHolderReferenceNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        accountHolderReferenceNodeRuleProviderMembersInjector,
        new AccountHolderReferenceNodeRuleProvider());
  }

  public static Factory<AccountHolderReferenceNodeRuleProvider> create(
      MembersInjector<AccountHolderReferenceNodeRuleProvider>
          accountHolderReferenceNodeRuleProviderMembersInjector) {
    return new AccountHolderReferenceNodeRuleProvider_Factory(
        accountHolderReferenceNodeRuleProviderMembersInjector);
  }
}
