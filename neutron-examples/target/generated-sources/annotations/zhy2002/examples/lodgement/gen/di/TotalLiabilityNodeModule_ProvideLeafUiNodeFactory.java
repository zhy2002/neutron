package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalLiabilityNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final TotalLiabilityNodeModule module;

  public TotalLiabilityNodeModule_ProvideLeafUiNodeFactory(TotalLiabilityNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(TotalLiabilityNodeModule module) {
    return new TotalLiabilityNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link TotalLiabilityNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(TotalLiabilityNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
