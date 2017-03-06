package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


public class BasePercentageNodeRuleProvider implements RuleProvider<BasePercentageNode<?>> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BasePercentageNodeRuleProvider() {
    }

    @Override
    public void initializeState(BasePercentageNode<?> node) {
        parentRuleProvider.initializeState(node);

        node.setMinValue(new BigDecimal("0"));
        node.setMaxValue(new BigDecimal("100"));
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
