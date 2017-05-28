package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductLendingPurposeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductLendingPurposeNodeScope
public class ProductLendingPurposeNodeRuleProvider implements RuleProvider<ProductLendingPurposeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductLendingPurposeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductLendingPurposeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
