package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MortgageBorrowerRateNode;


@MortgageBorrowerRateNodeScope
public class MortgageBorrowerRateNodeRuleProvider
    extends BasePercentageNodeRuleProvider<MortgageBorrowerRateNode> {

    @Inject
    public MortgageBorrowerRateNodeRuleProvider() {}

    @Override
    public void initializeState(MortgageBorrowerRateNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
