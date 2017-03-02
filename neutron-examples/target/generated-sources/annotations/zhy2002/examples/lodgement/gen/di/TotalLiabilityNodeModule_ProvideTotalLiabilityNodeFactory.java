package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TotalLiabilityNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalLiabilityNodeModule_ProvideTotalLiabilityNodeFactory
    implements Factory<TotalLiabilityNode> {
  private final TotalLiabilityNodeModule module;

  public TotalLiabilityNodeModule_ProvideTotalLiabilityNodeFactory(
      TotalLiabilityNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TotalLiabilityNode get() {
    return Preconditions.checkNotNull(
        module.provideTotalLiabilityNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TotalLiabilityNode> create(TotalLiabilityNodeModule module) {
    return new TotalLiabilityNodeModule_ProvideTotalLiabilityNodeFactory(module);
  }

  /** Proxies {@link TotalLiabilityNodeModule#provideTotalLiabilityNode()}. */
  public static TotalLiabilityNode proxyProvideTotalLiabilityNode(
      TotalLiabilityNodeModule instance) {
    return instance.provideTotalLiabilityNode();
  }
}
