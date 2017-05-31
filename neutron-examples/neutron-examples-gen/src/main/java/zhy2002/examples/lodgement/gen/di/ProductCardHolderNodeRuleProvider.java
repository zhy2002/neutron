package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.ProductCardHolderNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class ProductCardHolderNodeRuleProvider implements RuleProvider<ProductCardHolderNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductCardHolderNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductCardHolderNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
