package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityAmountOwningNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityAmountOwningNodeModule_ProvideOtherLiabilityAmountOwningNodeFactory
    implements Factory<OtherLiabilityAmountOwningNode> {
  private final OtherLiabilityAmountOwningNodeModule module;

  public OtherLiabilityAmountOwningNodeModule_ProvideOtherLiabilityAmountOwningNodeFactory(
      OtherLiabilityAmountOwningNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherLiabilityAmountOwningNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherLiabilityAmountOwningNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherLiabilityAmountOwningNode> create(
      OtherLiabilityAmountOwningNodeModule module) {
    return new OtherLiabilityAmountOwningNodeModule_ProvideOtherLiabilityAmountOwningNodeFactory(
        module);
  }

  /**
   * Proxies {@link OtherLiabilityAmountOwningNodeModule#provideOtherLiabilityAmountOwningNode()}.
   */
  public static OtherLiabilityAmountOwningNode proxyProvideOtherLiabilityAmountOwningNode(
      OtherLiabilityAmountOwningNodeModule instance) {
    return instance.provideOtherLiabilityAmountOwningNode();
  }
}
