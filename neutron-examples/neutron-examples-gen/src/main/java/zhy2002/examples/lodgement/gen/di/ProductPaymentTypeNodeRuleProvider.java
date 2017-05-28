package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductPaymentTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductPaymentTypeNodeScope
public class ProductPaymentTypeNodeRuleProvider implements RuleProvider<ProductPaymentTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductPaymentTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductPaymentTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
