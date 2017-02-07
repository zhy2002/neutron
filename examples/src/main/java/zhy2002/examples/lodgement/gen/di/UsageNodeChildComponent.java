package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@UsageNodeChildScope
@Subcomponent(modules = {UsageNodeChildModule.class})
public interface UsageNodeChildComponent {

    UsedAsSecurityFlagNode provideUsedAsSecurityFlagNode(@Named("usedAsSecurityFlagNode") UsedAsSecurityFlagNode impl);
    BeingPurchasedFlagNode provideBeingPurchasedFlagNode(@Named("beingPurchasedFlagNode") BeingPurchasedFlagNode impl);
    OwnedOutrightFlagNode provideOwnedOutrightFlagNode(@Named("ownedOutrightFlagNode") OwnedOutrightFlagNode impl);
    PrimarySecurityFlagNode providePrimarySecurityFlagNode(@Named("primarySecurityFlagNode") PrimarySecurityFlagNode impl);
    ApprovalInPrincipleFlagNode provideApprovalInPrincipleFlagNode(@Named("approvalInPrincipleFlagNode") ApprovalInPrincipleFlagNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setUsageNodeChildModule(UsageNodeChildModule module);

        UsageNodeChildComponent build();
    }
}
