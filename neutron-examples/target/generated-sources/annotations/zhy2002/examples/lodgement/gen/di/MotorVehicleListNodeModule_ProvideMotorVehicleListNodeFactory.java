package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MotorVehicleListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleListNodeModule_ProvideMotorVehicleListNodeFactory
    implements Factory<MotorVehicleListNode> {
  private final MotorVehicleListNodeModule module;

  public MotorVehicleListNodeModule_ProvideMotorVehicleListNodeFactory(
      MotorVehicleListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MotorVehicleListNode get() {
    return Preconditions.checkNotNull(
        module.provideMotorVehicleListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MotorVehicleListNode> create(MotorVehicleListNodeModule module) {
    return new MotorVehicleListNodeModule_ProvideMotorVehicleListNodeFactory(module);
  }

  /** Proxies {@link MotorVehicleListNodeModule#provideMotorVehicleListNode()}. */
  public static MotorVehicleListNode proxyProvideMotorVehicleListNode(
      MotorVehicleListNodeModule instance) {
    return instance.provideMotorVehicleListNode();
  }
}
