package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.VehicleYearNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleYearNode_MembersInjector implements MembersInjector<VehicleYearNode> {
  private final Provider<VehicleYearNodeComponent.Builder> builderProvider;

  public VehicleYearNode_MembersInjector(
      Provider<VehicleYearNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<VehicleYearNode> create(
      Provider<VehicleYearNodeComponent.Builder> builderProvider) {
    return new VehicleYearNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(VehicleYearNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      VehicleYearNode instance, Provider<VehicleYearNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
