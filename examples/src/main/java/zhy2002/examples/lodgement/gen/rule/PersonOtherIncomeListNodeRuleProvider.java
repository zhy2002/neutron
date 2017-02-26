package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonOtherIncomeListNode;


@PersonOtherIncomeListNodeScope
public class PersonOtherIncomeListNodeRuleProvider
    extends ListUiNodeRuleProvider<PersonOtherIncomeListNode> {

    @Inject
    public PersonOtherIncomeListNodeRuleProvider() {}

    @Override
    public void initializeState(PersonOtherIncomeListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
