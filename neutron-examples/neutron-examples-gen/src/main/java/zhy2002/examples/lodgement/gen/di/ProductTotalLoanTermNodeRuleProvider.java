package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductTotalLoanTermNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductTotalLoanTermNodeScope
public class ProductTotalLoanTermNodeRuleProvider implements RuleProvider<ProductTotalLoanTermNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductTotalLoanTermNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductTotalLoanTermNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
