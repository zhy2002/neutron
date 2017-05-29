package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.cba.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class CbaMonthYearNodeRuleProvider extends MonthYearNodeRuleProvider {

    @Inject
    public CbaMonthYearNodeRuleProvider() {
    }

    @Override
    public void initializeState(MonthYearNode<?> node) {
        super.initializeState(node);

    }

    @Inject
    Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider;
    @Inject
    Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        MonthYearNotInFutureRule monthYearNotInFutureRule = monthYearNotInFutureRuleProvider.get();
        createdRules.add(monthYearNotInFutureRule);
        ObjectValueRequiredValidationRule objectValueRequiredValidationRule = objectValueRequiredValidationRuleProvider.get();
        createdRules.add(objectValueRequiredValidationRule);
    }

}
