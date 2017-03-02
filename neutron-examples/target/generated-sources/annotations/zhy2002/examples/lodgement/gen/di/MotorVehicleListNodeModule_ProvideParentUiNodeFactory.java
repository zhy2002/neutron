package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final MotorVehicleListNodeModule module;

  public MotorVehicleListNodeModule_ProvideParentUiNodeFactory(MotorVehicleListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(MotorVehicleListNodeModule module) {
    return new MotorVehicleListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link MotorVehicleListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(MotorVehicleListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
