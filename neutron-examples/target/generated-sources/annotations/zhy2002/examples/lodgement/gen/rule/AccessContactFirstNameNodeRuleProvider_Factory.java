package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactFirstNameNodeRuleProvider_Factory
    implements Factory<AccessContactFirstNameNodeRuleProvider> {
  private final MembersInjector<AccessContactFirstNameNodeRuleProvider>
      accessContactFirstNameNodeRuleProviderMembersInjector;

  public AccessContactFirstNameNodeRuleProvider_Factory(
      MembersInjector<AccessContactFirstNameNodeRuleProvider>
          accessContactFirstNameNodeRuleProviderMembersInjector) {
    assert accessContactFirstNameNodeRuleProviderMembersInjector != null;
    this.accessContactFirstNameNodeRuleProviderMembersInjector =
        accessContactFirstNameNodeRuleProviderMembersInjector;
  }

  @Override
  public AccessContactFirstNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        accessContactFirstNameNodeRuleProviderMembersInjector,
        new AccessContactFirstNameNodeRuleProvider());
  }

  public static Factory<AccessContactFirstNameNodeRuleProvider> create(
      MembersInjector<AccessContactFirstNameNodeRuleProvider>
          accessContactFirstNameNodeRuleProviderMembersInjector) {
    return new AccessContactFirstNameNodeRuleProvider_Factory(
        accessContactFirstNameNodeRuleProviderMembersInjector);
  }
}
