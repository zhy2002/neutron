package zhy2002.examples.di;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyComponentService_Factory implements Factory<MyComponentService> {
  private final Provider<MyOtherComponent> componentProvider;

  public MyComponentService_Factory(Provider<MyOtherComponent> componentProvider) {
    assert componentProvider != null;
    this.componentProvider = componentProvider;
  }

  @Override
  public MyComponentService get() {
    return new MyComponentService(componentProvider.get());
  }

  public static Factory<MyComponentService> create(Provider<MyOtherComponent> componentProvider) {
    return new MyComponentService_Factory(componentProvider);
  }
}
