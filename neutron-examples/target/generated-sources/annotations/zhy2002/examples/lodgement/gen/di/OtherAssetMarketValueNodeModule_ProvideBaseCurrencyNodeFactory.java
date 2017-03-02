package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetMarketValueNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final OtherAssetMarketValueNodeModule module;

  public OtherAssetMarketValueNodeModule_ProvideBaseCurrencyNodeFactory(
      OtherAssetMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(OtherAssetMarketValueNodeModule module) {
    return new OtherAssetMarketValueNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link OtherAssetMarketValueNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      OtherAssetMarketValueNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
