package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductInterestOnlyTermNode;


@ProductInterestOnlyTermNodeScope
public class ProductInterestOnlyTermNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<ProductInterestOnlyTermNode> {

    @Inject
    public ProductInterestOnlyTermNodeRuleProvider() {}

    @Override
    public void initializeState(ProductInterestOnlyTermNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
