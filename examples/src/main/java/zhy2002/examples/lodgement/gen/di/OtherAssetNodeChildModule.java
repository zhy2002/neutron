package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@OtherAssetNodeChildScope
public class OtherAssetNodeChildModule {


    @Provides
    @OtherAssetNodeChildScope
    @Named("otherAssetTypeNode")
    OtherAssetTypeNode provideOtherAssetTypeNode(
        OtherAssetNode parent,
        MembersInjector<OtherAssetTypeNode> injector
    ) {
        OtherAssetTypeNode node = new OtherAssetTypeNode(parent, "otherAssetTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @OtherAssetNodeChildScope
    @Named("otherAssetDescriptionNode")
    OtherAssetDescriptionNode provideOtherAssetDescriptionNode(
        OtherAssetNode parent,
        MembersInjector<OtherAssetDescriptionNode> injector
    ) {
        OtherAssetDescriptionNode node = new OtherAssetDescriptionNode(parent, "otherAssetDescriptionNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @OtherAssetNodeChildScope
    @Named("otherAssetMarketValueNode")
    OtherAssetMarketValueNode provideOtherAssetMarketValueNode(
        OtherAssetNode parent,
        MembersInjector<OtherAssetMarketValueNode> injector
    ) {
        OtherAssetMarketValueNode node = new OtherAssetMarketValueNode(parent, "otherAssetMarketValueNode");

        injector.injectMembers(node);
        return node;
    }

}