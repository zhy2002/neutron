package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HouseDutiesFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final HouseDutiesFlagNodeModule module;

  public HouseDutiesFlagNodeModule_ProvideLeafUiNodeFactory(HouseDutiesFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(HouseDutiesFlagNodeModule module) {
    return new HouseDutiesFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link HouseDutiesFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(HouseDutiesFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
