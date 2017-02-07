package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    OtherLiabilityNodeChildComponent.class
})
@OtherLiabilityListNodeItemScope
public class OtherLiabilityListNodeItemModule {

    private final OtherLiabilityListNode parent;

    public OtherLiabilityListNodeItemModule(OtherLiabilityListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @OtherLiabilityListNodeItemScope
    OtherLiabilityNode provideOtherLiabilityNode(
        MembersInjector<OtherLiabilityNode> injector
    ) {
        OtherLiabilityNode node = new OtherLiabilityNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}