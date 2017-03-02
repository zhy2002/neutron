package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustSettlorNotRequiredReasonNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class TrustSettlorNotRequiredReasonNodeModule_ProvideTrustSettlorNotRequiredReasonNodeFactory
    implements Factory<TrustSettlorNotRequiredReasonNode> {
  private final TrustSettlorNotRequiredReasonNodeModule module;

  public TrustSettlorNotRequiredReasonNodeModule_ProvideTrustSettlorNotRequiredReasonNodeFactory(
      TrustSettlorNotRequiredReasonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustSettlorNotRequiredReasonNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustSettlorNotRequiredReasonNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustSettlorNotRequiredReasonNode> create(
      TrustSettlorNotRequiredReasonNodeModule module) {
    return new TrustSettlorNotRequiredReasonNodeModule_ProvideTrustSettlorNotRequiredReasonNodeFactory(
        module);
  }

  /**
   * Proxies {@link
   * TrustSettlorNotRequiredReasonNodeModule#provideTrustSettlorNotRequiredReasonNode()}.
   */
  public static TrustSettlorNotRequiredReasonNode proxyProvideTrustSettlorNotRequiredReasonNode(
      TrustSettlorNotRequiredReasonNodeModule instance) {
    return instance.provideTrustSettlorNotRequiredReasonNode();
  }
}
