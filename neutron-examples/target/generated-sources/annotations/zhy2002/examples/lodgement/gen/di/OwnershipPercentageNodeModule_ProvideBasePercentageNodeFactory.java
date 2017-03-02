package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BasePercentageNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipPercentageNodeModule_ProvideBasePercentageNodeFactory
    implements Factory<BasePercentageNode<?>> {
  private final OwnershipPercentageNodeModule module;

  public OwnershipPercentageNodeModule_ProvideBasePercentageNodeFactory(
      OwnershipPercentageNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BasePercentageNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBasePercentageNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BasePercentageNode<?>> create(OwnershipPercentageNodeModule module) {
    return new OwnershipPercentageNodeModule_ProvideBasePercentageNodeFactory(module);
  }

  /** Proxies {@link OwnershipPercentageNodeModule#provideBasePercentageNode()}. */
  public static BasePercentageNode<?> proxyProvideBasePercentageNode(
      OwnershipPercentageNodeModule instance) {
    return instance.provideBasePercentageNode();
  }
}
