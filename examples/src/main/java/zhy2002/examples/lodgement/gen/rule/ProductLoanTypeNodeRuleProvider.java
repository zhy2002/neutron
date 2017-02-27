package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductLoanTypeNode;


@ProductLoanTypeNodeScope
public class ProductLoanTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductLoanTypeNode> {

    @Inject
    public ProductLoanTypeNodeRuleProvider() {}

    @Override
    public void initializeState(ProductLoanTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
