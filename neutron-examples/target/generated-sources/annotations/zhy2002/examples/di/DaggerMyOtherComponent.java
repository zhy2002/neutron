package zhy2002.examples.di;

import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMyOtherComponent implements MyOtherComponent {
  private Provider<DbReader> dbReaderProvider;

  private Provider<MyOtherServiceProvider> provideMyOtherServiceProvider;

  private Provider<MyDataReader> getMyDataReaderProvider;

  private MembersInjector<MyServiceConsumer> myServiceConsumerMembersInjector;

  private Provider<MyServiceProvider> provideMyServiceProvider;

  private Provider<MyServiceConsumer> myServiceConsumerProvider;

  private Provider<MyOtherComponent> myOtherComponentProvider;

  private Provider<MyComponentService> myComponentServiceProvider;

  private DaggerMyOtherComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MyOtherComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.dbReaderProvider = DbReader_Factory.create(DbConnection_Factory.create());

    this.provideMyOtherServiceProvider =
        DoubleCheck.provider(
            MyModule_ProvideMyOtherServiceProviderFactory.create(
                builder.myModule, dbReaderProvider));

    this.getMyDataReaderProvider =
        MyOtherModule_GetMyDataReaderFactory.create(builder.myOtherModule);

    this.myServiceConsumerMembersInjector =
        MyServiceConsumer_MembersInjector.create(
            provideMyOtherServiceProvider, getMyDataReaderProvider, MySubClass_Factory.create());

    this.provideMyServiceProvider =
        MyModule_ProvideMyServiceProviderFactory.create(builder.myModule);

    this.myServiceConsumerProvider =
        MyServiceConsumer_Factory.create(
            myServiceConsumerMembersInjector, provideMyServiceProvider);

    this.myOtherComponentProvider = InstanceFactory.<MyOtherComponent>create(this);

    this.myComponentServiceProvider = MyComponentService_Factory.create(myOtherComponentProvider);
  }

  @Override
  public MyServiceConsumer createMyServiceConsumer() {
    return myServiceConsumerProvider.get();
  }

  @Override
  public MyComponentService createMyComponentService() {
    return new MyComponentService(myOtherComponentProvider.get());
  }

  @Override
  public Provider<MyOtherServiceProvider> getOtherServiceProvider() {
    return provideMyOtherServiceProvider;
  }

  public static final class Builder {
    private MyModule myModule;

    private MyOtherModule myOtherModule;

    private Builder() {}

    public MyOtherComponent build() {
      if (myModule == null) {
        this.myModule = new MyModule();
      }
      if (myOtherModule == null) {
        this.myOtherModule = new MyOtherModule();
      }
      return new DaggerMyOtherComponent(this);
    }

    public Builder myModule(MyModule myModule) {
      this.myModule = Preconditions.checkNotNull(myModule);
      return this;
    }

    public Builder myOtherModule(MyOtherModule myOtherModule) {
      this.myOtherModule = Preconditions.checkNotNull(myOtherModule);
      return this;
    }
  }
}
