package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyLastNameNodeRuleProvider_Factory
    implements Factory<ThirdPartyLastNameNodeRuleProvider> {
  private final MembersInjector<ThirdPartyLastNameNodeRuleProvider>
      thirdPartyLastNameNodeRuleProviderMembersInjector;

  public ThirdPartyLastNameNodeRuleProvider_Factory(
      MembersInjector<ThirdPartyLastNameNodeRuleProvider>
          thirdPartyLastNameNodeRuleProviderMembersInjector) {
    assert thirdPartyLastNameNodeRuleProviderMembersInjector != null;
    this.thirdPartyLastNameNodeRuleProviderMembersInjector =
        thirdPartyLastNameNodeRuleProviderMembersInjector;
  }

  @Override
  public ThirdPartyLastNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        thirdPartyLastNameNodeRuleProviderMembersInjector,
        new ThirdPartyLastNameNodeRuleProvider());
  }

  public static Factory<ThirdPartyLastNameNodeRuleProvider> create(
      MembersInjector<ThirdPartyLastNameNodeRuleProvider>
          thirdPartyLastNameNodeRuleProviderMembersInjector) {
    return new ThirdPartyLastNameNodeRuleProvider_Factory(
        thirdPartyLastNameNodeRuleProviderMembersInjector);
  }
}
