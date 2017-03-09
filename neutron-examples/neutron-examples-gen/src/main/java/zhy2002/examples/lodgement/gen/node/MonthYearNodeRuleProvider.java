package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;


public class MonthYearNodeRuleProvider implements RuleProvider<MonthYearNode<?>> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MonthYearNodeRuleProvider() {
    }

    @Override
    public void initializeState(MonthYearNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(monthYearNotInFutureRuleProvider.get());
    }

}
