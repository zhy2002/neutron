package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.PropertyDetailsNode;


@PropertyDetailsNodeScope
public class PropertyDetailsNodeRuleProvider
    extends ObjectUiNodeRuleProvider<PropertyDetailsNode> {

    @Inject
    public PropertyDetailsNodeRuleProvider() {}

    @Override
    public void initializeState(PropertyDetailsNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
