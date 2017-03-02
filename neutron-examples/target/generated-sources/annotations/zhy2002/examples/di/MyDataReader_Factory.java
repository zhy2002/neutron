package zhy2002.examples.di;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyDataReader_Factory implements Factory<MyDataReader> {
  private final MembersInjector<MyDataReader> myDataReaderMembersInjector;

  public MyDataReader_Factory(MembersInjector<MyDataReader> myDataReaderMembersInjector) {
    assert myDataReaderMembersInjector != null;
    this.myDataReaderMembersInjector = myDataReaderMembersInjector;
  }

  @Override
  public MyDataReader get() {
    return MembersInjectors.injectMembers(myDataReaderMembersInjector, new MyDataReader());
  }

  public static Factory<MyDataReader> create(
      MembersInjector<MyDataReader> myDataReaderMembersInjector) {
    return new MyDataReader_Factory(myDataReaderMembersInjector);
  }
}
