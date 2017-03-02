package zhy2002.examples.di;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MyServiceConsumer_Factory implements Factory<MyServiceConsumer> {
  private final MembersInjector<MyServiceConsumer> myServiceConsumerMembersInjector;

  private final Provider<MyServiceProvider> providerProvider;

  public MyServiceConsumer_Factory(
      MembersInjector<MyServiceConsumer> myServiceConsumerMembersInjector,
      Provider<MyServiceProvider> providerProvider) {
    assert myServiceConsumerMembersInjector != null;
    this.myServiceConsumerMembersInjector = myServiceConsumerMembersInjector;
    assert providerProvider != null;
    this.providerProvider = providerProvider;
  }

  @Override
  public MyServiceConsumer get() {
    return MembersInjectors.injectMembers(
        myServiceConsumerMembersInjector, new MyServiceConsumer(providerProvider.get()));
  }

  public static Factory<MyServiceConsumer> create(
      MembersInjector<MyServiceConsumer> myServiceConsumerMembersInjector,
      Provider<MyServiceProvider> providerProvider) {
    return new MyServiceConsumer_Factory(myServiceConsumerMembersInjector, providerProvider);
  }
}
