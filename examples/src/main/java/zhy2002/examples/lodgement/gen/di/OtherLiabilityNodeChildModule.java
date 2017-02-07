package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@OtherLiabilityNodeChildScope
public class OtherLiabilityNodeChildModule {


    @Provides
    @OtherLiabilityNodeChildScope
    @Named("otherLiabilityTypeNode")
    OtherLiabilityTypeNode provideOtherLiabilityTypeNode(
        OtherLiabilityNode parent,
        MembersInjector<OtherLiabilityTypeNode> injector
    ) {
        OtherLiabilityTypeNode node = new OtherLiabilityTypeNode(parent, "otherLiabilityTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @OtherLiabilityNodeChildScope
    @Named("otherLiabilityDescriptionNode")
    OtherLiabilityDescriptionNode provideOtherLiabilityDescriptionNode(
        OtherLiabilityNode parent,
        MembersInjector<OtherLiabilityDescriptionNode> injector
    ) {
        OtherLiabilityDescriptionNode node = new OtherLiabilityDescriptionNode(parent, "otherLiabilityDescriptionNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @OtherLiabilityNodeChildScope
    @Named("otherLiabilityMarketValueNode")
    OtherLiabilityMarketValueNode provideOtherLiabilityMarketValueNode(
        OtherLiabilityNode parent,
        MembersInjector<OtherLiabilityMarketValueNode> injector
    ) {
        OtherLiabilityMarketValueNode node = new OtherLiabilityMarketValueNode(parent, "otherLiabilityMarketValueNode");

        injector.injectMembers(node);
        return node;
    }

}