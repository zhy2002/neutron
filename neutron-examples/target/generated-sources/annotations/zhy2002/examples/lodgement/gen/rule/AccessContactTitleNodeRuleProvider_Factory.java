package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactTitleNodeRuleProvider_Factory
    implements Factory<AccessContactTitleNodeRuleProvider> {
  private final MembersInjector<AccessContactTitleNodeRuleProvider>
      accessContactTitleNodeRuleProviderMembersInjector;

  public AccessContactTitleNodeRuleProvider_Factory(
      MembersInjector<AccessContactTitleNodeRuleProvider>
          accessContactTitleNodeRuleProviderMembersInjector) {
    assert accessContactTitleNodeRuleProviderMembersInjector != null;
    this.accessContactTitleNodeRuleProviderMembersInjector =
        accessContactTitleNodeRuleProviderMembersInjector;
  }

  @Override
  public AccessContactTitleNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        accessContactTitleNodeRuleProviderMembersInjector,
        new AccessContactTitleNodeRuleProvider());
  }

  public static Factory<AccessContactTitleNodeRuleProvider> create(
      MembersInjector<AccessContactTitleNodeRuleProvider>
          accessContactTitleNodeRuleProviderMembersInjector) {
    return new AccessContactTitleNodeRuleProvider_Factory(
        accessContactTitleNodeRuleProviderMembersInjector);
  }
}
