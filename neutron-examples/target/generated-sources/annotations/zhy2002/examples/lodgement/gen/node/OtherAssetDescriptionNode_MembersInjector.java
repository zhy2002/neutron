package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OtherAssetDescriptionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetDescriptionNode_MembersInjector
    implements MembersInjector<OtherAssetDescriptionNode> {
  private final Provider<OtherAssetDescriptionNodeComponent.Builder> builderProvider;

  public OtherAssetDescriptionNode_MembersInjector(
      Provider<OtherAssetDescriptionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OtherAssetDescriptionNode> create(
      Provider<OtherAssetDescriptionNodeComponent.Builder> builderProvider) {
    return new OtherAssetDescriptionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OtherAssetDescriptionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OtherAssetDescriptionNode instance,
      Provider<OtherAssetDescriptionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
