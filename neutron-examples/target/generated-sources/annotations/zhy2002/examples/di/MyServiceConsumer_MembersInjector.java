package zhy2002.examples.di;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyServiceConsumer_MembersInjector implements MembersInjector<MyServiceConsumer> {
  private final Provider<MyOtherServiceProvider> myOtherServiceProvider;

  private final Provider<MyDataReader> dataReaderProvider;

  private final Provider<MySubClass> mySubClassProvider;

  public MyServiceConsumer_MembersInjector(
      Provider<MyOtherServiceProvider> myOtherServiceProvider,
      Provider<MyDataReader> dataReaderProvider,
      Provider<MySubClass> mySubClassProvider) {
    assert myOtherServiceProvider != null;
    this.myOtherServiceProvider = myOtherServiceProvider;
    assert dataReaderProvider != null;
    this.dataReaderProvider = dataReaderProvider;
    assert mySubClassProvider != null;
    this.mySubClassProvider = mySubClassProvider;
  }

  public static MembersInjector<MyServiceConsumer> create(
      Provider<MyOtherServiceProvider> myOtherServiceProvider,
      Provider<MyDataReader> dataReaderProvider,
      Provider<MySubClass> mySubClassProvider) {
    return new MyServiceConsumer_MembersInjector(
        myOtherServiceProvider, dataReaderProvider, mySubClassProvider);
  }

  @Override
  public void injectMembers(MyServiceConsumer instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.myOtherServiceProvider = myOtherServiceProvider.get();
    instance.dataReader = dataReaderProvider.get();
    instance.mySubClass = mySubClassProvider.get();
  }

  public static void injectMyOtherServiceProvider(
      MyServiceConsumer instance, Provider<MyOtherServiceProvider> myOtherServiceProvider) {
    instance.myOtherServiceProvider = myOtherServiceProvider.get();
  }

  public static void injectDataReader(
      MyServiceConsumer instance, Provider<MyDataReader> dataReaderProvider) {
    instance.dataReader = dataReaderProvider.get();
  }

  public static void injectMySubClass(
      MyServiceConsumer instance, Provider<MySubClass> mySubClassProvider) {
    instance.mySubClass = mySubClassProvider.get();
  }
}
