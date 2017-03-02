package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneInfoNodeRuleProvider_Factory implements Factory<PhoneInfoNodeRuleProvider> {
  private final MembersInjector<PhoneInfoNodeRuleProvider> phoneInfoNodeRuleProviderMembersInjector;

  public PhoneInfoNodeRuleProvider_Factory(
      MembersInjector<PhoneInfoNodeRuleProvider> phoneInfoNodeRuleProviderMembersInjector) {
    assert phoneInfoNodeRuleProviderMembersInjector != null;
    this.phoneInfoNodeRuleProviderMembersInjector = phoneInfoNodeRuleProviderMembersInjector;
  }

  @Override
  public PhoneInfoNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        phoneInfoNodeRuleProviderMembersInjector, new PhoneInfoNodeRuleProvider());
  }

  public static Factory<PhoneInfoNodeRuleProvider> create(
      MembersInjector<PhoneInfoNodeRuleProvider> phoneInfoNodeRuleProviderMembersInjector) {
    return new PhoneInfoNodeRuleProvider_Factory(phoneInfoNodeRuleProviderMembersInjector);
  }
}
