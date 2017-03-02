package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalLiabilityNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final TotalLiabilityNodeModule module;

  public TotalLiabilityNodeModule_ProvideBaseCurrencyNodeFactory(TotalLiabilityNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(TotalLiabilityNodeModule module) {
    return new TotalLiabilityNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link TotalLiabilityNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      TotalLiabilityNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
