package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

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

        node.setRequired(true);
    }

    @Inject
    Provider<EmploymentEndedNoEarlierThanEmploymentStartedRule> employmentEndedNoEarlierThanEmploymentStartedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(employmentEndedNoEarlierThanEmploymentStartedRuleProvider.get());
    }

}
