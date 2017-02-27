package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductOptOutReasonNode;


@ProductOptOutReasonNodeScope
public class ProductOptOutReasonNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductOptOutReasonNode> {

    @Inject
    public ProductOptOutReasonNodeRuleProvider() {}

    @Override
    public void initializeState(ProductOptOutReasonNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
