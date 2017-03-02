package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OwnershipNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipNodeModule_ProvideOwnershipNodeFactory
    implements Factory<OwnershipNode> {
  private final OwnershipNodeModule module;

  public OwnershipNodeModule_ProvideOwnershipNodeFactory(OwnershipNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OwnershipNode get() {
    return Preconditions.checkNotNull(
        module.provideOwnershipNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OwnershipNode> create(OwnershipNodeModule module) {
    return new OwnershipNodeModule_ProvideOwnershipNodeFactory(module);
  }

  /** Proxies {@link OwnershipNodeModule#provideOwnershipNode()}. */
  public static OwnershipNode proxyProvideOwnershipNode(OwnershipNodeModule instance) {
    return instance.provideOwnershipNode();
  }
}
