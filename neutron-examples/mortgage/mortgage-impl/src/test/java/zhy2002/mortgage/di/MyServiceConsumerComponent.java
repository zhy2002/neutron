package zhy2002.mortgage.di;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = MyModule.class)
public interface MyServiceConsumerComponent {

    MyServiceConsumer createMyServiceConsumer();

    MyDataReader createDataReader();
}
