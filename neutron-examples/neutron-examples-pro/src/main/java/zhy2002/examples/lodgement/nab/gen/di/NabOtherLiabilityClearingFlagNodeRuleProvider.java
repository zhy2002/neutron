package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.nab.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@OtherLiabilityClearingFlagNodeScope
public class NabOtherLiabilityClearingFlagNodeRuleProvider extends OtherLiabilityClearingFlagNodeRuleProvider {

    @Inject
    public NabOtherLiabilityClearingFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityClearingFlagNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<BooleanEnableSiblingRule> booleanEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        BooleanEnableSiblingRule booleanEnableSiblingRule = booleanEnableSiblingRuleProvider.get();
        booleanEnableSiblingRule.setSiblingName("otherLiabilityBreakCostNode");
        createdRules.add(booleanEnableSiblingRule);
    }

}
