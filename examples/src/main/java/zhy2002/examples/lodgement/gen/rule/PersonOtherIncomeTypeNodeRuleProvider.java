package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class PersonOtherIncomeTypeNodeRuleProvider implements RuleProvider<PersonOtherIncomeTypeNode> {

    @Inject
    public PersonOtherIncomeTypeNodeRuleProvider() {}

    @Inject
    MembersInjector<PersonOtherIncomeTypeChangeRule> personOtherIncomeTypeChangeRuleInjector;

    @Override
    public List<UiNodeRule<PersonOtherIncomeTypeNode>> createRules(PersonOtherIncomeTypeNode node) {
        List<UiNodeRule<PersonOtherIncomeTypeNode>> rules = new ArrayList<>();
        rules.add(createPersonOtherIncomeTypeChangeRule(node));
        return rules;
    }

    private PersonOtherIncomeTypeChangeRule createPersonOtherIncomeTypeChangeRule(PersonOtherIncomeTypeNode node) {
        PersonOtherIncomeTypeChangeRule rule = newPersonOtherIncomeTypeChangeRule(node);
        personOtherIncomeTypeChangeRuleInjector.injectMembers(rule);
        return rule;
    }


    protected PersonOtherIncomeTypeChangeRule newPersonOtherIncomeTypeChangeRule(PersonOtherIncomeTypeNode node) {
        return new PersonOtherIncomeTypeChangeRuleImpl(node);
    }
}
