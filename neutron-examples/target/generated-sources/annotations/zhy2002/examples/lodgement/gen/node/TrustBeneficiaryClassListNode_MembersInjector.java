package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustBeneficiaryClassListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassListNode_MembersInjector
    implements MembersInjector<TrustBeneficiaryClassListNode> {
  private final Provider<TrustBeneficiaryClassListNodeItemProvider> providerProvider;

  private final Provider<TrustBeneficiaryClassListNodeComponent.Builder> builderProvider;

  public TrustBeneficiaryClassListNode_MembersInjector(
      Provider<TrustBeneficiaryClassListNodeItemProvider> providerProvider,
      Provider<TrustBeneficiaryClassListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustBeneficiaryClassListNode> create(
      Provider<TrustBeneficiaryClassListNodeItemProvider> providerProvider,
      Provider<TrustBeneficiaryClassListNodeComponent.Builder> builderProvider) {
    return new TrustBeneficiaryClassListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(TrustBeneficiaryClassListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      TrustBeneficiaryClassListNode instance,
      Provider<TrustBeneficiaryClassListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      TrustBeneficiaryClassListNode instance,
      Provider<TrustBeneficiaryClassListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
