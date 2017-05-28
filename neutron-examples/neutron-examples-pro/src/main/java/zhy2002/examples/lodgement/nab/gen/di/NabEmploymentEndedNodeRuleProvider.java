package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.nab.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@EmploymentEndedNodeScope
public class NabEmploymentEndedNodeRuleProvider extends EmploymentEndedNodeRuleProvider {

    @Inject
    public NabEmploymentEndedNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmploymentEndedNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Inject
    Provider<EmploymentEndedNoEarlierThanEmploymentStartedRule> employmentEndedNoEarlierThanEmploymentStartedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        EmploymentEndedNoEarlierThanEmploymentStartedRule employmentEndedNoEarlierThanEmploymentStartedRule = employmentEndedNoEarlierThanEmploymentStartedRuleProvider.get();
        createdRules.add(employmentEndedNoEarlierThanEmploymentStartedRule);
    }

}
