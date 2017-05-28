package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductCostRecuctionFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductCostRecuctionFlagNodeScope
public class ProductCostRecuctionFlagNodeRuleProvider implements RuleProvider<ProductCostRecuctionFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductCostRecuctionFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductCostRecuctionFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
