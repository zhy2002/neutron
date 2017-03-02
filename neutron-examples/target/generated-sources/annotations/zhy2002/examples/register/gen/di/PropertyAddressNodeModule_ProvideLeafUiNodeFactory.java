package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyAddressNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final PropertyAddressNodeModule module;

  public PropertyAddressNodeModule_ProvideLeafUiNodeFactory(PropertyAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(PropertyAddressNodeModule module) {
    return new PropertyAddressNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link PropertyAddressNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(PropertyAddressNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
