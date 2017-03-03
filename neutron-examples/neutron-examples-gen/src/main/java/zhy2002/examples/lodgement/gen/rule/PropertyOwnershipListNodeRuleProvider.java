package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PropertyOwnershipListNode;


@PropertyOwnershipListNodeScope
public class PropertyOwnershipListNodeRuleProvider
    extends OwnershipListNodeRuleProvider<PropertyOwnershipListNode> {

    @Inject
    public PropertyOwnershipListNodeRuleProvider() {}

    @Override
    public void initializeState(PropertyOwnershipListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
