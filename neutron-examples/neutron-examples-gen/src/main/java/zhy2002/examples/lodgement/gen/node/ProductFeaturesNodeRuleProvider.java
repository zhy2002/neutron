package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.ProductFeaturesNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class ProductFeaturesNodeRuleProvider implements RuleProvider<ProductFeaturesNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductFeaturesNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductFeaturesNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
