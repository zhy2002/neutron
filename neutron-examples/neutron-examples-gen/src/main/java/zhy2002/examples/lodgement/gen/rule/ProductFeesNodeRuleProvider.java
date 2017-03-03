package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductFeesNode;


@ProductFeesNodeScope
public class ProductFeesNodeRuleProvider
    extends ObjectUiNodeRuleProvider<ProductFeesNode> {

    @Inject
    public ProductFeesNodeRuleProvider() {}

    @Override
    public void initializeState(ProductFeesNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
