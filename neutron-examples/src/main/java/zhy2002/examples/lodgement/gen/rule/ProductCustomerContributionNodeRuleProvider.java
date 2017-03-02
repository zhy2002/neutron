package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductCustomerContributionNode;


@ProductCustomerContributionNodeScope
public class ProductCustomerContributionNodeRuleProvider
    extends ObjectUiNodeRuleProvider<ProductCustomerContributionNode> {

    @Inject
    public ProductCustomerContributionNodeRuleProvider() {}

    @Override
    public void initializeState(ProductCustomerContributionNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
