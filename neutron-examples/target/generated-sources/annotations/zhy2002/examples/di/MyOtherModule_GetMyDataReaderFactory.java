package zhy2002.examples.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyOtherModule_GetMyDataReaderFactory implements Factory<MyDataReader> {
  private final MyOtherModule module;

  public MyOtherModule_GetMyDataReaderFactory(MyOtherModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MyDataReader get() {
    return Preconditions.checkNotNull(
        module.getMyDataReader(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MyDataReader> create(MyOtherModule module) {
    return new MyOtherModule_GetMyDataReaderFactory(module);
  }

  /** Proxies {@link MyOtherModule#getMyDataReader()}. */
  public static MyDataReader proxyGetMyDataReader(MyOtherModule instance) {
    return instance.getMyDataReader();
  }
}
