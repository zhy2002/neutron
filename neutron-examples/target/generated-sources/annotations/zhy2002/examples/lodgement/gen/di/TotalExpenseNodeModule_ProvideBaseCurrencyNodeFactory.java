package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalExpenseNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final TotalExpenseNodeModule module;

  public TotalExpenseNodeModule_ProvideBaseCurrencyNodeFactory(TotalExpenseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(TotalExpenseNodeModule module) {
    return new TotalExpenseNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link TotalExpenseNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(TotalExpenseNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
