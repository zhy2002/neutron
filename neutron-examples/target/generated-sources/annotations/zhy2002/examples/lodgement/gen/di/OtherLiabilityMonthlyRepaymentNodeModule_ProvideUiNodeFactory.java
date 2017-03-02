package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityMonthlyRepaymentNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final OtherLiabilityMonthlyRepaymentNodeModule module;

  public OtherLiabilityMonthlyRepaymentNodeModule_ProvideUiNodeFactory(
      OtherLiabilityMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherLiabilityMonthlyRepaymentNodeModule module) {
    return new OtherLiabilityMonthlyRepaymentNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityMonthlyRepaymentNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherLiabilityMonthlyRepaymentNodeModule instance) {
    return instance.provideUiNode();
  }
}
