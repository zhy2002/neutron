package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@UnemployedSinceNodeScope
public class UnemployedSinceNodeRuleProvider implements RuleProvider<UnemployedSinceNode> {

    @Inject
    MonthYearNodeRuleProvider parentRuleProvider;

    @Inject
    public UnemployedSinceNodeRuleProvider() {
    }

    @Override
    public void initializeState(UnemployedSinceNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
