package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.VehicleMarketValueNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleMarketValueNodeModule_ProvideVehicleMarketValueNodeFactory
    implements Factory<VehicleMarketValueNode> {
  private final VehicleMarketValueNodeModule module;

  public VehicleMarketValueNodeModule_ProvideVehicleMarketValueNodeFactory(
      VehicleMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public VehicleMarketValueNode get() {
    return Preconditions.checkNotNull(
        module.provideVehicleMarketValueNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<VehicleMarketValueNode> create(VehicleMarketValueNodeModule module) {
    return new VehicleMarketValueNodeModule_ProvideVehicleMarketValueNodeFactory(module);
  }

  /** Proxies {@link VehicleMarketValueNodeModule#provideVehicleMarketValueNode()}. */
  public static VehicleMarketValueNode proxyProvideVehicleMarketValueNode(
      VehicleMarketValueNodeModule instance) {
    return instance.provideVehicleMarketValueNode();
  }
}
