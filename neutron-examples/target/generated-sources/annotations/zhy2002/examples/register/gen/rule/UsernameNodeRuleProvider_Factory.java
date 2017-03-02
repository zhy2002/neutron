package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsernameNodeRuleProvider_Factory implements Factory<UsernameNodeRuleProvider> {
  private final MembersInjector<UsernameNodeRuleProvider> usernameNodeRuleProviderMembersInjector;

  public UsernameNodeRuleProvider_Factory(
      MembersInjector<UsernameNodeRuleProvider> usernameNodeRuleProviderMembersInjector) {
    assert usernameNodeRuleProviderMembersInjector != null;
    this.usernameNodeRuleProviderMembersInjector = usernameNodeRuleProviderMembersInjector;
  }

  @Override
  public UsernameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        usernameNodeRuleProviderMembersInjector, new UsernameNodeRuleProvider());
  }

  public static Factory<UsernameNodeRuleProvider> create(
      MembersInjector<UsernameNodeRuleProvider> usernameNodeRuleProviderMembersInjector) {
    return new UsernameNodeRuleProvider_Factory(usernameNodeRuleProviderMembersInjector);
  }
}
