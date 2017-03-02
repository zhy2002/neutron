package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ResponsibleSignificantChangeFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class ResponsibleSignificantChangeFlagNodeModule_ProvideResponsibleSignificantChangeFlagNodeFactory
    implements Factory<ResponsibleSignificantChangeFlagNode> {
  private final ResponsibleSignificantChangeFlagNodeModule module;

  public
  ResponsibleSignificantChangeFlagNodeModule_ProvideResponsibleSignificantChangeFlagNodeFactory(
      ResponsibleSignificantChangeFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ResponsibleSignificantChangeFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideResponsibleSignificantChangeFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ResponsibleSignificantChangeFlagNode> create(
      ResponsibleSignificantChangeFlagNodeModule module) {
    return new ResponsibleSignificantChangeFlagNodeModule_ProvideResponsibleSignificantChangeFlagNodeFactory(
        module);
  }

  /**
   * Proxies {@link
   * ResponsibleSignificantChangeFlagNodeModule#provideResponsibleSignificantChangeFlagNode()}.
   */
  public static ResponsibleSignificantChangeFlagNode
      proxyProvideResponsibleSignificantChangeFlagNode(
          ResponsibleSignificantChangeFlagNodeModule instance) {
    return instance.provideResponsibleSignificantChangeFlagNode();
  }
}
