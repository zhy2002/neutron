package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LastNameNodeRuleProvider_Factory implements Factory<LastNameNodeRuleProvider> {
  private final MembersInjector<LastNameNodeRuleProvider> lastNameNodeRuleProviderMembersInjector;

  public LastNameNodeRuleProvider_Factory(
      MembersInjector<LastNameNodeRuleProvider> lastNameNodeRuleProviderMembersInjector) {
    assert lastNameNodeRuleProviderMembersInjector != null;
    this.lastNameNodeRuleProviderMembersInjector = lastNameNodeRuleProviderMembersInjector;
  }

  @Override
  public LastNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        lastNameNodeRuleProviderMembersInjector, new LastNameNodeRuleProvider());
  }

  public static Factory<LastNameNodeRuleProvider> create(
      MembersInjector<LastNameNodeRuleProvider> lastNameNodeRuleProviderMembersInjector) {
    return new LastNameNodeRuleProvider_Factory(lastNameNodeRuleProviderMembersInjector);
  }
}
