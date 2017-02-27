package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductConstructionApplicationFlagNode;


@ProductConstructionApplicationFlagNodeScope
public class ProductConstructionApplicationFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<ProductConstructionApplicationFlagNode> {

    @Inject
    public ProductConstructionApplicationFlagNodeRuleProvider() {}

    @Override
    public void initializeState(ProductConstructionApplicationFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
