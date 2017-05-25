package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@MortgageInterestOnlyRemainingPeriodNodeScope
public class MortgageInterestOnlyRemainingPeriodNodeRuleProvider implements RuleProvider<MortgageInterestOnlyRemainingPeriodNode> {

    @Inject
    MonthYearNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgageInterestOnlyRemainingPeriodNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageInterestOnlyRemainingPeriodNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
