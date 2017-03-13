package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

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
