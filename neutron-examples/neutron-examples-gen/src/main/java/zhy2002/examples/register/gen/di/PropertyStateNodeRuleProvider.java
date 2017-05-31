package zhy2002.examples.register.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.PropertyStateNode;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@ComponentScope
public class PropertyStateNodeRuleProvider implements RuleProvider<PropertyStateNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PropertyStateNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyStateNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
        node.setRequiredMessage("Property state is required.");
        node.setOptions(RegisterNodeConstants.STATES);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
