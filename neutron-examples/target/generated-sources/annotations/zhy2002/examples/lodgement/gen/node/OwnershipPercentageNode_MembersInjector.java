package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.OwnershipPercentageNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipPercentageNode_MembersInjector
    implements MembersInjector<OwnershipPercentageNode> {
  private final Provider<OwnershipPercentageNodeComponent.Builder> builderProvider;

  public OwnershipPercentageNode_MembersInjector(
      Provider<OwnershipPercentageNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OwnershipPercentageNode> create(
      Provider<OwnershipPercentageNodeComponent.Builder> builderProvider) {
    return new OwnershipPercentageNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OwnershipPercentageNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OwnershipPercentageNode instance,
      Provider<OwnershipPercentageNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
