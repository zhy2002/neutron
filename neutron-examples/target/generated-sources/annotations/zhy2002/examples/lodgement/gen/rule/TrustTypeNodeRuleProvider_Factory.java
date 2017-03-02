package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustTypeNodeRuleProvider_Factory implements Factory<TrustTypeNodeRuleProvider> {
  private final MembersInjector<TrustTypeNodeRuleProvider> trustTypeNodeRuleProviderMembersInjector;

  public TrustTypeNodeRuleProvider_Factory(
      MembersInjector<TrustTypeNodeRuleProvider> trustTypeNodeRuleProviderMembersInjector) {
    assert trustTypeNodeRuleProviderMembersInjector != null;
    this.trustTypeNodeRuleProviderMembersInjector = trustTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustTypeNodeRuleProviderMembersInjector, new TrustTypeNodeRuleProvider());
  }

  public static Factory<TrustTypeNodeRuleProvider> create(
      MembersInjector<TrustTypeNodeRuleProvider> trustTypeNodeRuleProviderMembersInjector) {
    return new TrustTypeNodeRuleProvider_Factory(trustTypeNodeRuleProviderMembersInjector);
  }
}
