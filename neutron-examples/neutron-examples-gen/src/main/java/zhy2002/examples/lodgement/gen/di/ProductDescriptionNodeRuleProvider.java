package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProductDescriptionNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProductDescriptionNodeScope
public class ProductDescriptionNodeRuleProvider implements RuleProvider<ProductDescriptionNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductDescriptionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
