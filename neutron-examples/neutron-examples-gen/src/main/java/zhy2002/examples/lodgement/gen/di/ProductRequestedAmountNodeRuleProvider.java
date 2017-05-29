package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductRequestedAmountNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductRequestedAmountNodeScope
public class ProductRequestedAmountNodeRuleProvider implements RuleProvider<ProductRequestedAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductRequestedAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductRequestedAmountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}