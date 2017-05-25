package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@HouseDutiesFlagNodeScope
public class HouseDutiesFlagNodeRuleProvider implements RuleProvider<HouseDutiesFlagNode> {

    @Inject
    YesNoOptionNodeRuleProvider parentRuleProvider;

    @Inject
    public HouseDutiesFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(HouseDutiesFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
