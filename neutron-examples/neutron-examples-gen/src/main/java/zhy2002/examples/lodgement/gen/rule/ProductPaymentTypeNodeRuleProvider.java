package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductPaymentTypeNode;


@ProductPaymentTypeNodeScope
public class ProductPaymentTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductPaymentTypeNode> {

    @Inject
    public ProductPaymentTypeNodeRuleProvider() {}

    @Override
    public void initializeState(ProductPaymentTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}