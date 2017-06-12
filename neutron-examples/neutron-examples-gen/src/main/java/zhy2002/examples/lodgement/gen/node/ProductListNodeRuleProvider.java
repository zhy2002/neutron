package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.ProductListNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ComponentScope
public class ProductListNodeRuleProvider implements RuleProvider<ProductListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductListNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<SetContentNodeToNewItemRule> setContentNodeToNewItemRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        SetContentNodeToNewItemRule setContentNodeToNewItemRule = setContentNodeToNewItemRuleProvider.get();
        createdRules.add(setContentNodeToNewItemRule);
    }

}
