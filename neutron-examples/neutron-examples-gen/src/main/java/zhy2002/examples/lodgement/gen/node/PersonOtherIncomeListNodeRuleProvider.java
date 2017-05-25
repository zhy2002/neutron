package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@PersonOtherIncomeListNodeScope
public class PersonOtherIncomeListNodeRuleProvider implements RuleProvider<PersonOtherIncomeListNode> {

    @Inject
    BaseOtherIncomeListNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonOtherIncomeListNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonOtherIncomeListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
