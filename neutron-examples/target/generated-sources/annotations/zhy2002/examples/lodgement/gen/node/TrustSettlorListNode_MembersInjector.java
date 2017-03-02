package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TrustSettlorListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustSettlorListNode_MembersInjector
    implements MembersInjector<TrustSettlorListNode> {
  private final Provider<SelectAccountHolderListNodeItemProvider> providerProvider;

  private final Provider<TrustSettlorListNodeComponent.Builder> builderProvider;

  public TrustSettlorListNode_MembersInjector(
      Provider<SelectAccountHolderListNodeItemProvider> providerProvider,
      Provider<TrustSettlorListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TrustSettlorListNode> create(
      Provider<SelectAccountHolderListNodeItemProvider> providerProvider,
      Provider<TrustSettlorListNodeComponent.Builder> builderProvider) {
    return new TrustSettlorListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(TrustSettlorListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((SelectAccountHolderListNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TrustSettlorListNode instance,
      Provider<TrustSettlorListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}