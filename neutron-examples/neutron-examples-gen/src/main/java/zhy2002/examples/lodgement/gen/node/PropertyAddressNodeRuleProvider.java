package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PropertyAddressNodeScope
public class PropertyAddressNodeRuleProvider implements RuleProvider<PropertyAddressNode> {

    @Inject
    AddressNodeRuleProvider parentRuleProvider;

    @Inject
    public PropertyAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(PropertyAddressNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
