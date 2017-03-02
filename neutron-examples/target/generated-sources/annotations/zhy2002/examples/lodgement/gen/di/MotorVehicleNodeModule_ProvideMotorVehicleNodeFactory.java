package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MotorVehicleNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleNodeModule_ProvideMotorVehicleNodeFactory
    implements Factory<MotorVehicleNode> {
  private final MotorVehicleNodeModule module;

  public MotorVehicleNodeModule_ProvideMotorVehicleNodeFactory(MotorVehicleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MotorVehicleNode get() {
    return Preconditions.checkNotNull(
        module.provideMotorVehicleNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MotorVehicleNode> create(MotorVehicleNodeModule module) {
    return new MotorVehicleNodeModule_ProvideMotorVehicleNodeFactory(module);
  }

  /** Proxies {@link MotorVehicleNodeModule#provideMotorVehicleNode()}. */
  public static MotorVehicleNode proxyProvideMotorVehicleNode(MotorVehicleNodeModule instance) {
    return instance.provideMotorVehicleNode();
  }
}
