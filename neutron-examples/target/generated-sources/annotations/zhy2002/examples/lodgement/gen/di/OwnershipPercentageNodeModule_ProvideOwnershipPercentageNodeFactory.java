package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OwnershipPercentageNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipPercentageNodeModule_ProvideOwnershipPercentageNodeFactory
    implements Factory<OwnershipPercentageNode> {
  private final OwnershipPercentageNodeModule module;

  public OwnershipPercentageNodeModule_ProvideOwnershipPercentageNodeFactory(
      OwnershipPercentageNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OwnershipPercentageNode get() {
    return Preconditions.checkNotNull(
        module.provideOwnershipPercentageNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OwnershipPercentageNode> create(OwnershipPercentageNodeModule module) {
    return new OwnershipPercentageNodeModule_ProvideOwnershipPercentageNodeFactory(module);
  }

  /** Proxies {@link OwnershipPercentageNodeModule#provideOwnershipPercentageNode()}. */
  public static OwnershipPercentageNode proxyProvideOwnershipPercentageNode(
      OwnershipPercentageNodeModule instance) {
    return instance.provideOwnershipPercentageNode();
  }
}
