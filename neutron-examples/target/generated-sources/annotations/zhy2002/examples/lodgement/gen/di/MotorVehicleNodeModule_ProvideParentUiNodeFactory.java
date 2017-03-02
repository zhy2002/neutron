package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final MotorVehicleNodeModule module;

  public MotorVehicleNodeModule_ProvideParentUiNodeFactory(MotorVehicleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(MotorVehicleNodeModule module) {
    return new MotorVehicleNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link MotorVehicleNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(MotorVehicleNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
