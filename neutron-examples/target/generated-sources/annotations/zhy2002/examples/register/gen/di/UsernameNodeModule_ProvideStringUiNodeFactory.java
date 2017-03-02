package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsernameNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final UsernameNodeModule module;

  public UsernameNodeModule_ProvideStringUiNodeFactory(UsernameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(UsernameNodeModule module) {
    return new UsernameNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link UsernameNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(UsernameNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
