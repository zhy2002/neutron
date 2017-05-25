package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@CurrentEmploymentNodeScope
public class CurrentEmploymentNodeRuleProvider implements RuleProvider<CurrentEmploymentNode> {

    @Inject
    EmploymentNodeRuleProvider parentRuleProvider;

    @Inject
    public CurrentEmploymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(CurrentEmploymentNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
