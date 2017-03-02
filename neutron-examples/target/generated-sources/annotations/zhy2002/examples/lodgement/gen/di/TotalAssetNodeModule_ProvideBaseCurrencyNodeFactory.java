package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalAssetNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final TotalAssetNodeModule module;

  public TotalAssetNodeModule_ProvideBaseCurrencyNodeFactory(TotalAssetNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(TotalAssetNodeModule module) {
    return new TotalAssetNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link TotalAssetNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(TotalAssetNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}