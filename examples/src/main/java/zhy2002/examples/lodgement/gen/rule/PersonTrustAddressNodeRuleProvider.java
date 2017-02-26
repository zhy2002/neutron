package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonTrustAddressNode;


@PersonTrustAddressNodeScope
public class PersonTrustAddressNodeRuleProvider
    extends AddressNodeRuleProvider<PersonTrustAddressNode> {

    @Inject
    public PersonTrustAddressNodeRuleProvider() {}

    @Override
    public void initializeState(PersonTrustAddressNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
