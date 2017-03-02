package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactEmailNodeRuleProvider_Factory
    implements Factory<ContactEmailNodeRuleProvider> {
  private final MembersInjector<ContactEmailNodeRuleProvider>
      contactEmailNodeRuleProviderMembersInjector;

  public ContactEmailNodeRuleProvider_Factory(
      MembersInjector<ContactEmailNodeRuleProvider> contactEmailNodeRuleProviderMembersInjector) {
    assert contactEmailNodeRuleProviderMembersInjector != null;
    this.contactEmailNodeRuleProviderMembersInjector = contactEmailNodeRuleProviderMembersInjector;
  }

  @Override
  public ContactEmailNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        contactEmailNodeRuleProviderMembersInjector, new ContactEmailNodeRuleProvider());
  }

  public static Factory<ContactEmailNodeRuleProvider> create(
      MembersInjector<ContactEmailNodeRuleProvider> contactEmailNodeRuleProviderMembersInjector) {
    return new ContactEmailNodeRuleProvider_Factory(contactEmailNodeRuleProviderMembersInjector);
  }
}
