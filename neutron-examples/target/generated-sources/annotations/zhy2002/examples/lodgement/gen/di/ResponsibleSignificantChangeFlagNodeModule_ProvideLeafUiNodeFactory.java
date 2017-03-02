package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleSignificantChangeFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ResponsibleSignificantChangeFlagNodeModule module;

  public ResponsibleSignificantChangeFlagNodeModule_ProvideLeafUiNodeFactory(
      ResponsibleSignificantChangeFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(
      ResponsibleSignificantChangeFlagNodeModule module) {
    return new ResponsibleSignificantChangeFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ResponsibleSignificantChangeFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ResponsibleSignificantChangeFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
