package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PersonOtherIncomeAmountNode;


@PersonOtherIncomeAmountNodeScope
public class PersonOtherIncomeAmountNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<PersonOtherIncomeAmountNode> {

    @Inject
    public PersonOtherIncomeAmountNodeRuleProvider() {}

    @Override
    public void initializeState(PersonOtherIncomeAmountNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
