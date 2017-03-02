package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductTotalLoanLmiAmountNode;


@ProductTotalLoanLmiAmountNodeScope
public class ProductTotalLoanLmiAmountNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<ProductTotalLoanLmiAmountNode> {

    @Inject
    public ProductTotalLoanLmiAmountNodeRuleProvider() {}

    @Override
    public void initializeState(ProductTotalLoanLmiAmountNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
