package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityClearingFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityClearingFlagNodeModule_ProvideOtherLiabilityClearingFlagNodeFactory
    implements Factory<OtherLiabilityClearingFlagNode> {
  private final OtherLiabilityClearingFlagNodeModule module;

  public OtherLiabilityClearingFlagNodeModule_ProvideOtherLiabilityClearingFlagNodeFactory(
      OtherLiabilityClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherLiabilityClearingFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherLiabilityClearingFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherLiabilityClearingFlagNode> create(
      OtherLiabilityClearingFlagNodeModule module) {
    return new OtherLiabilityClearingFlagNodeModule_ProvideOtherLiabilityClearingFlagNodeFactory(
        module);
  }

  /**
   * Proxies {@link OtherLiabilityClearingFlagNodeModule#provideOtherLiabilityClearingFlagNode()}.
   */
  public static OtherLiabilityClearingFlagNode proxyProvideOtherLiabilityClearingFlagNode(
      OtherLiabilityClearingFlagNodeModule instance) {
    return instance.provideOtherLiabilityClearingFlagNode();
  }
}
