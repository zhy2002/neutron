package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@OtherLiabilityListNodeItemScope
public class OtherLiabilityListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @OtherLiabilityListNodeItemScope
    OtherLiabilityNode provideOtherLiabilityNode(
        OtherLiabilityListNode parent,
        MembersInjector<OtherLiabilityNode> injector
    ) {
        OtherLiabilityNode node = new OtherLiabilityNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}