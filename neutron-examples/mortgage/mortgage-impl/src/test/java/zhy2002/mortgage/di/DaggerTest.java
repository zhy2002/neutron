package zhy2002.mortgage.di;

import org.junit.Test;
import zhy2002.mortgage.di.nodes.*;

import javax.inject.Provider;

import java.util.Set;

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
        MyOtherComponent component = DaggerMyOtherComponent.create();
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

    @Test
    public void canInjectParametrizedConstructorAutomatically() {
        MyOtherComponent myOtherComponent = DaggerMyOtherComponent.create();
        Provider<MyOtherServiceProvider> providerProvider = myOtherComponent.getOtherServiceProvider();

        assertThat(providerProvider.get().getReader().getConnection(), notNullValue());
    }

    @Test
    public void dummyTests() {
        DummyContextComponent contextComponent = DaggerDummyContextComponent.create();

        assertThat(contextComponent.provideDummyContext(), sameInstance(contextComponent.provideDummyContext()));
        DummyContext context = contextComponent.provideDummyContext();
        DummyRootNode rootNode = context.getRootNodeLazy().get();

        assertThat(rootNode, equalTo(context.getRootNodeLazy().get()));
        assertThat(context.getChangeEngine(), sameInstance(rootNode.getChangeEngine()));

        Set<Object> children = rootNode.getChildren();
        assertThat(children, hasSize(3));

        assertThat(children.contains(rootNode.getDummyMiddleANodeLazy1().get()), equalTo(true));

        assertThat(rootNode.getDummyMiddleBNodeLazy().get().getDummyMiddleA2Node(), sameInstance(rootNode.getDummyMiddleANodeLazy2().get()));

        DummyMiddleBNode dummyMiddleBNode = rootNode.getDummyMiddleBNodeLazy().get();

        DummyListANode listANode = dummyMiddleBNode.getDummyListANodeLazy().get();

        DummyListAItemComponent.Builder builder1 = listANode.getItemComponentBuilderProvider().get();
        DummyListAItemComponent.Builder builder2 = listANode.getItemComponentBuilderProvider().get();

        assertThat(builder1, not(sameInstance(builder2)));

        DummyListAItemComponent component1 = builder1.dummyListAItemModule(new DummyListAItemModule("1")).build();
        DummyListAItemComponent component2 = builder2.dummyListAItemModule(new DummyListAItemModule("2")).build();

        assertThat(component1, not(sameInstance(component2)));

        DummyListAItemNode node1 = component1.provideDummyListAItemNode();

        assertThat(node1, sameInstance(component1.provideDummyListAItemNode()));

        assertThat(node1.getName(), equalTo("1"));

        DummyListAItemNode node2 = component2.provideDummyListAItemNode();

        assertThat(node2.getName(), equalTo("2"));

        assertThat(node2.getRootNode(), sameInstance(rootNode));
    }

    @Test
    public void scopeIsNotInherited() {
        MyServiceConsumerComponent component = DaggerMyServiceConsumerComponent.create();

        assertThat(component.createDataReader().getMySubClass(), not(sameInstance(component.createMyServiceConsumer().getMySubClass())));
    }
}
