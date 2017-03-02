package zhy2002.examples.di.nodes;

import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyContext_Factory implements Factory<DummyContext> {
  private final Provider<DummyChangeEngineImpl> changeEngineProvider;

  private final Provider<DummyRootNode> rootNodeLazyProvider;

  public DummyContext_Factory(
      Provider<DummyChangeEngineImpl> changeEngineProvider,
      Provider<DummyRootNode> rootNodeLazyProvider) {
    assert changeEngineProvider != null;
    this.changeEngineProvider = changeEngineProvider;
    assert rootNodeLazyProvider != null;
    this.rootNodeLazyProvider = rootNodeLazyProvider;
  }

  @Override
  public DummyContext get() {
    return new DummyContext(changeEngineProvider.get(), DoubleCheck.lazy(rootNodeLazyProvider));
  }

  public static Factory<DummyContext> create(
      Provider<DummyChangeEngineImpl> changeEngineProvider,
      Provider<DummyRootNode> rootNodeLazyProvider) {
    return new DummyContext_Factory(changeEngineProvider, rootNodeLazyProvider);
  }
}
