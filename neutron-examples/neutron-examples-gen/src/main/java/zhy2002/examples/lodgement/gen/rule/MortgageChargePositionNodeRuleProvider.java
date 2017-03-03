package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MortgageChargePositionNode;


@MortgageChargePositionNodeScope
public class MortgageChargePositionNodeRuleProvider
    extends StringUiNodeRuleProvider<MortgageChargePositionNode> {

    @Inject
    public MortgageChargePositionNodeRuleProvider() {}

    @Override
    public void initializeState(MortgageChargePositionNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
