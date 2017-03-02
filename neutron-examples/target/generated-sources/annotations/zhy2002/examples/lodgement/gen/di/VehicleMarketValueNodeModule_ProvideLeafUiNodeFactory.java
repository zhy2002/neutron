package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleMarketValueNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final VehicleMarketValueNodeModule module;

  public VehicleMarketValueNodeModule_ProvideLeafUiNodeFactory(
      VehicleMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(VehicleMarketValueNodeModule module) {
    return new VehicleMarketValueNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link VehicleMarketValueNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(VehicleMarketValueNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
