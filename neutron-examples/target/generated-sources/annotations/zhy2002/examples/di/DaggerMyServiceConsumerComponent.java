package zhy2002.examples.di;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMyServiceConsumerComponent implements MyServiceConsumerComponent {
  private Provider<DbReader> dbReaderProvider;

  private Provider<MyOtherServiceProvider> provideMyOtherServiceProvider;

  private MembersInjector<MyDataReader> myDataReaderMembersInjector;

  private Provider<MyDataReader> myDataReaderProvider;

  private MembersInjector<MyServiceConsumer> myServiceConsumerMembersInjector;

  private Provider<MyServiceProvider> provideMyServiceProvider;

  private Provider<MyServiceConsumer> myServiceConsumerProvider;

  private DaggerMyServiceConsumerComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MyServiceConsumerComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.dbReaderProvider = DbReader_Factory.create(DbConnection_Factory.create());

    this.provideMyOtherServiceProvider =
        DoubleCheck.provider(
            MyModule_ProvideMyOtherServiceProviderFactory.create(
                builder.myModule, dbReaderProvider));

    this.myDataReaderMembersInjector =
        MyDataReader_MembersInjector.create(MySubClass_Factory.create());

    this.myDataReaderProvider =
        DoubleCheck.provider(MyDataReader_Factory.create(myDataReaderMembersInjector));

    this.myServiceConsumerMembersInjector =
        MyServiceConsumer_MembersInjector.create(
            provideMyOtherServiceProvider, myDataReaderProvider, MySubClass_Factory.create());

    this.provideMyServiceProvider =
        MyModule_ProvideMyServiceProviderFactory.create(builder.myModule);

    this.myServiceConsumerProvider =
        MyServiceConsumer_Factory.create(
            myServiceConsumerMembersInjector, provideMyServiceProvider);
  }

  @Override
  public MyServiceConsumer createMyServiceConsumer() {
    return myServiceConsumerProvider.get();
  }

  @Override
  public MyDataReader createDataReader() {
    return myDataReaderProvider.get();
  }

  public static final class Builder {
    private MyModule myModule;

    private Builder() {}

    public MyServiceConsumerComponent build() {
      if (myModule == null) {
        this.myModule = new MyModule();
      }
      return new DaggerMyServiceConsumerComponent(this);
    }

    public Builder myModule(MyModule myModule) {
      this.myModule = Preconditions.checkNotNull(myModule);
      return this;
    }
  }
}
