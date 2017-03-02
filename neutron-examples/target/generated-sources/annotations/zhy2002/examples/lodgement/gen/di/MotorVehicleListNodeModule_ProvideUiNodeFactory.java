package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleListNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final MotorVehicleListNodeModule module;

  public MotorVehicleListNodeModule_ProvideUiNodeFactory(MotorVehicleListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MotorVehicleListNodeModule module) {
    return new MotorVehicleListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MotorVehicleListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MotorVehicleListNodeModule instance) {
    return instance.provideUiNode();
  }
}
