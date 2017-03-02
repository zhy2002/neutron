package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TotalLiabilityNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalLiabilityNode_MembersInjector
    implements MembersInjector<TotalLiabilityNode> {
  private final Provider<TotalLiabilityNodeComponent.Builder> builderProvider;

  public TotalLiabilityNode_MembersInjector(
      Provider<TotalLiabilityNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TotalLiabilityNode> create(
      Provider<TotalLiabilityNodeComponent.Builder> builderProvider) {
    return new TotalLiabilityNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TotalLiabilityNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TotalLiabilityNode instance, Provider<TotalLiabilityNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
