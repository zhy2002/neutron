package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyCompanyNameNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ThirdPartyCompanyNameNodeModule module;

  public ThirdPartyCompanyNameNodeModule_ProvideLeafUiNodeFactory(
      ThirdPartyCompanyNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ThirdPartyCompanyNameNodeModule module) {
    return new ThirdPartyCompanyNameNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyCompanyNameNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ThirdPartyCompanyNameNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
