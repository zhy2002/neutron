package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductTotalLvrNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductTotalLvrNodeScope
public class ProductTotalLvrNodeRuleProvider implements RuleProvider<ProductTotalLvrNode> {

    @Inject
    BasePercentageNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductTotalLvrNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductTotalLvrNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}