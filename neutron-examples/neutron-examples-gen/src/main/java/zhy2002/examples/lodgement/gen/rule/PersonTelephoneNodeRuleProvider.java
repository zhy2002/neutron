package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonTelephoneNode;


@PersonTelephoneNodeScope
public class PersonTelephoneNodeRuleProvider
    extends TelephoneNodeRuleProvider<PersonTelephoneNode> {

    @Inject
    public PersonTelephoneNodeRuleProvider() {}

    @Override
    public void initializeState(PersonTelephoneNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
