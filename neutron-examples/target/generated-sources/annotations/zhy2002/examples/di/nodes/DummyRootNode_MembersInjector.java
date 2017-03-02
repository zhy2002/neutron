package zhy2002.examples.di.nodes;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyRootNode_MembersInjector implements MembersInjector<DummyRootNode> {
  private final Provider<DummyChangeEngine> changeEngineProvider;

  private final Provider<DummyMiddleANode> dummyMiddleANodeLazy1Provider;

  private final Provider<DummyMiddleANode> dummyMiddleANodeLazy2Provider;

  private final Provider<DummyMiddleBNode> dummyMiddleBNodeLazyProvider;

  public DummyRootNode_MembersInjector(
      Provider<DummyChangeEngine> changeEngineProvider,
      Provider<DummyMiddleANode> dummyMiddleANodeLazy1Provider,
      Provider<DummyMiddleANode> dummyMiddleANodeLazy2Provider,
      Provider<DummyMiddleBNode> dummyMiddleBNodeLazyProvider) {
    assert changeEngineProvider != null;
    this.changeEngineProvider = changeEngineProvider;
    assert dummyMiddleANodeLazy1Provider != null;
    this.dummyMiddleANodeLazy1Provider = dummyMiddleANodeLazy1Provider;
    assert dummyMiddleANodeLazy2Provider != null;
    this.dummyMiddleANodeLazy2Provider = dummyMiddleANodeLazy2Provider;
    assert dummyMiddleBNodeLazyProvider != null;
    this.dummyMiddleBNodeLazyProvider = dummyMiddleBNodeLazyProvider;
  }

  public static MembersInjector<DummyRootNode> create(
      Provider<DummyChangeEngine> changeEngineProvider,
      Provider<DummyMiddleANode> dummyMiddleANodeLazy1Provider,
      Provider<DummyMiddleANode> dummyMiddleANodeLazy2Provider,
      Provider<DummyMiddleBNode> dummyMiddleBNodeLazyProvider) {
    return new DummyRootNode_MembersInjector(
        changeEngineProvider,
        dummyMiddleANodeLazy1Provider,
        dummyMiddleANodeLazy2Provider,
        dummyMiddleBNodeLazyProvider);
  }

  @Override
  public void injectMembers(DummyRootNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.changeEngine = changeEngineProvider.get();
    instance.dummyMiddleANodeLazy1 = DoubleCheck.lazy(dummyMiddleANodeLazy1Provider);
    instance.dummyMiddleANodeLazy2 = DoubleCheck.lazy(dummyMiddleANodeLazy2Provider);
    instance.dummyMiddleBNodeLazy = DoubleCheck.lazy(dummyMiddleBNodeLazyProvider);
  }

  public static void injectChangeEngine(
      DummyRootNode instance, Provider<DummyChangeEngine> changeEngineProvider) {
    instance.changeEngine = changeEngineProvider.get();
  }

  public static void injectDummyMiddleANodeLazy1(
      DummyRootNode instance, Provider<DummyMiddleANode> dummyMiddleANodeLazy1Provider) {
    instance.dummyMiddleANodeLazy1 = DoubleCheck.lazy(dummyMiddleANodeLazy1Provider);
  }

  public static void injectDummyMiddleANodeLazy2(
      DummyRootNode instance, Provider<DummyMiddleANode> dummyMiddleANodeLazy2Provider) {
    instance.dummyMiddleANodeLazy2 = DoubleCheck.lazy(dummyMiddleANodeLazy2Provider);
  }

  public static void injectDummyMiddleBNodeLazy(
      DummyRootNode instance, Provider<DummyMiddleBNode> dummyMiddleBNodeLazyProvider) {
    instance.dummyMiddleBNodeLazy = DoubleCheck.lazy(dummyMiddleBNodeLazyProvider);
  }
}
