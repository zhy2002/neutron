package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonOtherIncomeNode;


@PersonOtherIncomeNodeScope
public class PersonOtherIncomeNodeRuleProvider
    extends ObjectUiNodeRuleProvider<PersonOtherIncomeNode> {

    @Inject
    public PersonOtherIncomeNodeRuleProvider() {}

    @Override
    public void initializeState(PersonOtherIncomeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
