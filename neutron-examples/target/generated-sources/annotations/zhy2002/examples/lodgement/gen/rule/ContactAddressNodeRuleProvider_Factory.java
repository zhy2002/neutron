package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactAddressNodeRuleProvider_Factory
    implements Factory<ContactAddressNodeRuleProvider> {
  private final MembersInjector<ContactAddressNodeRuleProvider>
      contactAddressNodeRuleProviderMembersInjector;

  public ContactAddressNodeRuleProvider_Factory(
      MembersInjector<ContactAddressNodeRuleProvider>
          contactAddressNodeRuleProviderMembersInjector) {
    assert contactAddressNodeRuleProviderMembersInjector != null;
    this.contactAddressNodeRuleProviderMembersInjector =
        contactAddressNodeRuleProviderMembersInjector;
  }

  @Override
  public ContactAddressNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        contactAddressNodeRuleProviderMembersInjector, new ContactAddressNodeRuleProvider());
  }

  public static Factory<ContactAddressNodeRuleProvider> create(
      MembersInjector<ContactAddressNodeRuleProvider>
          contactAddressNodeRuleProviderMembersInjector) {
    return new ContactAddressNodeRuleProvider_Factory(
        contactAddressNodeRuleProviderMembersInjector);
  }
}
