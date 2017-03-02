package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductsNode;


@ProductsNodeScope
public class ProductsNodeRuleProvider
    extends ObjectUiNodeRuleProvider<ProductsNode> {

    @Inject
    public ProductsNodeRuleProvider() {}

    @Override
    public void initializeState(ProductsNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
