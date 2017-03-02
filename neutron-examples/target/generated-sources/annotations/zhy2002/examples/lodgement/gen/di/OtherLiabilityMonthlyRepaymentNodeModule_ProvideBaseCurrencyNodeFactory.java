package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory
    implements Factory<BaseCurrencyNode<?>> {
  private final OtherLiabilityMonthlyRepaymentNodeModule module;

  public OtherLiabilityMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory(
      OtherLiabilityMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseCurrencyNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseCurrencyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseCurrencyNode<?>> create(
      OtherLiabilityMonthlyRepaymentNodeModule module) {
    return new OtherLiabilityMonthlyRepaymentNodeModule_ProvideBaseCurrencyNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityMonthlyRepaymentNodeModule#provideBaseCurrencyNode()}. */
  public static BaseCurrencyNode<?> proxyProvideBaseCurrencyNode(
      OtherLiabilityMonthlyRepaymentNodeModule instance) {
    return instance.provideBaseCurrencyNode();
  }
}
