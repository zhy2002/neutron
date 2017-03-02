package zhy2002.examples.di.nodes;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyChildNodeModule_GetDummyMiddleBNodeLazyFactory
    implements Factory<DummyMiddleBNode> {
  private final DummyChildNodeModule module;

  private final Provider<DummyRootNode> parentProvider;

  private final MembersInjector<DummyMiddleBNode> injectorMembersInjector;

  public DummyChildNodeModule_GetDummyMiddleBNodeLazyFactory(
      DummyChildNodeModule module,
      Provider<DummyRootNode> parentProvider,
      MembersInjector<DummyMiddleBNode> injectorMembersInjector) {
    assert module != null;
    this.module = module;
    assert parentProvider != null;
    this.parentProvider = parentProvider;
    assert injectorMembersInjector != null;
    this.injectorMembersInjector = injectorMembersInjector;
  }

  @Override
  public DummyMiddleBNode get() {
    return Preconditions.checkNotNull(
        module.getDummyMiddleBNodeLazy(parentProvider.get(), injectorMembersInjector),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DummyMiddleBNode> create(
      DummyChildNodeModule module,
      Provider<DummyRootNode> parentProvider,
      MembersInjector<DummyMiddleBNode> injectorMembersInjector) {
    return new DummyChildNodeModule_GetDummyMiddleBNodeLazyFactory(
        module, parentProvider, injectorMembersInjector);
  }

  /**
   * Proxies {@link DummyChildNodeModule#getDummyMiddleBNodeLazy(DummyRootNode, MembersInjector)}.
   */
  public static DummyMiddleBNode proxyGetDummyMiddleBNodeLazy(
      DummyChildNodeModule instance,
      DummyRootNode parent,
      MembersInjector<DummyMiddleBNode> injector) {
    return instance.getDummyMiddleBNodeLazy(parent, injector);
  }
}
