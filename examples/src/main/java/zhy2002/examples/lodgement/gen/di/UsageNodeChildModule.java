package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@UsageNodeChildScope
public class UsageNodeChildModule {

    private final UsageNode parent;

    public UsageNodeChildModule(UsageNode parent) {
        this.parent = parent;
    }


    @Provides
    @UsageNodeChildScope
    @Named("usedAsSecurityFlagNode")
    UsedAsSecurityFlagNode provideUsedAsSecurityFlagNode(
        MembersInjector<UsedAsSecurityFlagNode> injector
    ) {
        UsedAsSecurityFlagNode node = new UsedAsSecurityFlagNode(parent, "usedAsSecurityFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @UsageNodeChildScope
    @Named("beingPurchasedFlagNode")
    BeingPurchasedFlagNode provideBeingPurchasedFlagNode(
        MembersInjector<BeingPurchasedFlagNode> injector
    ) {
        BeingPurchasedFlagNode node = new BeingPurchasedFlagNode(parent, "beingPurchasedFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @UsageNodeChildScope
    @Named("ownedOutrightFlagNode")
    OwnedOutrightFlagNode provideOwnedOutrightFlagNode(
        MembersInjector<OwnedOutrightFlagNode> injector
    ) {
        OwnedOutrightFlagNode node = new OwnedOutrightFlagNode(parent, "ownedOutrightFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @UsageNodeChildScope
    @Named("primarySecurityFlagNode")
    PrimarySecurityFlagNode providePrimarySecurityFlagNode(
        MembersInjector<PrimarySecurityFlagNode> injector
    ) {
        PrimarySecurityFlagNode node = new PrimarySecurityFlagNode(parent, "primarySecurityFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @UsageNodeChildScope
    @Named("approvalInPrincipleFlagNode")
    ApprovalInPrincipleFlagNode provideApprovalInPrincipleFlagNode(
        MembersInjector<ApprovalInPrincipleFlagNode> injector
    ) {
        ApprovalInPrincipleFlagNode node = new ApprovalInPrincipleFlagNode(parent, "approvalInPrincipleFlagNode");

        injector.injectMembers(node);
        return node;
    }

}