package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@OtherLiabilityClearingFlagNodeScope
public class OtherLiabilityClearingFlagNodeRuleProvider implements RuleProvider<OtherLiabilityClearingFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityClearingFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityClearingFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<BooleanEnableSiblingRule> booleanEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            BooleanEnableSiblingRule booleanEnableSiblingRule = booleanEnableSiblingRuleProvider.get();
            booleanEnableSiblingRule.setSiblingName("otherLiabilityBreakCostNode");
            createdRules.add(booleanEnableSiblingRule);
    }

}
