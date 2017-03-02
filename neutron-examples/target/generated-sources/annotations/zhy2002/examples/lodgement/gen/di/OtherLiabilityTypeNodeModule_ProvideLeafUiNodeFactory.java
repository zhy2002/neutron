package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final OtherLiabilityTypeNodeModule module;

  public OtherLiabilityTypeNodeModule_ProvideLeafUiNodeFactory(
      OtherLiabilityTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(OtherLiabilityTypeNodeModule module) {
    return new OtherLiabilityTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(OtherLiabilityTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
