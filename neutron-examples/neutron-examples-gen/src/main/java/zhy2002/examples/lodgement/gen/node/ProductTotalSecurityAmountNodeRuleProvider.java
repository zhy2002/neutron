package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@ProductTotalSecurityAmountNodeScope
public class ProductTotalSecurityAmountNodeRuleProvider implements RuleProvider<ProductTotalSecurityAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductTotalSecurityAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductTotalSecurityAmountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
