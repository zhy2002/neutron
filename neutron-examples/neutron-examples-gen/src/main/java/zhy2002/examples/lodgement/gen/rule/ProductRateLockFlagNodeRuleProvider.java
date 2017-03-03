package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductRateLockFlagNode;


@ProductRateLockFlagNodeScope
public class ProductRateLockFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<ProductRateLockFlagNode> {

    @Inject
    public ProductRateLockFlagNodeRuleProvider() {}

    @Override
    public void initializeState(ProductRateLockFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
