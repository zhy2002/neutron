package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductCustomerContributionNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductCustomerContributionNodeScope
public class ProductCustomerContributionNodeRuleProvider implements RuleProvider<ProductCustomerContributionNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductCustomerContributionNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductCustomerContributionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
