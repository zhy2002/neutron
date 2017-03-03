package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductRewardsProgramNode;


@ProductRewardsProgramNodeScope
public class ProductRewardsProgramNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductRewardsProgramNode> {

    @Inject
    public ProductRewardsProgramNodeRuleProvider() {}

    @Override
    public void initializeState(ProductRewardsProgramNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
