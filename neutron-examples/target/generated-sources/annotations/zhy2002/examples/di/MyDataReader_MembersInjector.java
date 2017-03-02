package zhy2002.examples.di;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyDataReader_MembersInjector implements MembersInjector<MyDataReader> {
  private final Provider<MySubClass> mySubClassProvider;

  public MyDataReader_MembersInjector(Provider<MySubClass> mySubClassProvider) {
    assert mySubClassProvider != null;
    this.mySubClassProvider = mySubClassProvider;
  }

  public static MembersInjector<MyDataReader> create(Provider<MySubClass> mySubClassProvider) {
    return new MyDataReader_MembersInjector(mySubClassProvider);
  }

  @Override
  public void injectMembers(MyDataReader instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mySubClass = mySubClassProvider.get();
  }

  public static void injectMySubClass(
      MyDataReader instance, Provider<MySubClass> mySubClassProvider) {
    instance.mySubClass = mySubClassProvider.get();
  }
}
