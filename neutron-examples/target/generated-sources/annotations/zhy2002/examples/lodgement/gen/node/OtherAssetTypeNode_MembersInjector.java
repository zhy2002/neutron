package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherAssetTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetTypeNode_MembersInjector
    implements MembersInjector<OtherAssetTypeNode> {
  private final Provider<OtherAssetTypeNodeComponent.Builder> builderProvider;

  public OtherAssetTypeNode_MembersInjector(
      Provider<OtherAssetTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherAssetTypeNode> create(
      Provider<OtherAssetTypeNodeComponent.Builder> builderProvider) {
    return new OtherAssetTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherAssetTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherAssetTypeNode instance, Provider<OtherAssetTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
