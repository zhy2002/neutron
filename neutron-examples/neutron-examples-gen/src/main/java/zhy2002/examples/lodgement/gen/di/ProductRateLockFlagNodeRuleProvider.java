package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductRateLockFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductRateLockFlagNodeScope
public class ProductRateLockFlagNodeRuleProvider implements RuleProvider<ProductRateLockFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductRateLockFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductRateLockFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
