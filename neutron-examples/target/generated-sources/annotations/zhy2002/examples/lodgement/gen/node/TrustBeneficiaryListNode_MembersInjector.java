package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustBeneficiaryListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryListNode_MembersInjector
    implements MembersInjector<TrustBeneficiaryListNode> {
  private final Provider<SelectAccountHolderListNodeItemProvider> providerProvider;

  private final Provider<TrustBeneficiaryListNodeComponent.Builder> builderProvider;

  public TrustBeneficiaryListNode_MembersInjector(
      Provider<SelectAccountHolderListNodeItemProvider> providerProvider,
      Provider<TrustBeneficiaryListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustBeneficiaryListNode> create(
      Provider<SelectAccountHolderListNodeItemProvider> providerProvider,
      Provider<TrustBeneficiaryListNodeComponent.Builder> builderProvider) {
    return new TrustBeneficiaryListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(TrustBeneficiaryListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((SelectAccountHolderListNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustBeneficiaryListNode instance,
      Provider<TrustBeneficiaryListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
