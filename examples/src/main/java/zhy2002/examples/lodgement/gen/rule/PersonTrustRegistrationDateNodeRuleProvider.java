package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonTrustRegistrationDateNode;


@PersonTrustRegistrationDateNodeScope
public class PersonTrustRegistrationDateNodeRuleProvider
    extends StringUiNodeRuleProvider<PersonTrustRegistrationDateNode> {

    @Inject
    public PersonTrustRegistrationDateNodeRuleProvider() {}

    @Override
    public void initializeState(PersonTrustRegistrationDateNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
