package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PropertyPurseNode;
import zhy2002.examples.lodgement.gen.di.*;

@PropertyPurseNodeScope
public class PropertyPurseNodeRuleProvider implements RuleProvider<PropertyPurseNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PropertyPurseNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyPurseNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
