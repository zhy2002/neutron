package zhy2002.examples.di.nodes;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyChangeEngineImpl_Factory implements Factory<DummyChangeEngineImpl> {
  private static final DummyChangeEngineImpl_Factory INSTANCE = new DummyChangeEngineImpl_Factory();

  @Override
  public DummyChangeEngineImpl get() {
    return new DummyChangeEngineImpl();
  }

  public static Factory<DummyChangeEngineImpl> create() {
    return INSTANCE;
  }
}
