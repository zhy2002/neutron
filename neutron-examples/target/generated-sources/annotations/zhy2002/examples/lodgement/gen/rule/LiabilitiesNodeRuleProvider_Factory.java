package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LiabilitiesNodeRuleProvider_Factory
    implements Factory<LiabilitiesNodeRuleProvider> {
  private final MembersInjector<LiabilitiesNodeRuleProvider>
      liabilitiesNodeRuleProviderMembersInjector;

  public LiabilitiesNodeRuleProvider_Factory(
      MembersInjector<LiabilitiesNodeRuleProvider> liabilitiesNodeRuleProviderMembersInjector) {
    assert liabilitiesNodeRuleProviderMembersInjector != null;
    this.liabilitiesNodeRuleProviderMembersInjector = liabilitiesNodeRuleProviderMembersInjector;
  }

  @Override
  public LiabilitiesNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        liabilitiesNodeRuleProviderMembersInjector, new LiabilitiesNodeRuleProvider());
  }

  public static Factory<LiabilitiesNodeRuleProvider> create(
      MembersInjector<LiabilitiesNodeRuleProvider> liabilitiesNodeRuleProviderMembersInjector) {
    return new LiabilitiesNodeRuleProvider_Factory(liabilitiesNodeRuleProviderMembersInjector);
  }
}
