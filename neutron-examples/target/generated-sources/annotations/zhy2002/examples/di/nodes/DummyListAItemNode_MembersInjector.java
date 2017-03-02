package zhy2002.examples.di.nodes;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyListAItemNode_MembersInjector
    implements MembersInjector<DummyListAItemNode> {
  private final Provider<DummyRootNode> rootNodeProvider;

  public DummyListAItemNode_MembersInjector(Provider<DummyRootNode> rootNodeProvider) {
    assert rootNodeProvider != null;
    this.rootNodeProvider = rootNodeProvider;
  }

  public static MembersInjector<DummyListAItemNode> create(
      Provider<DummyRootNode> rootNodeProvider) {
    return new DummyListAItemNode_MembersInjector(rootNodeProvider);
  }

  @Override
  public void injectMembers(DummyListAItemNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.rootNode = rootNodeProvider.get();
  }

  public static void injectRootNode(
      DummyListAItemNode instance, Provider<DummyRootNode> rootNodeProvider) {
    instance.rootNode = rootNodeProvider.get();
  }
}
