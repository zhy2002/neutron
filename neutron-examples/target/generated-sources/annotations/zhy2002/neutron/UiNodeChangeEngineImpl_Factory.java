package zhy2002.neutron;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UiNodeChangeEngineImpl_Factory implements Factory<UiNodeChangeEngineImpl> {
  private static final UiNodeChangeEngineImpl_Factory INSTANCE =
      new UiNodeChangeEngineImpl_Factory();

  @Override
  public UiNodeChangeEngineImpl get() {
    return new UiNodeChangeEngineImpl();
  }

  public static Factory<UiNodeChangeEngineImpl> create() {
    return INSTANCE;
  }
}
