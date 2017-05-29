package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductDissatisfactionFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductDissatisfactionFlagNodeScope
public class ProductDissatisfactionFlagNodeRuleProvider implements RuleProvider<ProductDissatisfactionFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductDissatisfactionFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductDissatisfactionFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}