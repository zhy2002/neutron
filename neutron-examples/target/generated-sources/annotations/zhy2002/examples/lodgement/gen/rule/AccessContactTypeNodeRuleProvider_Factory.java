package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactTypeNodeRuleProvider_Factory
    implements Factory<AccessContactTypeNodeRuleProvider> {
  private final MembersInjector<AccessContactTypeNodeRuleProvider>
      accessContactTypeNodeRuleProviderMembersInjector;

  public AccessContactTypeNodeRuleProvider_Factory(
      MembersInjector<AccessContactTypeNodeRuleProvider>
          accessContactTypeNodeRuleProviderMembersInjector) {
    assert accessContactTypeNodeRuleProviderMembersInjector != null;
    this.accessContactTypeNodeRuleProviderMembersInjector =
        accessContactTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public AccessContactTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        accessContactTypeNodeRuleProviderMembersInjector, new AccessContactTypeNodeRuleProvider());
  }

  public static Factory<AccessContactTypeNodeRuleProvider> create(
      MembersInjector<AccessContactTypeNodeRuleProvider>
          accessContactTypeNodeRuleProviderMembersInjector) {
    return new AccessContactTypeNodeRuleProvider_Factory(
        accessContactTypeNodeRuleProviderMembersInjector);
  }
}
