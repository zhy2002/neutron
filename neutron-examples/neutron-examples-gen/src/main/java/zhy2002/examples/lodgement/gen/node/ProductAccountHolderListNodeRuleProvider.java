package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductAccountHolderListNodeScope
public class ProductAccountHolderListNodeRuleProvider implements RuleProvider<ProductAccountHolderListNode> {

    @Inject
    SelectAccountHolderListNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductAccountHolderListNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductAccountHolderListNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
