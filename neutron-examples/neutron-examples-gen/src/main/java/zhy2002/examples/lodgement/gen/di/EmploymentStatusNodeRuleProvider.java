package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.EmploymentStatusNode;
import zhy2002.examples.lodgement.gen.di.*;

@EmploymentStatusNodeScope
public class EmploymentStatusNodeRuleProvider implements RuleProvider<EmploymentStatusNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public EmploymentStatusNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmploymentStatusNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}