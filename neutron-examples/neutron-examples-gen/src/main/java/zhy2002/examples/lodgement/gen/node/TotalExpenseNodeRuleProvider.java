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

@TotalExpenseNodeScope
public class TotalExpenseNodeRuleProvider implements RuleProvider<TotalExpenseNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public TotalExpenseNodeRuleProvider() {
    }

    @Override
    public void initializeState(TotalExpenseNode node) {
        parentRuleProvider.initializeState(node);

        node.setMinValue(new BigDecimal("0"));
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
