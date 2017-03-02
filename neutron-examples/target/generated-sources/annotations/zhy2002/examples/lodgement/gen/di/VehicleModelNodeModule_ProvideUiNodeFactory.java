package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleModelNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final VehicleModelNodeModule module;

  public VehicleModelNodeModule_ProvideUiNodeFactory(VehicleModelNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(VehicleModelNodeModule module) {
    return new VehicleModelNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link VehicleModelNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(VehicleModelNodeModule instance) {
    return instance.provideUiNode();
  }
}
