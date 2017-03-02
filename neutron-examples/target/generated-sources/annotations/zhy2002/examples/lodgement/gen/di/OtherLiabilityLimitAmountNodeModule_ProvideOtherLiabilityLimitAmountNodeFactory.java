package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityLimitAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityLimitAmountNodeModule_ProvideOtherLiabilityLimitAmountNodeFactory
    implements Factory<OtherLiabilityLimitAmountNode> {
  private final OtherLiabilityLimitAmountNodeModule module;

  public OtherLiabilityLimitAmountNodeModule_ProvideOtherLiabilityLimitAmountNodeFactory(
      OtherLiabilityLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherLiabilityLimitAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherLiabilityLimitAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherLiabilityLimitAmountNode> create(
      OtherLiabilityLimitAmountNodeModule module) {
    return new OtherLiabilityLimitAmountNodeModule_ProvideOtherLiabilityLimitAmountNodeFactory(
        module);
  }

  /** Proxies {@link OtherLiabilityLimitAmountNodeModule#provideOtherLiabilityLimitAmountNode()}. */
  public static OtherLiabilityLimitAmountNode proxyProvideOtherLiabilityLimitAmountNode(
      OtherLiabilityLimitAmountNodeModule instance) {
    return instance.provideOtherLiabilityLimitAmountNode();
  }
}
