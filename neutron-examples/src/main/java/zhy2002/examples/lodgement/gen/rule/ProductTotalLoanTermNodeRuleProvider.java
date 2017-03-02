package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductTotalLoanTermNode;


@ProductTotalLoanTermNodeScope
public class ProductTotalLoanTermNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<ProductTotalLoanTermNode> {

    @Inject
    public ProductTotalLoanTermNodeRuleProvider() {}

    @Override
    public void initializeState(ProductTotalLoanTermNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
