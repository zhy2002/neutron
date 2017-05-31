package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.ProductFixedTermNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class ProductFixedTermNodeRuleProvider implements RuleProvider<ProductFixedTermNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductFixedTermNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductFixedTermNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
