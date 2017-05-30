package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductFeeNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductFeeNodeScope
public class ProductFeeNodeRuleProvider implements RuleProvider<ProductFeeNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductFeeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductFeeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
