package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.EmploymentEndedNode;
import zhy2002.examples.lodgement.gen.di.*;

@EmploymentEndedNodeScope
public class EmploymentEndedNodeRuleProvider implements RuleProvider<EmploymentEndedNode> {

    @Inject
    MonthYearNodeRuleProvider parentRuleProvider;

    @Inject
    public EmploymentEndedNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmploymentEndedNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
