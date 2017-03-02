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
public final class DummyChildNodeModule_GetDummyMiddleANodeLazy1Factory
    implements Factory<DummyMiddleANode> {
  private final DummyChildNodeModule module;

  private final Provider<DummyRootNode> parentProvider;

  private final MembersInjector<DummyMiddleANode> injectorMembersInjector;

  public DummyChildNodeModule_GetDummyMiddleANodeLazy1Factory(
      DummyChildNodeModule module,
      Provider<DummyRootNode> parentProvider,
      MembersInjector<DummyMiddleANode> injectorMembersInjector) {
    assert module != null;
    this.module = module;
    assert parentProvider != null;
    this.parentProvider = parentProvider;
    assert injectorMembersInjector != null;
    this.injectorMembersInjector = injectorMembersInjector;
  }

  @Override
  public DummyMiddleANode get() {
    return Preconditions.checkNotNull(
        module.getDummyMiddleANodeLazy1(parentProvider.get(), injectorMembersInjector),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DummyMiddleANode> create(
      DummyChildNodeModule module,
      Provider<DummyRootNode> parentProvider,
      MembersInjector<DummyMiddleANode> injectorMembersInjector) {
    return new DummyChildNodeModule_GetDummyMiddleANodeLazy1Factory(
        module, parentProvider, injectorMembersInjector);
  }

  /**
   * Proxies {@link DummyChildNodeModule#getDummyMiddleANodeLazy1(DummyRootNode, MembersInjector)}.
   */
  public static DummyMiddleANode proxyGetDummyMiddleANodeLazy1(
      DummyChildNodeModule instance,
      DummyRootNode parent,
      MembersInjector<DummyMiddleANode> injector) {
    return instance.getDummyMiddleANodeLazy1(parent, injector);
  }
}
