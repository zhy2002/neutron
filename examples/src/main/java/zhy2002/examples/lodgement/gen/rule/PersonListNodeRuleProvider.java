package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonListNode;


@PersonListNodeScope
public class PersonListNodeRuleProvider
    extends ListUiNodeRuleProvider<PersonListNode> {

    @Inject
    public PersonListNodeRuleProvider() {}

    @Override
    public void initializeState(PersonListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
