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

@FeeAmountNodeScope
public class FeeAmountNodeRuleProvider implements RuleProvider<FeeAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public FeeAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(FeeAmountNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
        node.setMinValue(new BigDecimal("0.01"));
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
