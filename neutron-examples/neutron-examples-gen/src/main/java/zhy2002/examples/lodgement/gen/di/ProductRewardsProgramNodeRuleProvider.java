package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductRewardsProgramNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductRewardsProgramNodeScope
public class ProductRewardsProgramNodeRuleProvider implements RuleProvider<ProductRewardsProgramNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductRewardsProgramNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductRewardsProgramNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}