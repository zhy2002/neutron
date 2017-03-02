package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactLastNameNodeRuleProvider_Factory
    implements Factory<AccessContactLastNameNodeRuleProvider> {
  private final MembersInjector<AccessContactLastNameNodeRuleProvider>
      accessContactLastNameNodeRuleProviderMembersInjector;

  public AccessContactLastNameNodeRuleProvider_Factory(
      MembersInjector<AccessContactLastNameNodeRuleProvider>
          accessContactLastNameNodeRuleProviderMembersInjector) {
    assert accessContactLastNameNodeRuleProviderMembersInjector != null;
    this.accessContactLastNameNodeRuleProviderMembersInjector =
        accessContactLastNameNodeRuleProviderMembersInjector;
  }

  @Override
  public AccessContactLastNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        accessContactLastNameNodeRuleProviderMembersInjector,
        new AccessContactLastNameNodeRuleProvider());
  }

  public static Factory<AccessContactLastNameNodeRuleProvider> create(
      MembersInjector<AccessContactLastNameNodeRuleProvider>
          accessContactLastNameNodeRuleProviderMembersInjector) {
    return new AccessContactLastNameNodeRuleProvider_Factory(
        accessContactLastNameNodeRuleProviderMembersInjector);
  }
}
