package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonOtherIncomeTypeNode;


@PersonOtherIncomeTypeNodeScope
public class PersonOtherIncomeTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<PersonOtherIncomeTypeNode> {

    @Inject
    public PersonOtherIncomeTypeNodeRuleProvider() {}

    @Override
    public void initializeState(PersonOtherIncomeTypeNode node) {
    }


    @Inject
    Provider<PersonOtherIncomeTypeChangeRule> personOtherIncomeTypeChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(personOtherIncomeTypeChangeRuleProvider.get());
    }

}
