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
public final class DummyListAItemModule_ProvideDummyListAItemNodeFactory
    implements Factory<DummyListAItemNode> {
  private final DummyListAItemModule module;

  private final Provider<DummyListANode> parentProvider;

  private final MembersInjector<DummyListAItemNode> injectorMembersInjector;

  public DummyListAItemModule_ProvideDummyListAItemNodeFactory(
      DummyListAItemModule module,
      Provider<DummyListANode> parentProvider,
      MembersInjector<DummyListAItemNode> injectorMembersInjector) {
    assert module != null;
    this.module = module;
    assert parentProvider != null;
    this.parentProvider = parentProvider;
    assert injectorMembersInjector != null;
    this.injectorMembersInjector = injectorMembersInjector;
  }

  @Override
  public DummyListAItemNode get() {
    return Preconditions.checkNotNull(
        module.provideDummyListAItemNode(parentProvider.get(), injectorMembersInjector),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DummyListAItemNode> create(
      DummyListAItemModule module,
      Provider<DummyListANode> parentProvider,
      MembersInjector<DummyListAItemNode> injectorMembersInjector) {
    return new DummyListAItemModule_ProvideDummyListAItemNodeFactory(
        module, parentProvider, injectorMembersInjector);
  }

  /**
   * Proxies {@link DummyListAItemModule#provideDummyListAItemNode(DummyListANode,
   * MembersInjector)}.
   */
  public static DummyListAItemNode proxyProvideDummyListAItemNode(
      DummyListAItemModule instance,
      DummyListANode parent,
      MembersInjector<DummyListAItemNode> injector) {
    return instance.provideDummyListAItemNode(parent, injector);
  }
}
