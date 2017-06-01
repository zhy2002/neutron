package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {UsageNodeModule.class})
public interface UsageNodeComponent {

    List<RuleProvider<UsageNode>> provideRuleProviders();

    UsedAsSecurityFlagNode createUsedAsSecurityFlagNode();
    BeingPurchasedFlagNode createBeingPurchasedFlagNode();
    OwnedOutrightFlagNode createOwnedOutrightFlagNode();
    PrimarySecurityFlagNode createPrimarySecurityFlagNode();
    ApprovalInPrincipleFlagNode createApprovalInPrincipleFlagNode();
    ExistingMortgageListNode createExistingMortgageListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setUsageNodeModule(UsageNodeModule module);

        UsageNodeComponent build();
    }

}
