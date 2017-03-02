package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyOwnershipListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final PropertyOwnershipListNodeModule module;

  public PropertyOwnershipListNodeModule_ProvideListUiNodeFactory(
      PropertyOwnershipListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(PropertyOwnershipListNodeModule module) {
    return new PropertyOwnershipListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link PropertyOwnershipListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(PropertyOwnershipListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
