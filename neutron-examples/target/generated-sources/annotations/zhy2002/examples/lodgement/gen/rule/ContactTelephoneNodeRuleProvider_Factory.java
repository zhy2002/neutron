package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactTelephoneNodeRuleProvider_Factory
    implements Factory<ContactTelephoneNodeRuleProvider> {
  private final MembersInjector<ContactTelephoneNodeRuleProvider>
      contactTelephoneNodeRuleProviderMembersInjector;

  public ContactTelephoneNodeRuleProvider_Factory(
      MembersInjector<ContactTelephoneNodeRuleProvider>
          contactTelephoneNodeRuleProviderMembersInjector) {
    assert contactTelephoneNodeRuleProviderMembersInjector != null;
    this.contactTelephoneNodeRuleProviderMembersInjector =
        contactTelephoneNodeRuleProviderMembersInjector;
  }

  @Override
  public ContactTelephoneNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        contactTelephoneNodeRuleProviderMembersInjector, new ContactTelephoneNodeRuleProvider());
  }

  public static Factory<ContactTelephoneNodeRuleProvider> create(
      MembersInjector<ContactTelephoneNodeRuleProvider>
          contactTelephoneNodeRuleProviderMembersInjector) {
    return new ContactTelephoneNodeRuleProvider_Factory(
        contactTelephoneNodeRuleProviderMembersInjector);
  }
}
