package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmailNodeModule_ProvideStringUiNodeFactory implements Factory<StringUiNode<?>> {
  private final EmailNodeModule module;

  public EmailNodeModule_ProvideStringUiNodeFactory(EmailNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(EmailNodeModule module) {
    return new EmailNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link EmailNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(EmailNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
