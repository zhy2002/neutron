package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.VehicleModelNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleModelNodeModule_ProvideVehicleModelNodeFactory
    implements Factory<VehicleModelNode> {
  private final VehicleModelNodeModule module;

  public VehicleModelNodeModule_ProvideVehicleModelNodeFactory(VehicleModelNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public VehicleModelNode get() {
    return Preconditions.checkNotNull(
        module.provideVehicleModelNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<VehicleModelNode> create(VehicleModelNodeModule module) {
    return new VehicleModelNodeModule_ProvideVehicleModelNodeFactory(module);
  }

  /** Proxies {@link VehicleModelNodeModule#provideVehicleModelNode()}. */
  public static VehicleModelNode proxyProvideVehicleModelNode(VehicleModelNodeModule instance) {
    return instance.provideVehicleModelNode();
  }
}
