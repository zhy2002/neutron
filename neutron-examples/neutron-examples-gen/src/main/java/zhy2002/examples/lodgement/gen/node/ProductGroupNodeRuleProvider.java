package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ProductGroupNodeScope
public class ProductGroupNodeRuleProvider implements RuleProvider<ProductGroupNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductGroupNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductGroupNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.NAB_PRODUCT_GROUP);
    }

    @Inject
    Provider<ProductGroupChangedRule> productGroupChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        ProductGroupChangedRule productGroupChangedRule = productGroupChangedRuleProvider.get();
        createdRules.add(productGroupChangedRule);
    }

}
