package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductConstructionApplicationFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductConstructionApplicationFlagNodeScope
public class ProductConstructionApplicationFlagNodeRuleProvider implements RuleProvider<ProductConstructionApplicationFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductConstructionApplicationFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductConstructionApplicationFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}