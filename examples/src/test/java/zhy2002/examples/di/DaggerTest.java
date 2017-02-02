package zhy2002.examples.di;

import org.junit.Test;

import javax.inject.Provider;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DaggerTest {

    @Test
    public void differenceObjectGraphsGeneratedByDefault() {

        MyServiceConsumerComponent component = DaggerMyServiceConsumerComponent.builder().build();

        MyServiceConsumer consumer1 = component.createMyServiceConsumer();
        MyServiceConsumer consumer2 = component.createMyServiceConsumer();

        assertThat(consumer1, not(sameInstance(consumer2)));
        assertThat(consumer1.getMyServiceProvider(), not(sameInstance(consumer2.getMyServiceProvider())));
        assertThat(consumer1.getMyOtherServiceProvider(), sameInstance(consumer2.getMyOtherServiceProvider()));
        assertThat(consumer1.getDataReader(), notNullValue());
        assertThat(consumer1.getDataReader(), sameInstance(consumer2.getDataReader()));
    }

    @Test
    public void canCreateSingletonComponentTwice() {
        MyServiceConsumerComponent component1 = DaggerMyServiceConsumerComponent.create();
        MyServiceConsumerComponent component2 = DaggerMyServiceConsumerComponent.create();

        assertThat(component1, not(sameInstance(component2)));

        MyServiceConsumer consumer1 = component1.createMyServiceConsumer();
        MyServiceConsumer consumer2 = component2.createMyServiceConsumer();

        assertThat(consumer1, not(sameInstance(consumer2)));
        assertThat(consumer1.getMyServiceProvider(), not(sameInstance(consumer2.getMyServiceProvider())));
        assertThat(consumer1.getMyOtherServiceProvider(), not(sameInstance(consumer2.getMyOtherServiceProvider())));
        assertThat(consumer1.getDataReader(), not(sameInstance(consumer2.getDataReader())));
    }

    @Test
    public void moduleCanOverrideDefaultInstantiation() {
        MyOtherComponent component =  DaggerMyOtherComponent.create();
        MyServiceConsumer consumer = component.createMyServiceConsumer();

        assertThat(consumer.getDataReader().getValue(), equalTo("in MyOtherModule"));
    }

    @Test
    public void canInstantiateInjectableClassesNotInModule() {
        MyServiceConsumerComponent component1 = DaggerMyServiceConsumerComponent.create();
        MyServiceConsumer consumer1 = component1.createMyServiceConsumer();

        assertThat(consumer1.getDataReader().getValue(), equalTo("default"));
        assertThat(consumer1.getDataReader(), sameInstance(component1.createDataReader()));
    }

    @Test
    public void canInjectComponentIntoDependency() {
        MyOtherComponent myOtherComponent = DaggerMyOtherComponent.create();
        MyComponentService myComponentService = myOtherComponent.createMyComponentService();

        assertThat(myOtherComponent, sameInstance(myComponentService.getMyOtherComponent()));
    }

    @Test
    public void injectedProviderStillUpholdsSingletonAnnotation() {
        MyOtherComponent myOtherComponent = DaggerMyOtherComponent.create();
        Provider<MyOtherServiceProvider> providerProvider = myOtherComponent.getOtherServiceProvider();

        assertThat(providerProvider.get(), sameInstance(providerProvider.get()));
    }
}
