package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PropertyTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@PropertyTypeNodeScope
public class PropertyTypeNodeRuleProvider implements RuleProvider<PropertyTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PropertyTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}