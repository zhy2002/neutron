package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.FirstNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirstNameNodeModule_ProvideFirstNameNodeFactory
    implements Factory<FirstNameNode> {
  private final FirstNameNodeModule module;

  public FirstNameNodeModule_ProvideFirstNameNodeFactory(FirstNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public FirstNameNode get() {
    return Preconditions.checkNotNull(
        module.provideFirstNameNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FirstNameNode> create(FirstNameNodeModule module) {
    return new FirstNameNodeModule_ProvideFirstNameNodeFactory(module);
  }

  /** Proxies {@link FirstNameNodeModule#provideFirstNameNode()}. */
  public static FirstNameNode proxyProvideFirstNameNode(FirstNameNodeModule instance) {
    return instance.provideFirstNameNode();
  }
}
