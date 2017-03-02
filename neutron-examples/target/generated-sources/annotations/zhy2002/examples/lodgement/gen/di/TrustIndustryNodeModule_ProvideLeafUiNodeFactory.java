package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustIndustryNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final TrustIndustryNodeModule module;

  public TrustIndustryNodeModule_ProvideLeafUiNodeFactory(TrustIndustryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(TrustIndustryNodeModule module) {
    return new TrustIndustryNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link TrustIndustryNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(TrustIndustryNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
