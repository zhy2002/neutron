package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final MotorVehicleNodeModule module;

  public MotorVehicleNodeModule_ProvideObjectUiNodeFactory(MotorVehicleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(MotorVehicleNodeModule module) {
    return new MotorVehicleNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link MotorVehicleNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(MotorVehicleNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
