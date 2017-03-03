package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.UnemployedSinceNode;


@UnemployedSinceNodeScope
public class UnemployedSinceNodeRuleProvider
    extends MonthYearNodeRuleProvider<UnemployedSinceNode> {

    @Inject
    public UnemployedSinceNodeRuleProvider() {}

    @Override
    public void initializeState(UnemployedSinceNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
