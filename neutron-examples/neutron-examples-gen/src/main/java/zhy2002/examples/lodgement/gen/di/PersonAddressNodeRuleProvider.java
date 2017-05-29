package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PersonAddressNode;
import zhy2002.examples.lodgement.gen.di.*;

@PersonAddressNodeScope
public class PersonAddressNodeRuleProvider implements RuleProvider<PersonAddressNode> {

    @Inject
    AddressNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonAddressNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}