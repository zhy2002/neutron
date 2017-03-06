package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


public class BaseCurrencyNodeRuleProvider implements RuleProvider<BaseCurrencyNode<?>> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseCurrencyNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseCurrencyNode<?> node) {
        parentRuleProvider.initializeState(node);

        node.setMinValue(new BigDecimal("0.01"));
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
