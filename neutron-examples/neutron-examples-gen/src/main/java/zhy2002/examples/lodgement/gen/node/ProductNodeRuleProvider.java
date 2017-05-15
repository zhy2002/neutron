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

    @Inject
    Provider<UpdateProductNodeLabelRule> updateProductNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        UpdateProductNodeLabelRule updateProductNodeLabelRule = updateProductNodeLabelRuleProvider.get();
        createdRules.add(updateProductNodeLabelRule);
    }

}
