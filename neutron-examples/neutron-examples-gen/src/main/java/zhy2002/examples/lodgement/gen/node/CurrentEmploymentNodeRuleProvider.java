package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

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

        node.setNodeLabel("Employment");
        node.setCurrentRecord(Boolean.TRUE);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
