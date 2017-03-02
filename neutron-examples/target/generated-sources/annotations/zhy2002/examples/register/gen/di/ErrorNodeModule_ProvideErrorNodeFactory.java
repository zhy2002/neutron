package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.ErrorNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorNodeModule_ProvideErrorNodeFactory implements Factory<ErrorNode> {
  private final ErrorNodeModule module;

  public ErrorNodeModule_ProvideErrorNodeFactory(ErrorNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ErrorNode get() {
    return Preconditions.checkNotNull(
        module.provideErrorNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ErrorNode> create(ErrorNodeModule module) {
    return new ErrorNodeModule_ProvideErrorNodeFactory(module);
  }

  /** Proxies {@link ErrorNodeModule#provideErrorNode()}. */
  public static ErrorNode proxyProvideErrorNode(ErrorNodeModule instance) {
    return instance.provideErrorNode();
  }
}
