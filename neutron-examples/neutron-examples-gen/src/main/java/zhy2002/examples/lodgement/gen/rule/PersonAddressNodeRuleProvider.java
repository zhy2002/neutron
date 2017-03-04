package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonAddressNode;


@PersonAddressNodeScope
public class PersonAddressNodeRuleProvider
    extends AddressNodeRuleProvider<PersonAddressNode> {

    @Inject
    public PersonAddressNodeRuleProvider() {}

    @Override
    public void initializeState(PersonAddressNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
