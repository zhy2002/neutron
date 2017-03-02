package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.BeingPurchasedFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BeingPurchasedFlagNode_MembersInjector
    implements MembersInjector<BeingPurchasedFlagNode> {
  private final Provider<BeingPurchasedFlagNodeComponent.Builder> builderProvider;

  public BeingPurchasedFlagNode_MembersInjector(
      Provider<BeingPurchasedFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<BeingPurchasedFlagNode> create(
      Provider<BeingPurchasedFlagNodeComponent.Builder> builderProvider) {
    return new BeingPurchasedFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(BeingPurchasedFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      BeingPurchasedFlagNode instance,
      Provider<BeingPurchasedFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
