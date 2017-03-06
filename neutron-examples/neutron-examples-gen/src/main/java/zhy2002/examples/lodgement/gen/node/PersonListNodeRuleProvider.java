package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@PersonListNodeScope
public class PersonListNodeRuleProvider implements RuleProvider<PersonListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonListNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonListNode node) {
        parentRuleProvider.initializeState(node);

        node.setSelectedIndex(0);
        node.setNodeLabel("Person Applicant");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
