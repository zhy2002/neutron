package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AccessContactFirstNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactFirstNameNodeModule_ProvideAccessContactFirstNameNodeFactory
    implements Factory<AccessContactFirstNameNode> {
  private final AccessContactFirstNameNodeModule module;

  public AccessContactFirstNameNodeModule_ProvideAccessContactFirstNameNodeFactory(
      AccessContactFirstNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccessContactFirstNameNode get() {
    return Preconditions.checkNotNull(
        module.provideAccessContactFirstNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccessContactFirstNameNode> create(
      AccessContactFirstNameNodeModule module) {
    return new AccessContactFirstNameNodeModule_ProvideAccessContactFirstNameNodeFactory(module);
  }

  /** Proxies {@link AccessContactFirstNameNodeModule#provideAccessContactFirstNameNode()}. */
  public static AccessContactFirstNameNode proxyProvideAccessContactFirstNameNode(
      AccessContactFirstNameNodeModule instance) {
    return instance.provideAccessContactFirstNameNode();
  }
}
