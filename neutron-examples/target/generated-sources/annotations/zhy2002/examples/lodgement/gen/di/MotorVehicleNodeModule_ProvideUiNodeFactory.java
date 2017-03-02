package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final MotorVehicleNodeModule module;

  public MotorVehicleNodeModule_ProvideUiNodeFactory(MotorVehicleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MotorVehicleNodeModule module) {
    return new MotorVehicleNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MotorVehicleNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MotorVehicleNodeModule instance) {
    return instance.provideUiNode();
  }
}
