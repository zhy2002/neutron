package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    RealEstateNodeChildComponent.class
})
@RealEstateListNodeItemScope
public class RealEstateListNodeItemModule {

    private final RealEstateListNode parent;

    public RealEstateListNodeItemModule(RealEstateListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @RealEstateListNodeItemScope
    RealEstateNode provideRealEstateNode(
        MembersInjector<RealEstateNode> injector
    ) {
        RealEstateNode node = new RealEstateNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}