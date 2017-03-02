package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityBreakCostNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final OtherLiabilityBreakCostNodeModule module;

  public OtherLiabilityBreakCostNodeModule_ProvideBaseCurrencyNodeFactory(
      OtherLiabilityBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(OtherLiabilityBreakCostNodeModule module) {
    return new OtherLiabilityBreakCostNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityBreakCostNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      OtherLiabilityBreakCostNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
