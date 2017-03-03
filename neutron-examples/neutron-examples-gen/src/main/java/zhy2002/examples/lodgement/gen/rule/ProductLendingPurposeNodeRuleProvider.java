package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductLendingPurposeNode;


@ProductLendingPurposeNodeScope
public class ProductLendingPurposeNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductLendingPurposeNode> {

    @Inject
    public ProductLendingPurposeNodeRuleProvider() {}

    @Override
    public void initializeState(ProductLendingPurposeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
