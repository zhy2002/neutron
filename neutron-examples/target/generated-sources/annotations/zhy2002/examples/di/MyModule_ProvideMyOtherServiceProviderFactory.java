package zhy2002.examples.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyModule_ProvideMyOtherServiceProviderFactory
    implements Factory<MyOtherServiceProvider> {
  private final MyModule module;

  private final Provider<DbReader> readerProvider;

  public MyModule_ProvideMyOtherServiceProviderFactory(
      MyModule module, Provider<DbReader> readerProvider) {
    assert module != null;
    this.module = module;
    assert readerProvider != null;
    this.readerProvider = readerProvider;
  }

  @Override
  public MyOtherServiceProvider get() {
    return Preconditions.checkNotNull(
        module.provideMyOtherServiceProvider(readerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MyOtherServiceProvider> create(
      MyModule module, Provider<DbReader> readerProvider) {
    return new MyModule_ProvideMyOtherServiceProviderFactory(module, readerProvider);
  }

  /** Proxies {@link MyModule#provideMyOtherServiceProvider(DbReader)}. */
  public static MyOtherServiceProvider proxyProvideMyOtherServiceProvider(
      MyModule instance, DbReader reader) {
    return instance.provideMyOtherServiceProvider(reader);
  }
}
