package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductTotalLvrLmiNode;


@ProductTotalLvrLmiNodeScope
public class ProductTotalLvrLmiNodeRuleProvider
    extends BasePercentageNodeRuleProvider<ProductTotalLvrLmiNode> {

    @Inject
    public ProductTotalLvrLmiNodeRuleProvider() {}

    @Override
    public void initializeState(ProductTotalLvrLmiNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
