package zhy2002.examples.register.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.*;

@PropertyDetailsNodeScope
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
