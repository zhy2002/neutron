package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PasswordNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final PasswordNodeModule module;

  public PasswordNodeModule_ProvideStringUiNodeFactory(PasswordNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(PasswordNodeModule module) {
    return new PasswordNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link PasswordNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(PasswordNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
