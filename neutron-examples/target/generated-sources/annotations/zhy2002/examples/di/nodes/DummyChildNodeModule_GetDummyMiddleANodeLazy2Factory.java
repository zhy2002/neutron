package zhy2002.examples.di.nodes;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyChildNodeModule_GetDummyMiddleANodeLazy2Factory
    implements Factory<DummyMiddleANode> {
  private final DummyChildNodeModule module;

  private final Provider<DummyRootNode> parentProvider;

  public DummyChildNodeModule_GetDummyMiddleANodeLazy2Factory(
      DummyChildNodeModule module, Provider<DummyRootNode> parentProvider) {
    assert module != null;
    this.module = module;
    assert parentProvider != null;
    this.parentProvider = parentProvider;
  }

  @Override
  public DummyMiddleANode get() {
    return Preconditions.checkNotNull(
        module.getDummyMiddleANodeLazy2(parentProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DummyMiddleANode> create(
      DummyChildNodeModule module, Provider<DummyRootNode> parentProvider) {
    return new DummyChildNodeModule_GetDummyMiddleANodeLazy2Factory(module, parentProvider);
  }

  /** Proxies {@link DummyChildNodeModule#getDummyMiddleANodeLazy2(DummyRootNode)}. */
  public static DummyMiddleANode proxyGetDummyMiddleANodeLazy2(
      DummyChildNodeModule instance, DummyRootNode parent) {
    return instance.getDummyMiddleANodeLazy2(parent);
  }
}
