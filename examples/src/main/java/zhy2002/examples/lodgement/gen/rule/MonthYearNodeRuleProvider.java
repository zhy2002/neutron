package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class MonthYearNodeRuleProvider implements RuleProvider<MonthYearNode<?>> {

    @Inject
    public MonthYearNodeRuleProvider() {}

    @Inject
    MembersInjector<MonthYearNotInFutureRule> monthYearNotInFutureRuleInjector;

    @Override
    public List<UiNodeRule<MonthYearNode<?>>> createRules(MonthYearNode<?> node) {
        List<UiNodeRule<MonthYearNode<?>>> rules = new ArrayList<>();
        rules.add(createMonthYearNotInFutureRule(node));
        return rules;
    }

    private MonthYearNotInFutureRule createMonthYearNotInFutureRule(MonthYearNode<?> node) {
        MonthYearNotInFutureRule rule = newMonthYearNotInFutureRule(node);
        monthYearNotInFutureRuleInjector.injectMembers(rule);
        return rule;
    }


    protected MonthYearNotInFutureRule newMonthYearNotInFutureRule(MonthYearNode<?> node) {
        return new MonthYearNotInFutureRuleImpl(node);
    }
}
