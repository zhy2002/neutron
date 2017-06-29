package zhy2002.mortgage.di;

import dagger.Component;

import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
@Component(modules = {MyModule.class, MyOtherModule.class})
public interface MyOtherComponent {

    MyServiceConsumer createMyServiceConsumer();

    MyComponentService createMyComponentService();

    Provider<MyOtherServiceProvider> getOtherServiceProvider();
}
