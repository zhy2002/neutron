package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ResponsibleTypeOfChangeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleTypeOfChangeNodeModule_ProvideResponsibleTypeOfChangeNodeFactory
    implements Factory<ResponsibleTypeOfChangeNode> {
  private final ResponsibleTypeOfChangeNodeModule module;

  public ResponsibleTypeOfChangeNodeModule_ProvideResponsibleTypeOfChangeNodeFactory(
      ResponsibleTypeOfChangeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ResponsibleTypeOfChangeNode get() {
    return Preconditions.checkNotNull(
        module.provideResponsibleTypeOfChangeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ResponsibleTypeOfChangeNode> create(
      ResponsibleTypeOfChangeNodeModule module) {
    return new ResponsibleTypeOfChangeNodeModule_ProvideResponsibleTypeOfChangeNodeFactory(module);
  }

  /** Proxies {@link ResponsibleTypeOfChangeNodeModule#provideResponsibleTypeOfChangeNode()}. */
  public static ResponsibleTypeOfChangeNode proxyProvideResponsibleTypeOfChangeNode(
      ResponsibleTypeOfChangeNodeModule instance) {
    return instance.provideResponsibleTypeOfChangeNode();
  }
}
