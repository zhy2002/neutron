package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@MonthNodeScope
public class MonthNodeRuleProvider implements RuleProvider<MonthNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public MonthNodeRuleProvider() {
    }

    @Override
    public void initializeState(MonthNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.MONTH_TYPE);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
