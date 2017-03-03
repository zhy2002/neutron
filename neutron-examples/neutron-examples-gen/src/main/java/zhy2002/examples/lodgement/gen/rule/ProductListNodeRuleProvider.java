package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductListNode;


@ProductListNodeScope
public class ProductListNodeRuleProvider
    extends ListUiNodeRuleProvider<ProductListNode> {

    @Inject
    public ProductListNodeRuleProvider() {}

    @Override
    public void initializeState(ProductListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
