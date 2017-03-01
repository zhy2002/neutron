package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonHomePhoneNode;


@PersonHomePhoneNodeScope
public class PersonHomePhoneNodeRuleProvider
    extends TelephoneNodeRuleProvider<PersonHomePhoneNode> {

    @Inject
    public PersonHomePhoneNodeRuleProvider() {}

    @Override
    public void initializeState(PersonHomePhoneNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}