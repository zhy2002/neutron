package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityMonthlyRepaymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class OtherLiabilityMonthlyRepaymentNodeModule_ProvideOtherLiabilityMonthlyRepaymentNodeFactory
    implements Factory<OtherLiabilityMonthlyRepaymentNode> {
  private final OtherLiabilityMonthlyRepaymentNodeModule module;

  public OtherLiabilityMonthlyRepaymentNodeModule_ProvideOtherLiabilityMonthlyRepaymentNodeFactory(
      OtherLiabilityMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherLiabilityMonthlyRepaymentNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherLiabilityMonthlyRepaymentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherLiabilityMonthlyRepaymentNode> create(
      OtherLiabilityMonthlyRepaymentNodeModule module) {
    return new OtherLiabilityMonthlyRepaymentNodeModule_ProvideOtherLiabilityMonthlyRepaymentNodeFactory(
        module);
  }

  /**
   * Proxies {@link
   * OtherLiabilityMonthlyRepaymentNodeModule#provideOtherLiabilityMonthlyRepaymentNode()}.
   */
  public static OtherLiabilityMonthlyRepaymentNode proxyProvideOtherLiabilityMonthlyRepaymentNode(
      OtherLiabilityMonthlyRepaymentNodeModule instance) {
    return instance.provideOtherLiabilityMonthlyRepaymentNode();
  }
}
