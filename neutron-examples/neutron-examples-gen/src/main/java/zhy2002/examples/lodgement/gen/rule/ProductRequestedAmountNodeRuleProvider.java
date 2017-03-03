package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductRequestedAmountNode;


@ProductRequestedAmountNodeScope
public class ProductRequestedAmountNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<ProductRequestedAmountNode> {

    @Inject
    public ProductRequestedAmountNodeRuleProvider() {}

    @Override
    public void initializeState(ProductRequestedAmountNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
