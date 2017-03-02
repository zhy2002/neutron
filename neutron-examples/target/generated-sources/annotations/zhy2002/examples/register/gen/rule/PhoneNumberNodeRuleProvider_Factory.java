package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneNumberNodeRuleProvider_Factory
    implements Factory<PhoneNumberNodeRuleProvider> {
  private final MembersInjector<PhoneNumberNodeRuleProvider>
      phoneNumberNodeRuleProviderMembersInjector;

  public PhoneNumberNodeRuleProvider_Factory(
      MembersInjector<PhoneNumberNodeRuleProvider> phoneNumberNodeRuleProviderMembersInjector) {
    assert phoneNumberNodeRuleProviderMembersInjector != null;
    this.phoneNumberNodeRuleProviderMembersInjector = phoneNumberNodeRuleProviderMembersInjector;
  }

  @Override
  public PhoneNumberNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        phoneNumberNodeRuleProviderMembersInjector, new PhoneNumberNodeRuleProvider());
  }

  public static Factory<PhoneNumberNodeRuleProvider> create(
      MembersInjector<PhoneNumberNodeRuleProvider> phoneNumberNodeRuleProviderMembersInjector) {
    return new PhoneNumberNodeRuleProvider_Factory(phoneNumberNodeRuleProviderMembersInjector);
  }
}
