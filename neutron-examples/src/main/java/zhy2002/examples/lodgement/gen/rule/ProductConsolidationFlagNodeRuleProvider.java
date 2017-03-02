package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductConsolidationFlagNode;


@ProductConsolidationFlagNodeScope
public class ProductConsolidationFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<ProductConsolidationFlagNode> {

    @Inject
    public ProductConsolidationFlagNodeRuleProvider() {}

    @Override
    public void initializeState(ProductConsolidationFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
