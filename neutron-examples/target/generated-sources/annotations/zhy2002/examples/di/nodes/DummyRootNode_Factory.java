package zhy2002.examples.di.nodes;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyRootNode_Factory implements Factory<DummyRootNode> {
  private final MembersInjector<DummyRootNode> dummyRootNodeMembersInjector;

  private final Provider<DummyContext> contextProvider;

  public DummyRootNode_Factory(
      MembersInjector<DummyRootNode> dummyRootNodeMembersInjector,
      Provider<DummyContext> contextProvider) {
    assert dummyRootNodeMembersInjector != null;
    this.dummyRootNodeMembersInjector = dummyRootNodeMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public DummyRootNode get() {
    return MembersInjectors.injectMembers(
        dummyRootNodeMembersInjector, new DummyRootNode(contextProvider.get()));
  }

  public static Factory<DummyRootNode> create(
      MembersInjector<DummyRootNode> dummyRootNodeMembersInjector,
      Provider<DummyContext> contextProvider) {
    return new DummyRootNode_Factory(dummyRootNodeMembersInjector, contextProvider);
  }
}
