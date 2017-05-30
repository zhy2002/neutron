package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PropertyNode;
import zhy2002.examples.lodgement.gen.di.*;

@PropertyNodeScope
public class PropertyNodeRuleProvider implements RuleProvider<PropertyNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PropertyNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
