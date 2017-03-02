package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessTelephoneNodeRuleProvider_Factory
    implements Factory<AccessTelephoneNodeRuleProvider> {
  private final MembersInjector<AccessTelephoneNodeRuleProvider>
      accessTelephoneNodeRuleProviderMembersInjector;

  public AccessTelephoneNodeRuleProvider_Factory(
      MembersInjector<AccessTelephoneNodeRuleProvider>
          accessTelephoneNodeRuleProviderMembersInjector) {
    assert accessTelephoneNodeRuleProviderMembersInjector != null;
    this.accessTelephoneNodeRuleProviderMembersInjector =
        accessTelephoneNodeRuleProviderMembersInjector;
  }

  @Override
  public AccessTelephoneNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        accessTelephoneNodeRuleProviderMembersInjector, new AccessTelephoneNodeRuleProvider());
  }

  public static Factory<AccessTelephoneNodeRuleProvider> create(
      MembersInjector<AccessTelephoneNodeRuleProvider>
          accessTelephoneNodeRuleProviderMembersInjector) {
    return new AccessTelephoneNodeRuleProvider_Factory(
        accessTelephoneNodeRuleProviderMembersInjector);
  }
}
