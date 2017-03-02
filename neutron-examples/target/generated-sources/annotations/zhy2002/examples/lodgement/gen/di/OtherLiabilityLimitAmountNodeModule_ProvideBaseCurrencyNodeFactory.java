package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final OtherLiabilityLimitAmountNodeModule module;

  public OtherLiabilityLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory(
      OtherLiabilityLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(OtherLiabilityLimitAmountNodeModule module) {
    return new OtherLiabilityLimitAmountNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityLimitAmountNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      OtherLiabilityLimitAmountNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
