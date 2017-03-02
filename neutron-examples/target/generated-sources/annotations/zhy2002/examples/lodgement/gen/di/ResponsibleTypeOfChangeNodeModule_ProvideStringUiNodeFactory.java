package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleTypeOfChangeNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final ResponsibleTypeOfChangeNodeModule module;

  public ResponsibleTypeOfChangeNodeModule_ProvideStringUiNodeFactory(
      ResponsibleTypeOfChangeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(ResponsibleTypeOfChangeNodeModule module) {
    return new ResponsibleTypeOfChangeNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link ResponsibleTypeOfChangeNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(
      ResponsibleTypeOfChangeNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
