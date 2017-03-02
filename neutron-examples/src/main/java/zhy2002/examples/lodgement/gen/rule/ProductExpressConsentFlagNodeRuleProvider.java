package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductExpressConsentFlagNode;


@ProductExpressConsentFlagNodeScope
public class ProductExpressConsentFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<ProductExpressConsentFlagNode> {

    @Inject
    public ProductExpressConsentFlagNodeRuleProvider() {}

    @Override
    public void initializeState(ProductExpressConsentFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
