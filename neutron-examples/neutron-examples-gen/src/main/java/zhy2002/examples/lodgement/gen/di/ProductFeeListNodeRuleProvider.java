package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductFeeListNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductFeeListNodeScope
public class ProductFeeListNodeRuleProvider implements RuleProvider<ProductFeeListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductFeeListNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductFeeListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
