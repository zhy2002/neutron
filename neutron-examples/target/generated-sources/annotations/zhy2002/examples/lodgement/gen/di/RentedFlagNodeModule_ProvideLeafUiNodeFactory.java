package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RentedFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final RentedFlagNodeModule module;

  public RentedFlagNodeModule_ProvideLeafUiNodeFactory(RentedFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(RentedFlagNodeModule module) {
    return new RentedFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link RentedFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(RentedFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
