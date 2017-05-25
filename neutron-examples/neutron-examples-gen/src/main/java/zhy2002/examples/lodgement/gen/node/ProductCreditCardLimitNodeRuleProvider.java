package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@ProductCreditCardLimitNodeScope
public class ProductCreditCardLimitNodeRuleProvider implements RuleProvider<ProductCreditCardLimitNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductCreditCardLimitNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductCreditCardLimitNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
