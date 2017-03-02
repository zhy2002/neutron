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
public final class DummyChildNodeModule_GetDummyListANodeFactory
    implements Factory<DummyListANode> {
  private final DummyChildNodeModule module;

  private final Provider<DummyMiddleBNode> parentProvider;

  private final MembersInjector<DummyListANode> injectorMembersInjector;

  public DummyChildNodeModule_GetDummyListANodeFactory(
      DummyChildNodeModule module,
      Provider<DummyMiddleBNode> parentProvider,
      MembersInjector<DummyListANode> injectorMembersInjector) {
    assert module != null;
    this.module = module;
    assert parentProvider != null;
    this.parentProvider = parentProvider;
    assert injectorMembersInjector != null;
    this.injectorMembersInjector = injectorMembersInjector;
  }

  @Override
  public DummyListANode get() {
    return Preconditions.checkNotNull(
        module.getDummyListANode(parentProvider.get(), injectorMembersInjector),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DummyListANode> create(
      DummyChildNodeModule module,
      Provider<DummyMiddleBNode> parentProvider,
      MembersInjector<DummyListANode> injectorMembersInjector) {
    return new DummyChildNodeModule_GetDummyListANodeFactory(
        module, parentProvider, injectorMembersInjector);
  }

  /** Proxies {@link DummyChildNodeModule#getDummyListANode(DummyMiddleBNode, MembersInjector)}. */
  public static DummyListANode proxyGetDummyListANode(
      DummyChildNodeModule instance,
      DummyMiddleBNode parent,
      MembersInjector<DummyListANode> injector) {
    return instance.getDummyListANode(parent, injector);
  }
}
