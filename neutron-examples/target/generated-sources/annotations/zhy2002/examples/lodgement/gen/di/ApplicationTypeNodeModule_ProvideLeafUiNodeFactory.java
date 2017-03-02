package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ApplicationTypeNodeModule module;

  public ApplicationTypeNodeModule_ProvideLeafUiNodeFactory(ApplicationTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ApplicationTypeNodeModule module) {
    return new ApplicationTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ApplicationTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ApplicationTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
