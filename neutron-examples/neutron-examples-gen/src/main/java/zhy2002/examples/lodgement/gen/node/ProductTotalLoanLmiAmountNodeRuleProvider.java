package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@ProductTotalLoanLmiAmountNodeScope
public class ProductTotalLoanLmiAmountNodeRuleProvider implements RuleProvider<ProductTotalLoanLmiAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductTotalLoanLmiAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductTotalLoanLmiAmountNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
