package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductTotalLoanAmountNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductTotalLoanAmountNodeScope
public class ProductTotalLoanAmountNodeRuleProvider implements RuleProvider<ProductTotalLoanAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductTotalLoanAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductTotalLoanAmountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
