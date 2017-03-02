package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyOwnershipListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final PropertyOwnershipListNodeModule module;

  public PropertyOwnershipListNodeModule_ProvideParentUiNodeFactory(
      PropertyOwnershipListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(PropertyOwnershipListNodeModule module) {
    return new PropertyOwnershipListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link PropertyOwnershipListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(PropertyOwnershipListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
