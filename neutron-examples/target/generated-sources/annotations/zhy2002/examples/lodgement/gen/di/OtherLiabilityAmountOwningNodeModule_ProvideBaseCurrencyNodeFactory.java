package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityAmountOwningNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final OtherLiabilityAmountOwningNodeModule module;

  public OtherLiabilityAmountOwningNodeModule_ProvideBaseCurrencyNodeFactory(
      OtherLiabilityAmountOwningNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(OtherLiabilityAmountOwningNodeModule module) {
    return new OtherLiabilityAmountOwningNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityAmountOwningNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      OtherLiabilityAmountOwningNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}