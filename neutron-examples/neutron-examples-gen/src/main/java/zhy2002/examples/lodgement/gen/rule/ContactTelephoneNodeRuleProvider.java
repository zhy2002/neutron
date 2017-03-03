package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ContactTelephoneNode;


@ContactTelephoneNodeScope
public class ContactTelephoneNodeRuleProvider
    extends TelephoneNodeRuleProvider<ContactTelephoneNode> {

    @Inject
    public ContactTelephoneNodeRuleProvider() {}

    @Override
    public void initializeState(ContactTelephoneNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
