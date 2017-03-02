package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TotalAssetNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalAssetNode_MembersInjector implements MembersInjector<TotalAssetNode> {
  private final Provider<TotalAssetNodeComponent.Builder> builderProvider;

  public TotalAssetNode_MembersInjector(Provider<TotalAssetNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TotalAssetNode> create(
      Provider<TotalAssetNodeComponent.Builder> builderProvider) {
    return new TotalAssetNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TotalAssetNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TotalAssetNode instance, Provider<TotalAssetNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
