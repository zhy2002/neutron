package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityDescriptionNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final OtherLiabilityDescriptionNodeModule module;

  public OtherLiabilityDescriptionNodeModule_ProvideLeafUiNodeFactory(
      OtherLiabilityDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(OtherLiabilityDescriptionNodeModule module) {
    return new OtherLiabilityDescriptionNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityDescriptionNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      OtherLiabilityDescriptionNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
