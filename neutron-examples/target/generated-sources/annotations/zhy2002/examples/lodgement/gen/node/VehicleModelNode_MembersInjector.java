package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.VehicleModelNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleModelNode_MembersInjector implements MembersInjector<VehicleModelNode> {
  private final Provider<VehicleModelNodeComponent.Builder> builderProvider;

  public VehicleModelNode_MembersInjector(
      Provider<VehicleModelNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<VehicleModelNode> create(
      Provider<VehicleModelNodeComponent.Builder> builderProvider) {
    return new VehicleModelNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(VehicleModelNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      VehicleModelNode instance, Provider<VehicleModelNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
