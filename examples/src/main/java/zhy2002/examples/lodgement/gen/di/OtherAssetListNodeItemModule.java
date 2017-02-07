package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    OtherAssetNodeChildComponent.class
})
@OtherAssetListNodeItemScope
public class OtherAssetListNodeItemModule {

    private final OtherAssetListNode parent;

    public OtherAssetListNodeItemModule(OtherAssetListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @OtherAssetListNodeItemScope
    OtherAssetNode provideOtherAssetNode(
        MembersInjector<OtherAssetNode> injector
    ) {
        OtherAssetNode node = new OtherAssetNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}