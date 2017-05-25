package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@ProductExpressConsentFlagNodeScope
public class ProductExpressConsentFlagNodeRuleProvider implements RuleProvider<ProductExpressConsentFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductExpressConsentFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductExpressConsentFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
