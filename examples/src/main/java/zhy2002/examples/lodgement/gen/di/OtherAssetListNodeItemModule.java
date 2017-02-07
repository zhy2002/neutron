package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@OtherAssetListNodeItemScope
public class OtherAssetListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @OtherAssetListNodeItemScope
    OtherAssetNode provideOtherAssetNode(
        OtherAssetListNode parent,
        MembersInjector<OtherAssetNode> injector
    ) {
        OtherAssetNode node = new OtherAssetNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}