package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductFixedTermNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductFixedTermNodeScope
public class ProductFixedTermNodeRuleProvider implements RuleProvider<ProductFixedTermNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductFixedTermNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductFixedTermNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
