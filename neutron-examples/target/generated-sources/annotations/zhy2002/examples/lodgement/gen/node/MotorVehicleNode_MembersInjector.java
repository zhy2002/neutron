package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MotorVehicleNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleNode_MembersInjector implements MembersInjector<MotorVehicleNode> {
  private final Provider<MotorVehicleNodeChildProvider> providerProvider;

  private final Provider<MotorVehicleNodeComponent.Builder> builderProvider;

  public MotorVehicleNode_MembersInjector(
      Provider<MotorVehicleNodeChildProvider> providerProvider,
      Provider<MotorVehicleNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MotorVehicleNode> create(
      Provider<MotorVehicleNodeChildProvider> providerProvider,
      Provider<MotorVehicleNodeComponent.Builder> builderProvider) {
    return new MotorVehicleNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(MotorVehicleNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      MotorVehicleNode instance, Provider<MotorVehicleNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      MotorVehicleNode instance, Provider<MotorVehicleNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
