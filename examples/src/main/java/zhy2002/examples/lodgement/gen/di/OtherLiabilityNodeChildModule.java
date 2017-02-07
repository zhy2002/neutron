package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@OtherLiabilityNodeChildScope
public class OtherLiabilityNodeChildModule {

    private final OtherLiabilityNode parent;

    public OtherLiabilityNodeChildModule(OtherLiabilityNode parent) {
        this.parent = parent;
    }


    @Provides
    @OtherLiabilityNodeChildScope
    @Named("otherLiabilityTypeNode")
    OtherLiabilityTypeNode provideOtherLiabilityTypeNode(
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
        MembersInjector<OtherLiabilityMarketValueNode> injector
    ) {
        OtherLiabilityMarketValueNode node = new OtherLiabilityMarketValueNode(parent, "otherLiabilityMarketValueNode");

        injector.injectMembers(node);
        return node;
    }

}