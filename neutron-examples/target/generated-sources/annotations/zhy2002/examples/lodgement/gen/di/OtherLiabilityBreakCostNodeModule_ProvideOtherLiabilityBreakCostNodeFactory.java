package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityBreakCostNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityBreakCostNodeModule_ProvideOtherLiabilityBreakCostNodeFactory
    implements Factory<OtherLiabilityBreakCostNode> {
  private final OtherLiabilityBreakCostNodeModule module;

  public OtherLiabilityBreakCostNodeModule_ProvideOtherLiabilityBreakCostNodeFactory(
      OtherLiabilityBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherLiabilityBreakCostNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherLiabilityBreakCostNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherLiabilityBreakCostNode> create(
      OtherLiabilityBreakCostNodeModule module) {
    return new OtherLiabilityBreakCostNodeModule_ProvideOtherLiabilityBreakCostNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityBreakCostNodeModule#provideOtherLiabilityBreakCostNode()}. */
  public static OtherLiabilityBreakCostNode proxyProvideOtherLiabilityBreakCostNode(
      OtherLiabilityBreakCostNodeModule instance) {
    return instance.provideOtherLiabilityBreakCostNode();
  }
}
