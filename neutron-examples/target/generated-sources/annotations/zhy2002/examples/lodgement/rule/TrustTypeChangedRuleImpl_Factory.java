package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.TrustTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustTypeChangedRuleImpl_Factory implements Factory<TrustTypeChangedRuleImpl> {
  private final MembersInjector<TrustTypeChangedRuleImpl> trustTypeChangedRuleImplMembersInjector;

  private final Provider<TrustTypeNode> ownerProvider;

  public TrustTypeChangedRuleImpl_Factory(
      MembersInjector<TrustTypeChangedRuleImpl> trustTypeChangedRuleImplMembersInjector,
      Provider<TrustTypeNode> ownerProvider) {
    assert trustTypeChangedRuleImplMembersInjector != null;
    this.trustTypeChangedRuleImplMembersInjector = trustTypeChangedRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public TrustTypeChangedRuleImpl get() {
    return MembersInjectors.injectMembers(
        trustTypeChangedRuleImplMembersInjector, new TrustTypeChangedRuleImpl(ownerProvider.get()));
  }

  public static Factory<TrustTypeChangedRuleImpl> create(
      MembersInjector<TrustTypeChangedRuleImpl> trustTypeChangedRuleImplMembersInjector,
      Provider<TrustTypeNode> ownerProvider) {
    return new TrustTypeChangedRuleImpl_Factory(
        trustTypeChangedRuleImplMembersInjector, ownerProvider);
  }
}
