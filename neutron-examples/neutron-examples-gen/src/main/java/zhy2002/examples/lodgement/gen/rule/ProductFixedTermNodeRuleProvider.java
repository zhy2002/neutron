package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductFixedTermNode;


@ProductFixedTermNodeScope
public class ProductFixedTermNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<ProductFixedTermNode> {

    @Inject
    public ProductFixedTermNodeRuleProvider() {}

    @Override
    public void initializeState(ProductFixedTermNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
