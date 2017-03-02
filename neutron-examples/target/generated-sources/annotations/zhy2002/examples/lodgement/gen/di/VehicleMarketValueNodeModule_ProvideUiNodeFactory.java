package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleMarketValueNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final VehicleMarketValueNodeModule module;

  public VehicleMarketValueNodeModule_ProvideUiNodeFactory(VehicleMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(VehicleMarketValueNodeModule module) {
    return new VehicleMarketValueNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link VehicleMarketValueNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(VehicleMarketValueNodeModule instance) {
    return instance.provideUiNode();
  }
}
