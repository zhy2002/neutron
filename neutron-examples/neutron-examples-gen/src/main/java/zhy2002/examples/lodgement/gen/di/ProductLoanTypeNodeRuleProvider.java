package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductLoanTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductLoanTypeNodeScope
public class ProductLoanTypeNodeRuleProvider implements RuleProvider<ProductLoanTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductLoanTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductLoanTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}