package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductTotalLoanAmountNode;


@ProductTotalLoanAmountNodeScope
public class ProductTotalLoanAmountNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<ProductTotalLoanAmountNode> {

    @Inject
    public ProductTotalLoanAmountNodeRuleProvider() {}

    @Override
    public void initializeState(ProductTotalLoanAmountNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
