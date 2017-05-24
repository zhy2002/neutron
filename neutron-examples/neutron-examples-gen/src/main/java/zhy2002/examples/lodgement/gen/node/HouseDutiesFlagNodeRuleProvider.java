package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

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
