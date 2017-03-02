package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MaritalStatusNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final MaritalStatusNodeModule module;

  public MaritalStatusNodeModule_ProvideLeafUiNodeFactory(MaritalStatusNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(MaritalStatusNodeModule module) {
    return new MaritalStatusNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link MaritalStatusNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(MaritalStatusNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
