package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.Product100PercentOffsetFlagNode;


@Product100PercentOffsetFlagNodeScope
public class Product100PercentOffsetFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<Product100PercentOffsetFlagNode> {

    @Inject
    public Product100PercentOffsetFlagNodeRuleProvider() {}

    @Override
    public void initializeState(Product100PercentOffsetFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
