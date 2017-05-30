package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductCreditCardFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductCreditCardFlagNodeScope
public class ProductCreditCardFlagNodeRuleProvider implements RuleProvider<ProductCreditCardFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductCreditCardFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductCreditCardFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
