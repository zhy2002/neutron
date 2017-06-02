package zhy2002.examples.register.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.PropertyDetailsNode;
import zhy2002.examples.register.gen.di.*;

@ComponentScope
public class PropertyDetailsNodeRuleProvider implements RuleProvider<PropertyDetailsNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PropertyDetailsNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyDetailsNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
