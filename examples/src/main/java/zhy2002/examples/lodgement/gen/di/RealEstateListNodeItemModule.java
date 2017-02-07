package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@RealEstateListNodeItemScope
public class RealEstateListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @RealEstateListNodeItemScope
    RealEstateNode provideRealEstateNode(
        RealEstateListNode parent,
        MembersInjector<RealEstateNode> injector
    ) {
        RealEstateNode node = new RealEstateNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}