package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonOtherIncomeDescriptionNode;


@PersonOtherIncomeDescriptionNodeScope
public class PersonOtherIncomeDescriptionNodeRuleProvider
    extends StringUiNodeRuleProvider<PersonOtherIncomeDescriptionNode> {

    @Inject
    public PersonOtherIncomeDescriptionNodeRuleProvider() {}

    @Override
    public void initializeState(PersonOtherIncomeDescriptionNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
