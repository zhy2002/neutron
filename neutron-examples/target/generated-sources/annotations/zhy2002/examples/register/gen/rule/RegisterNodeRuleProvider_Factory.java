package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNodeRuleProvider_Factory implements Factory<RegisterNodeRuleProvider> {
  private final MembersInjector<RegisterNodeRuleProvider> registerNodeRuleProviderMembersInjector;

  public RegisterNodeRuleProvider_Factory(
      MembersInjector<RegisterNodeRuleProvider> registerNodeRuleProviderMembersInjector) {
    assert registerNodeRuleProviderMembersInjector != null;
    this.registerNodeRuleProviderMembersInjector = registerNodeRuleProviderMembersInjector;
  }

  @Override
  public RegisterNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        registerNodeRuleProviderMembersInjector, new RegisterNodeRuleProvider());
  }

  public static Factory<RegisterNodeRuleProvider> create(
      MembersInjector<RegisterNodeRuleProvider> registerNodeRuleProviderMembersInjector) {
    return new RegisterNodeRuleProvider_Factory(registerNodeRuleProviderMembersInjector);
  }
}
