package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductCostRecuctionFlagNode;


@ProductCostRecuctionFlagNodeScope
public class ProductCostRecuctionFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<ProductCostRecuctionFlagNode> {

    @Inject
    public ProductCostRecuctionFlagNodeRuleProvider() {}

    @Override
    public void initializeState(ProductCostRecuctionFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
