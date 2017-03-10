package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@PropertyStateNodeScope
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
        node.setOptions(RegisterNodeConstants.STATES.toArray());
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
