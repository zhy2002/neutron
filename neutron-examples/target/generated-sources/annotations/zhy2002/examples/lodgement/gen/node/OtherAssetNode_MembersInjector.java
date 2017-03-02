package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherAssetNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetNode_MembersInjector implements MembersInjector<OtherAssetNode> {
  private final Provider<OtherAssetNodeChildProvider> providerProvider;

  private final Provider<OtherAssetNodeComponent.Builder> builderProvider;

  public OtherAssetNode_MembersInjector(
      Provider<OtherAssetNodeChildProvider> providerProvider,
      Provider<OtherAssetNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherAssetNode> create(
      Provider<OtherAssetNodeChildProvider> providerProvider,
      Provider<OtherAssetNodeComponent.Builder> builderProvider) {
    return new OtherAssetNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(OtherAssetNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      OtherAssetNode instance, Provider<OtherAssetNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      OtherAssetNode instance, Provider<OtherAssetNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
