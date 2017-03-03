package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.DefenseServiceFlagNode;


@DefenseServiceFlagNodeScope
public class DefenseServiceFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<DefenseServiceFlagNode> {

    @Inject
    public DefenseServiceFlagNodeRuleProvider() {}

    @Override
    public void initializeState(DefenseServiceFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
