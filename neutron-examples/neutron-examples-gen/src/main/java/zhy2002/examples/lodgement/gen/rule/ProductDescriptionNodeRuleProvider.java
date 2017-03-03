package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductDescriptionNode;


@ProductDescriptionNodeScope
public class ProductDescriptionNodeRuleProvider
    extends ObjectUiNodeRuleProvider<ProductDescriptionNode> {

    @Inject
    public ProductDescriptionNodeRuleProvider() {}

    @Override
    public void initializeState(ProductDescriptionNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
