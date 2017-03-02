package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustBeneficialOwnerListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficialOwnerListNode_MembersInjector
    implements MembersInjector<TrustBeneficialOwnerListNode> {
  private final Provider<SelectAccountHolderListNodeItemProvider> providerProvider;

  private final Provider<TrustBeneficialOwnerListNodeComponent.Builder> builderProvider;

  public TrustBeneficialOwnerListNode_MembersInjector(
      Provider<SelectAccountHolderListNodeItemProvider> providerProvider,
      Provider<TrustBeneficialOwnerListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustBeneficialOwnerListNode> create(
      Provider<SelectAccountHolderListNodeItemProvider> providerProvider,
      Provider<TrustBeneficialOwnerListNodeComponent.Builder> builderProvider) {
    return new TrustBeneficialOwnerListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(TrustBeneficialOwnerListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((SelectAccountHolderListNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustBeneficialOwnerListNode instance,
      Provider<TrustBeneficialOwnerListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
