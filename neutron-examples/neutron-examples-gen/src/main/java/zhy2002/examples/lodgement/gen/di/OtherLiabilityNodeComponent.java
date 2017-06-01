package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherLiabilityNodeModule.class})
public interface OtherLiabilityNodeComponent {

    List<RuleProvider<OtherLiabilityNode>> provideRuleProviders();

    OtherLiabilityTypeNode createOtherLiabilityTypeNode();
    OtherLiabilityDescriptionNode createOtherLiabilityDescriptionNode();
    OtherLiabilityLimitAmountNode createOtherLiabilityLimitAmountNode();
    OtherLiabilityAmountOwningNode createOtherLiabilityAmountOwningNode();
    OtherLiabilityMonthlyRepaymentNode createOtherLiabilityMonthlyRepaymentNode();
    OtherLiabilityClearingFlagNode createOtherLiabilityClearingFlagNode();
    OtherLiabilityBreakCostNode createOtherLiabilityBreakCostNode();
    OtherLiabilityOwnershipListNode createOtherLiabilityOwnershipListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityNodeModule(OtherLiabilityNodeModule module);

        OtherLiabilityNodeComponent build();
    }

}
