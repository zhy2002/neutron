package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PersonListNode;
import zhy2002.examples.lodgement.gen.di.*;

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

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
