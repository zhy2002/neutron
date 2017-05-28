package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductOptOutReasonNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductOptOutReasonNodeScope
public class ProductOptOutReasonNodeRuleProvider implements RuleProvider<ProductOptOutReasonNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductOptOutReasonNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductOptOutReasonNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
