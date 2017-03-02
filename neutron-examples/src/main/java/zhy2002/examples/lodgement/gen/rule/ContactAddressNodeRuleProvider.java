package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ContactAddressNode;


@ContactAddressNodeScope
public class ContactAddressNodeRuleProvider
    extends AddressNodeRuleProvider<ContactAddressNode> {

    @Inject
    public ContactAddressNodeRuleProvider() {}

    @Override
    public void initializeState(ContactAddressNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
