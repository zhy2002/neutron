package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductAccountHolderListNode;


@ProductAccountHolderListNodeScope
public class ProductAccountHolderListNodeRuleProvider
    extends SelectAccountHolderListNodeRuleProvider<ProductAccountHolderListNode> {

    @Inject
    public ProductAccountHolderListNodeRuleProvider() {}

    @Override
    public void initializeState(ProductAccountHolderListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
