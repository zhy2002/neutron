package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BeingPurchasedFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final BeingPurchasedFlagNodeModule module;

  public BeingPurchasedFlagNodeModule_ProvideLeafUiNodeFactory(
      BeingPurchasedFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(BeingPurchasedFlagNodeModule module) {
    return new BeingPurchasedFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link BeingPurchasedFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(BeingPurchasedFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
