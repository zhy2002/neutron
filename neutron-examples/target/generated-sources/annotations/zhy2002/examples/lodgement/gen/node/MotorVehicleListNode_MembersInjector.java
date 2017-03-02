package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MotorVehicleListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleListNode_MembersInjector
    implements MembersInjector<MotorVehicleListNode> {
  private final Provider<MotorVehicleListNodeItemProvider> providerProvider;

  private final Provider<MotorVehicleListNodeComponent.Builder> builderProvider;

  public MotorVehicleListNode_MembersInjector(
      Provider<MotorVehicleListNodeItemProvider> providerProvider,
      Provider<MotorVehicleListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MotorVehicleListNode> create(
      Provider<MotorVehicleListNodeItemProvider> providerProvider,
      Provider<MotorVehicleListNodeComponent.Builder> builderProvider) {
    return new MotorVehicleListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(MotorVehicleListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      MotorVehicleListNode instance, Provider<MotorVehicleListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      MotorVehicleListNode instance,
      Provider<MotorVehicleListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
