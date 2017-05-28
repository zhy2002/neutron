package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductInterestOnlyTermNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductInterestOnlyTermNodeScope
public class ProductInterestOnlyTermNodeRuleProvider implements RuleProvider<ProductInterestOnlyTermNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductInterestOnlyTermNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductInterestOnlyTermNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
