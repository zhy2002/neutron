package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleMitigationMethodNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ResponsibleMitigationMethodNodeModule module;

  public ResponsibleMitigationMethodNodeModule_ProvideLeafUiNodeFactory(
      ResponsibleMitigationMethodNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ResponsibleMitigationMethodNodeModule module) {
    return new ResponsibleMitigationMethodNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ResponsibleMitigationMethodNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ResponsibleMitigationMethodNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
