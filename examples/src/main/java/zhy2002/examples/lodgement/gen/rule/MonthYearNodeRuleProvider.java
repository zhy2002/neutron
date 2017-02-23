package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;


public abstract class MonthYearNodeRuleProvider extends ObjectUiNodeRuleProvider {


    @Inject
    Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(monthYearNotInFutureRuleProvider.get());
    }

}
