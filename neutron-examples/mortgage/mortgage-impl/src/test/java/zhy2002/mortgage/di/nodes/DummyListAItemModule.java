package zhy2002.mortgage.di.nodes;

import dagger.MembersInjector;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class DummyListAItemModule {

    private final String itemName;

    public DummyListAItemModule(String itemName) {
        this.itemName = itemName;
    }

    @Provides
    @DummyListAItemScope
    DummyListAItemNode provideDummyListAItemNode(@Named("dummyListANode") DummyListANode parent, MembersInjector<DummyListAItemNode> injector) {
        DummyListAItemNode node = new DummyListAItemNode(parent, itemName);
        injector.injectMembers(node);
        return node;
    }


}
