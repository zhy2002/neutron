package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.EstimatedMarketValueNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EstimatedMarketValueNode_MembersInjector
    implements MembersInjector<EstimatedMarketValueNode> {
  private final Provider<EstimatedMarketValueNodeComponent.Builder> builderProvider;

  public EstimatedMarketValueNode_MembersInjector(
      Provider<EstimatedMarketValueNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<EstimatedMarketValueNode> create(
      Provider<EstimatedMarketValueNodeComponent.Builder> builderProvider) {
    return new EstimatedMarketValueNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(EstimatedMarketValueNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      EstimatedMarketValueNode instance,
      Provider<EstimatedMarketValueNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
