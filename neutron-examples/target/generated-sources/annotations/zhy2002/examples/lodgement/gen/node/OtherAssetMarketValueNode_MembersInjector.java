package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherAssetMarketValueNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetMarketValueNode_MembersInjector
    implements MembersInjector<OtherAssetMarketValueNode> {
  private final Provider<OtherAssetMarketValueNodeComponent.Builder> builderProvider;

  public OtherAssetMarketValueNode_MembersInjector(
      Provider<OtherAssetMarketValueNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherAssetMarketValueNode> create(
      Provider<OtherAssetMarketValueNodeComponent.Builder> builderProvider) {
    return new OtherAssetMarketValueNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherAssetMarketValueNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherAssetMarketValueNode instance,
      Provider<OtherAssetMarketValueNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
