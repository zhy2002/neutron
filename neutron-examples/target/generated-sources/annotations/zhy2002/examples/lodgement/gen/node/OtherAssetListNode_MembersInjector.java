package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherAssetListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetListNode_MembersInjector
    implements MembersInjector<OtherAssetListNode> {
  private final Provider<OtherAssetListNodeItemProvider> providerProvider;

  private final Provider<OtherAssetListNodeComponent.Builder> builderProvider;

  public OtherAssetListNode_MembersInjector(
      Provider<OtherAssetListNodeItemProvider> providerProvider,
      Provider<OtherAssetListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherAssetListNode> create(
      Provider<OtherAssetListNodeItemProvider> providerProvider,
      Provider<OtherAssetListNodeComponent.Builder> builderProvider) {
    return new OtherAssetListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(OtherAssetListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      OtherAssetListNode instance, Provider<OtherAssetListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      OtherAssetListNode instance, Provider<OtherAssetListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
