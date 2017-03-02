package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessOtherDescriptionNodeRuleProvider_Factory
    implements Factory<AccessOtherDescriptionNodeRuleProvider> {
  private final MembersInjector<AccessOtherDescriptionNodeRuleProvider>
      accessOtherDescriptionNodeRuleProviderMembersInjector;

  public AccessOtherDescriptionNodeRuleProvider_Factory(
      MembersInjector<AccessOtherDescriptionNodeRuleProvider>
          accessOtherDescriptionNodeRuleProviderMembersInjector) {
    assert accessOtherDescriptionNodeRuleProviderMembersInjector != null;
    this.accessOtherDescriptionNodeRuleProviderMembersInjector =
        accessOtherDescriptionNodeRuleProviderMembersInjector;
  }

  @Override
  public AccessOtherDescriptionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        accessOtherDescriptionNodeRuleProviderMembersInjector,
        new AccessOtherDescriptionNodeRuleProvider());
  }

  public static Factory<AccessOtherDescriptionNodeRuleProvider> create(
      MembersInjector<AccessOtherDescriptionNodeRuleProvider>
          accessOtherDescriptionNodeRuleProviderMembersInjector) {
    return new AccessOtherDescriptionNodeRuleProvider_Factory(
        accessOtherDescriptionNodeRuleProviderMembersInjector);
  }
}
