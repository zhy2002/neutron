package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyOwnershipListNodeModule_ProvideOwnershipListNodeFactory
    implements Factory<OwnershipListNode<?>> {
  private final PropertyOwnershipListNodeModule module;

  public PropertyOwnershipListNodeModule_ProvideOwnershipListNodeFactory(
      PropertyOwnershipListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OwnershipListNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideOwnershipListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OwnershipListNode<?>> create(PropertyOwnershipListNodeModule module) {
    return new PropertyOwnershipListNodeModule_ProvideOwnershipListNodeFactory(module);
  }

  /** Proxies {@link PropertyOwnershipListNodeModule#provideOwnershipListNode()}. */
  public static OwnershipListNode<?> proxyProvideOwnershipListNode(
      PropertyOwnershipListNodeModule instance) {
    return instance.provideOwnershipListNode();
  }
}
