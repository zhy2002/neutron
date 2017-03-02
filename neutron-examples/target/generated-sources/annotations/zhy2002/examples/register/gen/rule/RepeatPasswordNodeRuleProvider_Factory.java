package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RepeatPasswordNodeRuleProvider_Factory
    implements Factory<RepeatPasswordNodeRuleProvider> {
  private final MembersInjector<RepeatPasswordNodeRuleProvider>
      repeatPasswordNodeRuleProviderMembersInjector;

  public RepeatPasswordNodeRuleProvider_Factory(
      MembersInjector<RepeatPasswordNodeRuleProvider>
          repeatPasswordNodeRuleProviderMembersInjector) {
    assert repeatPasswordNodeRuleProviderMembersInjector != null;
    this.repeatPasswordNodeRuleProviderMembersInjector =
        repeatPasswordNodeRuleProviderMembersInjector;
  }

  @Override
  public RepeatPasswordNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        repeatPasswordNodeRuleProviderMembersInjector, new RepeatPasswordNodeRuleProvider());
  }

  public static Factory<RepeatPasswordNodeRuleProvider> create(
      MembersInjector<RepeatPasswordNodeRuleProvider>
          repeatPasswordNodeRuleProviderMembersInjector) {
    return new RepeatPasswordNodeRuleProvider_Factory(
        repeatPasswordNodeRuleProviderMembersInjector);
  }
}
