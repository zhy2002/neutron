package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AccessContactTitleNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactTitleNodeModule_ProvideAccessContactTitleNodeFactory
    implements Factory<AccessContactTitleNode> {
  private final AccessContactTitleNodeModule module;

  public AccessContactTitleNodeModule_ProvideAccessContactTitleNodeFactory(
      AccessContactTitleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccessContactTitleNode get() {
    return Preconditions.checkNotNull(
        module.provideAccessContactTitleNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccessContactTitleNode> create(AccessContactTitleNodeModule module) {
    return new AccessContactTitleNodeModule_ProvideAccessContactTitleNodeFactory(module);
  }

  /** Proxies {@link AccessContactTitleNodeModule#provideAccessContactTitleNode()}. */
  public static AccessContactTitleNode proxyProvideAccessContactTitleNode(
      AccessContactTitleNodeModule instance) {
    return instance.provideAccessContactTitleNode();
  }
}
