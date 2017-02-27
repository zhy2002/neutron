package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductCardHolderNode;


@ProductCardHolderNodeScope
public class ProductCardHolderNodeRuleProvider
    extends ObjectUiNodeRuleProvider<ProductCardHolderNode> {

    @Inject
    public ProductCardHolderNodeRuleProvider() {}

    @Override
    public void initializeState(ProductCardHolderNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
