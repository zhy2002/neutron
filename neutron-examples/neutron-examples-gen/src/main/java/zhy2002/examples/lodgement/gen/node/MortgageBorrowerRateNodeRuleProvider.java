package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@MortgageBorrowerRateNodeScope
public class MortgageBorrowerRateNodeRuleProvider implements RuleProvider<MortgageBorrowerRateNode> {

    @Inject
    BasePercentageNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageBorrowerRateNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageBorrowerRateNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
