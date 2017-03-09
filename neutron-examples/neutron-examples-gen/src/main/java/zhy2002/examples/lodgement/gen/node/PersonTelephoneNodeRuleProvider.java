package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonTelephoneNodeScope
public class PersonTelephoneNodeRuleProvider implements RuleProvider<PersonTelephoneNode> {

    @Inject
    TelephoneNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonTelephoneNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
