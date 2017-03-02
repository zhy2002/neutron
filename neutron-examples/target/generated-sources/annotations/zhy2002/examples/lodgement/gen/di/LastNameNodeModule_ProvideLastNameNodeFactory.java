package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LastNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LastNameNodeModule_ProvideLastNameNodeFactory implements Factory<LastNameNode> {
  private final LastNameNodeModule module;

  public LastNameNodeModule_ProvideLastNameNodeFactory(LastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LastNameNode get() {
    return Preconditions.checkNotNull(
        module.provideLastNameNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LastNameNode> create(LastNameNodeModule module) {
    return new LastNameNodeModule_ProvideLastNameNodeFactory(module);
  }

  /** Proxies {@link LastNameNodeModule#provideLastNameNode()}. */
  public static LastNameNode proxyProvideLastNameNode(LastNameNodeModule instance) {
    return instance.provideLastNameNode();
  }
}
