package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessNodeRuleProvider_Factory implements Factory<AccessNodeRuleProvider> {
  private final MembersInjector<AccessNodeRuleProvider> accessNodeRuleProviderMembersInjector;

  public AccessNodeRuleProvider_Factory(
      MembersInjector<AccessNodeRuleProvider> accessNodeRuleProviderMembersInjector) {
    assert accessNodeRuleProviderMembersInjector != null;
    this.accessNodeRuleProviderMembersInjector = accessNodeRuleProviderMembersInjector;
  }

  @Override
  public AccessNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        accessNodeRuleProviderMembersInjector, new AccessNodeRuleProvider());
  }

  public static Factory<AccessNodeRuleProvider> create(
      MembersInjector<AccessNodeRuleProvider> accessNodeRuleProviderMembersInjector) {
    return new AccessNodeRuleProvider_Factory(accessNodeRuleProviderMembersInjector);
  }
}
