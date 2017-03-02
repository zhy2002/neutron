package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PropertyPurseNode;


@PropertyPurseNodeScope
public class PropertyPurseNodeRuleProvider
    extends BooleanUiNodeRuleProvider<PropertyPurseNode> {

    @Inject
    public PropertyPurseNodeRuleProvider() {}

    @Override
    public void initializeState(PropertyPurseNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
