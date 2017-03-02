package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.VehicleMarketValueNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleMarketValueNode_MembersInjector
    implements MembersInjector<VehicleMarketValueNode> {
  private final Provider<VehicleMarketValueNodeComponent.Builder> builderProvider;

  public VehicleMarketValueNode_MembersInjector(
      Provider<VehicleMarketValueNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<VehicleMarketValueNode> create(
      Provider<VehicleMarketValueNodeComponent.Builder> builderProvider) {
    return new VehicleMarketValueNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(VehicleMarketValueNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      VehicleMarketValueNode instance,
      Provider<VehicleMarketValueNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
