package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AccessContactTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactTypeNodeModule_ProvideAccessContactTypeNodeFactory
    implements Factory<AccessContactTypeNode> {
  private final AccessContactTypeNodeModule module;

  public AccessContactTypeNodeModule_ProvideAccessContactTypeNodeFactory(
      AccessContactTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccessContactTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideAccessContactTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccessContactTypeNode> create(AccessContactTypeNodeModule module) {
    return new AccessContactTypeNodeModule_ProvideAccessContactTypeNodeFactory(module);
  }

  /** Proxies {@link AccessContactTypeNodeModule#provideAccessContactTypeNode()}. */
  public static AccessContactTypeNode proxyProvideAccessContactTypeNode(
      AccessContactTypeNodeModule instance) {
    return instance.provideAccessContactTypeNode();
  }
}
