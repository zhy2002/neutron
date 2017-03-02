package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final OtherLiabilityMonthlyRepaymentNodeModule module;

  public OtherLiabilityMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory(
      OtherLiabilityMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(OtherLiabilityMonthlyRepaymentNodeModule module) {
    return new OtherLiabilityMonthlyRepaymentNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityMonthlyRepaymentNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      OtherLiabilityMonthlyRepaymentNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
