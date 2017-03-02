package zhy2002.examples.di.nodes;

import dagger.MembersInjector;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

@Module(subcomponents = {DummyListAItemComponent.class})
public class DummyChildNodeModule {

    @Provides
    @Named("dummyMiddleANodeLazy1")
    @Singleton
    DummyMiddleANode getDummyMiddleANodeLazy1(DummyRootNode parent, MembersInjector<DummyMiddleANode> injector) {
        DummyMiddleANode node = new DummyMiddleANode(parent, "dummyMiddleANodeLazy1");
        injector.injectMembers(node);
        return node;
    }

    @Provides
    @Named("dummyMiddleANodeLazy2")
    @Singleton
    DummyMiddleANode getDummyMiddleANodeLazy2(DummyRootNode parent) {
        return new DummyMiddleANode(parent, "dummyMiddleANodeLazy2");
    }

    @Provides
    @Named("dummyMiddleBNodeLazy")
    @Singleton
    DummyMiddleBNode getDummyMiddleBNodeLazy(DummyRootNode parent, MembersInjector<DummyMiddleBNode> injector) {
        DummyMiddleBNode node = new DummyMiddleBNode(parent, "dummyMiddleBNodeLazy");
        injector.injectMembers(node);
        return node;
    }

    @Provides
    @Named("dummyListANode")
    @Singleton
    DummyListANode getDummyListANode(@Named("dummyMiddleBNodeLazy") DummyMiddleBNode parent, MembersInjector<DummyListANode> injector) {
        DummyListANode node = new DummyListANode(parent, "dummyListANode");
        injector.injectMembers(node);
        return node;
    }

//    @Provides
//    DummyRootNode getDummyRootNode(DummyContext context) {
//        return new DummyRootNode(context);
//    }

}
