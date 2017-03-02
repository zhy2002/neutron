package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyPurseNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final PropertyPurseNodeModule module;

  public PropertyPurseNodeModule_ProvideLeafUiNodeFactory(PropertyPurseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(PropertyPurseNodeModule module) {
    return new PropertyPurseNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link PropertyPurseNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(PropertyPurseNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
