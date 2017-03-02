package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AccessContactLastNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactLastNameNodeModule_ProvideAccessContactLastNameNodeFactory
    implements Factory<AccessContactLastNameNode> {
  private final AccessContactLastNameNodeModule module;

  public AccessContactLastNameNodeModule_ProvideAccessContactLastNameNodeFactory(
      AccessContactLastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccessContactLastNameNode get() {
    return Preconditions.checkNotNull(
        module.provideAccessContactLastNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccessContactLastNameNode> create(AccessContactLastNameNodeModule module) {
    return new AccessContactLastNameNodeModule_ProvideAccessContactLastNameNodeFactory(module);
  }

  /** Proxies {@link AccessContactLastNameNodeModule#provideAccessContactLastNameNode()}. */
  public static AccessContactLastNameNode proxyProvideAccessContactLastNameNode(
      AccessContactLastNameNodeModule instance) {
    return instance.provideAccessContactLastNameNode();
  }
}
