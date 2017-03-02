package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PropertyOwnershipListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyOwnershipListNodeModule_ProvidePropertyOwnershipListNodeFactory
    implements Factory<PropertyOwnershipListNode> {
  private final PropertyOwnershipListNodeModule module;

  public PropertyOwnershipListNodeModule_ProvidePropertyOwnershipListNodeFactory(
      PropertyOwnershipListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PropertyOwnershipListNode get() {
    return Preconditions.checkNotNull(
        module.providePropertyOwnershipListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PropertyOwnershipListNode> create(PropertyOwnershipListNodeModule module) {
    return new PropertyOwnershipListNodeModule_ProvidePropertyOwnershipListNodeFactory(module);
  }

  /** Proxies {@link PropertyOwnershipListNodeModule#providePropertyOwnershipListNode()}. */
  public static PropertyOwnershipListNode proxyProvidePropertyOwnershipListNode(
      PropertyOwnershipListNodeModule instance) {
    return instance.providePropertyOwnershipListNode();
  }
}
