package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleYearNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final VehicleYearNodeModule module;

  public VehicleYearNodeModule_ProvideUiNodeFactory(VehicleYearNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(VehicleYearNodeModule module) {
    return new VehicleYearNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link VehicleYearNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(VehicleYearNodeModule instance) {
    return instance.provideUiNode();
  }
}
