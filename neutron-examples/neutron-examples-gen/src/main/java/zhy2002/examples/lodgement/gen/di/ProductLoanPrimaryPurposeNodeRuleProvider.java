package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductLoanPrimaryPurposeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductLoanPrimaryPurposeNodeScope
public class ProductLoanPrimaryPurposeNodeRuleProvider implements RuleProvider<ProductLoanPrimaryPurposeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductLoanPrimaryPurposeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductLoanPrimaryPurposeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
