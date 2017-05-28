package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.EmploymentTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@EmploymentTypeNodeScope
public class EmploymentTypeNodeRuleProvider implements RuleProvider<EmploymentTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public EmploymentTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmploymentTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
