package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustNameNodeRuleProvider_Factory implements Factory<TrustNameNodeRuleProvider> {
  private final MembersInjector<TrustNameNodeRuleProvider> trustNameNodeRuleProviderMembersInjector;

  public TrustNameNodeRuleProvider_Factory(
      MembersInjector<TrustNameNodeRuleProvider> trustNameNodeRuleProviderMembersInjector) {
    assert trustNameNodeRuleProviderMembersInjector != null;
    this.trustNameNodeRuleProviderMembersInjector = trustNameNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustNameNodeRuleProviderMembersInjector, new TrustNameNodeRuleProvider());
  }

  public static Factory<TrustNameNodeRuleProvider> create(
      MembersInjector<TrustNameNodeRuleProvider> trustNameNodeRuleProviderMembersInjector) {
    return new TrustNameNodeRuleProvider_Factory(trustNameNodeRuleProviderMembersInjector);
  }
}
