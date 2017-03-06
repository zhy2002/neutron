package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

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

        //todo move source to a profile
    }

}
