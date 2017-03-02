package zhy2002.examples.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_ProvideMyServiceProviderFactory implements Factory<MyServiceProvider> {
  private final MyModule module;

  public MyModule_ProvideMyServiceProviderFactory(MyModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MyServiceProvider get() {
    return Preconditions.checkNotNull(
        module.provideMyServiceProvider(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MyServiceProvider> create(MyModule module) {
    return new MyModule_ProvideMyServiceProviderFactory(module);
  }

  /** Proxies {@link MyModule#provideMyServiceProvider()}. */
  public static MyServiceProvider proxyProvideMyServiceProvider(MyModule instance) {
    return instance.provideMyServiceProvider();
  }
}
