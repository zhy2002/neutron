package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PropertyAddressNode;


@PropertyAddressNodeScope
public class PropertyAddressNodeRuleProvider
    extends AddressNodeRuleProvider<PropertyAddressNode> {

    @Inject
    public PropertyAddressNodeRuleProvider() {}

    @Override
    public void initializeState(PropertyAddressNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}