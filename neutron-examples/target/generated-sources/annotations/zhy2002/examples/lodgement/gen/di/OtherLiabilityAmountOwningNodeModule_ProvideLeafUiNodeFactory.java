package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityAmountOwningNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final OtherLiabilityAmountOwningNodeModule module;

  public OtherLiabilityAmountOwningNodeModule_ProvideLeafUiNodeFactory(
      OtherLiabilityAmountOwningNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(OtherLiabilityAmountOwningNodeModule module) {
    return new OtherLiabilityAmountOwningNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityAmountOwningNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      OtherLiabilityAmountOwningNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}