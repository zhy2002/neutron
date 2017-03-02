package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.VehicleYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleYearNodeModule_ProvideVehicleYearNodeFactory
    implements Factory<VehicleYearNode> {
  private final VehicleYearNodeModule module;

  public VehicleYearNodeModule_ProvideVehicleYearNodeFactory(VehicleYearNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public VehicleYearNode get() {
    return Preconditions.checkNotNull(
        module.provideVehicleYearNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<VehicleYearNode> create(VehicleYearNodeModule module) {
    return new VehicleYearNodeModule_ProvideVehicleYearNodeFactory(module);
  }

  /** Proxies {@link VehicleYearNodeModule#provideVehicleYearNode()}. */
  public static VehicleYearNode proxyProvideVehicleYearNode(VehicleYearNodeModule instance) {
    return instance.provideVehicleYearNode();
  }
}
