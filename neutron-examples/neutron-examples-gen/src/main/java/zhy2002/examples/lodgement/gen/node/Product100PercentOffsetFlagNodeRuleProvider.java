package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@Product100PercentOffsetFlagNodeScope
public class Product100PercentOffsetFlagNodeRuleProvider implements RuleProvider<Product100PercentOffsetFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public Product100PercentOffsetFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(Product100PercentOffsetFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
