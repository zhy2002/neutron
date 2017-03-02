package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductCardHodlerNameNode;


@ProductCardHodlerNameNodeScope
public class ProductCardHodlerNameNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductCardHodlerNameNode> {

    @Inject
    public ProductCardHodlerNameNodeRuleProvider() {}

    @Override
    public void initializeState(ProductCardHodlerNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}