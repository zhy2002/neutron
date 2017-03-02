package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.UsernameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsernameNodeModule_ProvideUsernameNodeFactory implements Factory<UsernameNode> {
  private final UsernameNodeModule module;

  public UsernameNodeModule_ProvideUsernameNodeFactory(UsernameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UsernameNode get() {
    return Preconditions.checkNotNull(
        module.provideUsernameNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UsernameNode> create(UsernameNodeModule module) {
    return new UsernameNodeModule_ProvideUsernameNodeFactory(module);
  }

  /** Proxies {@link UsernameNodeModule#provideUsernameNode()}. */
  public static UsernameNode proxyProvideUsernameNode(UsernameNodeModule instance) {
    return instance.provideUsernameNode();
  }
}
