package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VehicleMarketValueNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final VehicleMarketValueNodeModule module;

  public VehicleMarketValueNodeModule_ProvideBaseCurrencyNodeFactory(
      VehicleMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(VehicleMarketValueNodeModule module) {
    return new VehicleMarketValueNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link VehicleMarketValueNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      VehicleMarketValueNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}