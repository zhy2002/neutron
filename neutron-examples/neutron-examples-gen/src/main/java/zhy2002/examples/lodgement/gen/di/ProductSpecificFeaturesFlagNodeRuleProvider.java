package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductSpecificFeaturesFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductSpecificFeaturesFlagNodeScope
public class ProductSpecificFeaturesFlagNodeRuleProvider implements RuleProvider<ProductSpecificFeaturesFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductSpecificFeaturesFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductSpecificFeaturesFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
