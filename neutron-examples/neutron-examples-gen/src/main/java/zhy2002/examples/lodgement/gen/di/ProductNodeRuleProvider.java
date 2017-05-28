package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductNode;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ProductNodeScope
public class ProductNodeRuleProvider implements RuleProvider<ProductNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductNode node) {
        parentRuleProvider.initializeState(node);

        node.setSelectedName("productDescriptionNode");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
