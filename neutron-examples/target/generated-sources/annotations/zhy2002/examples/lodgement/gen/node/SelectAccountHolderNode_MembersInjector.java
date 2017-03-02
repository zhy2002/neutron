package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SelectAccountHolderNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectAccountHolderNode_MembersInjector
    implements MembersInjector<SelectAccountHolderNode> {
  private final Provider<SelectAccountHolderNodeChildProvider> providerProvider;

  private final Provider<SelectAccountHolderNodeComponent.Builder> builderProvider;

  public SelectAccountHolderNode_MembersInjector(
      Provider<SelectAccountHolderNodeChildProvider> providerProvider,
      Provider<SelectAccountHolderNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SelectAccountHolderNode> create(
      Provider<SelectAccountHolderNodeChildProvider> providerProvider,
      Provider<SelectAccountHolderNodeComponent.Builder> builderProvider) {
    return new SelectAccountHolderNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(SelectAccountHolderNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      SelectAccountHolderNode instance,
      Provider<SelectAccountHolderNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      SelectAccountHolderNode instance,
      Provider<SelectAccountHolderNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
