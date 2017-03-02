package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnedOutrightFlagNodeRuleProvider_Factory
    implements Factory<OwnedOutrightFlagNodeRuleProvider> {
  private final MembersInjector<OwnedOutrightFlagNodeRuleProvider>
      ownedOutrightFlagNodeRuleProviderMembersInjector;

  public OwnedOutrightFlagNodeRuleProvider_Factory(
      MembersInjector<OwnedOutrightFlagNodeRuleProvider>
          ownedOutrightFlagNodeRuleProviderMembersInjector) {
    assert ownedOutrightFlagNodeRuleProviderMembersInjector != null;
    this.ownedOutrightFlagNodeRuleProviderMembersInjector =
        ownedOutrightFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public OwnedOutrightFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        ownedOutrightFlagNodeRuleProviderMembersInjector, new OwnedOutrightFlagNodeRuleProvider());
  }

  public static Factory<OwnedOutrightFlagNodeRuleProvider> create(
      MembersInjector<OwnedOutrightFlagNodeRuleProvider>
          ownedOutrightFlagNodeRuleProviderMembersInjector) {
    return new OwnedOutrightFlagNodeRuleProvider_Factory(
        ownedOutrightFlagNodeRuleProviderMembersInjector);
  }
}
