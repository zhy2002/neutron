package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@RetiredSinceNodeScope
public class RetiredSinceNodeRuleProvider implements RuleProvider<RetiredSinceNode> {

    @Inject
    MonthYearNodeRuleProvider parentRuleProvider;

    @Inject
    public RetiredSinceNodeRuleProvider() {
    }

    @Override
    public void initializeState(RetiredSinceNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
