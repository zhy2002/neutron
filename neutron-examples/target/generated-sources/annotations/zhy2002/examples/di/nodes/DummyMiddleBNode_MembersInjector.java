package zhy2002.examples.di.nodes;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyMiddleBNode_MembersInjector implements MembersInjector<DummyMiddleBNode> {
  private final Provider<DummyMiddleANode> dummyMiddleA2NodeProvider;

  private final Provider<DummyListANode> dummyListANodeLazyProvider;

  public DummyMiddleBNode_MembersInjector(
      Provider<DummyMiddleANode> dummyMiddleA2NodeProvider,
      Provider<DummyListANode> dummyListANodeLazyProvider) {
    assert dummyMiddleA2NodeProvider != null;
    this.dummyMiddleA2NodeProvider = dummyMiddleA2NodeProvider;
    assert dummyListANodeLazyProvider != null;
    this.dummyListANodeLazyProvider = dummyListANodeLazyProvider;
  }

  public static MembersInjector<DummyMiddleBNode> create(
      Provider<DummyMiddleANode> dummyMiddleA2NodeProvider,
      Provider<DummyListANode> dummyListANodeLazyProvider) {
    return new DummyMiddleBNode_MembersInjector(
        dummyMiddleA2NodeProvider, dummyListANodeLazyProvider);
  }

  @Override
  public void injectMembers(DummyMiddleBNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.dummyMiddleA2Node = dummyMiddleA2NodeProvider.get();
    instance.dummyListANodeLazy = DoubleCheck.lazy(dummyListANodeLazyProvider);
  }

  public static void injectDummyMiddleA2Node(
      DummyMiddleBNode instance, Provider<DummyMiddleANode> dummyMiddleA2NodeProvider) {
    instance.dummyMiddleA2Node = dummyMiddleA2NodeProvider.get();
  }

  public static void injectDummyListANodeLazy(
      DummyMiddleBNode instance, Provider<DummyListANode> dummyListANodeLazyProvider) {
    instance.dummyListANodeLazy = DoubleCheck.lazy(dummyListANodeLazyProvider);
  }
}
