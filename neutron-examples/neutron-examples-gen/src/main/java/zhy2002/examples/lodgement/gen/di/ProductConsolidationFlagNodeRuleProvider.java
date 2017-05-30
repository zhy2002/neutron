package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductConsolidationFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductConsolidationFlagNodeScope
public class ProductConsolidationFlagNodeRuleProvider implements RuleProvider<ProductConsolidationFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductConsolidationFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductConsolidationFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
