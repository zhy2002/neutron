package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@EmploymentEndedNodeScope
public class EmploymentEndedNodeRuleProvider extends MonthYearNodeRuleProvider {

    @Inject
    public EmploymentEndedNodeRuleProvider() {}

    @Inject
    Provider<EmploymentEndedNoEarlierThanEmploymentStartedRule> employmentEndedNoEarlierThanEmploymentStartedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(employmentEndedNoEarlierThanEmploymentStartedRuleProvider.get());
    }

}
