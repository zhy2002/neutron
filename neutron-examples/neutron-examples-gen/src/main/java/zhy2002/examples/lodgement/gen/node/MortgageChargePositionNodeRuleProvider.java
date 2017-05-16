package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@MortgageChargePositionNodeScope
public class MortgageChargePositionNodeRuleProvider implements RuleProvider<MortgageChargePositionNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageChargePositionNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageChargePositionNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.LENDER_CHARGE_POSITION);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
