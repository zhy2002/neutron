package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.PasswordNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PasswordNodeModule_ProvidePasswordNodeFactory implements Factory<PasswordNode> {
  private final PasswordNodeModule module;

  public PasswordNodeModule_ProvidePasswordNodeFactory(PasswordNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PasswordNode get() {
    return Preconditions.checkNotNull(
        module.providePasswordNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PasswordNode> create(PasswordNodeModule module) {
    return new PasswordNodeModule_ProvidePasswordNodeFactory(module);
  }

  /** Proxies {@link PasswordNodeModule#providePasswordNode()}. */
  public static PasswordNode proxyProvidePasswordNode(PasswordNodeModule instance) {
    return instance.providePasswordNode();
  }
}
