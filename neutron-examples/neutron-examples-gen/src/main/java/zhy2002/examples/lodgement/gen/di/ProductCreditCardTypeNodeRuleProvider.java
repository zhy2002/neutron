package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductCreditCardTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductCreditCardTypeNodeScope
public class ProductCreditCardTypeNodeRuleProvider implements RuleProvider<ProductCreditCardTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductCreditCardTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductCreditCardTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}