package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;

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

        //todo move source to a profile
    }

}
