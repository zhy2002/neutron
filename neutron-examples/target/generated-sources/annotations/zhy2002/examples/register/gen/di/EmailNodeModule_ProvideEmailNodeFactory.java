package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.EmailNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmailNodeModule_ProvideEmailNodeFactory implements Factory<EmailNode> {
  private final EmailNodeModule module;

  public EmailNodeModule_ProvideEmailNodeFactory(EmailNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmailNode get() {
    return Preconditions.checkNotNull(
        module.provideEmailNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmailNode> create(EmailNodeModule module) {
    return new EmailNodeModule_ProvideEmailNodeFactory(module);
  }

  /** Proxies {@link EmailNodeModule#provideEmailNode()}. */
  public static EmailNode proxyProvideEmailNode(EmailNodeModule instance) {
    return instance.provideEmailNode();
  }
}
