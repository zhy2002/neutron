package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class AnzBaseCurrencyNodeRuleProvider extends BaseCurrencyNodeRuleProvider {

    @Inject
    public AnzBaseCurrencyNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseCurrencyNode<?> node) {
        super.initializeState(node);

        node.setMinValue(new BigDecimal("0.01"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
