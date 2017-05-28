package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductGroupNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductGroupNodeScope
public class ProductGroupNodeRuleProvider implements RuleProvider<ProductGroupNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductGroupNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductGroupNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
