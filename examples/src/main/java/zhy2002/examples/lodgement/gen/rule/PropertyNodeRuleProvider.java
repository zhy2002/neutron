package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PropertyNode;


@PropertyNodeScope
public class PropertyNodeRuleProvider
    extends ObjectUiNodeRuleProvider<PropertyNode> {

    @Inject
    public PropertyNodeRuleProvider() {}

    @Override
    public void initializeState(PropertyNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
