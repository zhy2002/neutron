package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PasswordNodeRuleProvider_Factory implements Factory<PasswordNodeRuleProvider> {
  private final MembersInjector<PasswordNodeRuleProvider> passwordNodeRuleProviderMembersInjector;

  public PasswordNodeRuleProvider_Factory(
      MembersInjector<PasswordNodeRuleProvider> passwordNodeRuleProviderMembersInjector) {
    assert passwordNodeRuleProviderMembersInjector != null;
    this.passwordNodeRuleProviderMembersInjector = passwordNodeRuleProviderMembersInjector;
  }

  @Override
  public PasswordNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        passwordNodeRuleProviderMembersInjector, new PasswordNodeRuleProvider());
  }

  public static Factory<PasswordNodeRuleProvider> create(
      MembersInjector<PasswordNodeRuleProvider> passwordNodeRuleProviderMembersInjector) {
    return new PasswordNodeRuleProvider_Factory(passwordNodeRuleProviderMembersInjector);
  }
}
