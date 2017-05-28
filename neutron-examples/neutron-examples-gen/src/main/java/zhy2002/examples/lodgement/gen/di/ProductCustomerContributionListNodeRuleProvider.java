package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductCustomerContributionListNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductCustomerContributionListNodeScope
public class ProductCustomerContributionListNodeRuleProvider implements RuleProvider<ProductCustomerContributionListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductCustomerContributionListNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductCustomerContributionListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
