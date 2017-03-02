package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorNodeRuleProvider_Factory implements Factory<ErrorNodeRuleProvider> {
  private final MembersInjector<ErrorNodeRuleProvider> errorNodeRuleProviderMembersInjector;

  public ErrorNodeRuleProvider_Factory(
      MembersInjector<ErrorNodeRuleProvider> errorNodeRuleProviderMembersInjector) {
    assert errorNodeRuleProviderMembersInjector != null;
    this.errorNodeRuleProviderMembersInjector = errorNodeRuleProviderMembersInjector;
  }

  @Override
  public ErrorNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        errorNodeRuleProviderMembersInjector, new ErrorNodeRuleProvider());
  }

  public static Factory<ErrorNodeRuleProvider> create(
      MembersInjector<ErrorNodeRuleProvider> errorNodeRuleProviderMembersInjector) {
    return new ErrorNodeRuleProvider_Factory(errorNodeRuleProviderMembersInjector);
  }
}
