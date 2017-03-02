package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleTypeOfChangeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ResponsibleTypeOfChangeNodeModule module;

  public ResponsibleTypeOfChangeNodeModule_ProvideLeafUiNodeFactory(
      ResponsibleTypeOfChangeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ResponsibleTypeOfChangeNodeModule module) {
    return new ResponsibleTypeOfChangeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ResponsibleTypeOfChangeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ResponsibleTypeOfChangeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
