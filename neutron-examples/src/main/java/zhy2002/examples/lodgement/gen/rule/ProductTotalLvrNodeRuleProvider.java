package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductTotalLvrNode;


@ProductTotalLvrNodeScope
public class ProductTotalLvrNodeRuleProvider
    extends BasePercentageNodeRuleProvider<ProductTotalLvrNode> {

    @Inject
    public ProductTotalLvrNodeRuleProvider() {}

    @Override
    public void initializeState(ProductTotalLvrNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
