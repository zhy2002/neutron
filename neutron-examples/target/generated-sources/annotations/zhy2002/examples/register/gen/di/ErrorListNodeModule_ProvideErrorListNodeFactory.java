package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.ErrorListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorListNodeModule_ProvideErrorListNodeFactory
    implements Factory<ErrorListNode> {
  private final ErrorListNodeModule module;

  public ErrorListNodeModule_ProvideErrorListNodeFactory(ErrorListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ErrorListNode get() {
    return Preconditions.checkNotNull(
        module.provideErrorListNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ErrorListNode> create(ErrorListNodeModule module) {
    return new ErrorListNodeModule_ProvideErrorListNodeFactory(module);
  }

  /** Proxies {@link ErrorListNodeModule#provideErrorListNode()}. */
  public static ErrorListNode proxyProvideErrorListNode(ErrorListNodeModule instance) {
    return instance.provideErrorListNode();
  }
}
