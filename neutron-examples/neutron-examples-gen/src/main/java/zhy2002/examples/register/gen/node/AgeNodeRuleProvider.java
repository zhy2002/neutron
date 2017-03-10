package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@AgeNodeScope
public class AgeNodeRuleProvider implements RuleProvider<AgeNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AgeNodeRuleProvider() {
    }

    @Override
    public void initializeState(AgeNode node) {
        parentRuleProvider.initializeState(node);

        node.setMinValue(new BigDecimal("0"));
        node.setMaxValue(new BigDecimal("120"));
        node.setRangeMessage("Age must be between 0 and 120.");
    }

    @Inject
    Provider<UpdatePlanRule> updatePlanRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(updatePlanRuleProvider.get());
    }

}
