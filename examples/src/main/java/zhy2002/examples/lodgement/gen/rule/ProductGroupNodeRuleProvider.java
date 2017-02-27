package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductGroupNode;


@ProductGroupNodeScope
public class ProductGroupNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductGroupNode> {

    @Inject
    public ProductGroupNodeRuleProvider() {}

    @Override
    public void initializeState(ProductGroupNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
