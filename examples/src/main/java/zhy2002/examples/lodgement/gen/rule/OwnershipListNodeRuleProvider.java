package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class OwnershipListNodeRuleProvider implements RuleProvider<OwnershipListNode<?>> {

    @Inject
    public OwnershipListNodeRuleProvider() {}

    @Inject
    MembersInjector<AddExistingApplicantsRule> addExistingApplicantsRuleInjector;
    @Inject
    MembersInjector<AddNewPersonApplicantRule> addNewPersonApplicantRuleInjector;
    @Inject
    MembersInjector<AddNewCompanyApplicantRule> addNewCompanyApplicantRuleInjector;

    @Override
    public List<UiNodeRule<OwnershipListNode<?>>> createRules(OwnershipListNode<?> node) {
        List<UiNodeRule<OwnershipListNode<?>>> rules = new ArrayList<>();
        rules.add(createAddExistingApplicantsRule(node));
        rules.add(createAddNewPersonApplicantRule(node));
        rules.add(createAddNewCompanyApplicantRule(node));
        return rules;
    }

    private AddExistingApplicantsRule createAddExistingApplicantsRule(OwnershipListNode<?> node) {
        AddExistingApplicantsRule rule = newAddExistingApplicantsRule(node);
        addExistingApplicantsRuleInjector.injectMembers(rule);
        return rule;
    }

    private AddNewPersonApplicantRule createAddNewPersonApplicantRule(OwnershipListNode<?> node) {
        AddNewPersonApplicantRule rule = newAddNewPersonApplicantRule(node);
        addNewPersonApplicantRuleInjector.injectMembers(rule);
        return rule;
    }

    private AddNewCompanyApplicantRule createAddNewCompanyApplicantRule(OwnershipListNode<?> node) {
        AddNewCompanyApplicantRule rule = newAddNewCompanyApplicantRule(node);
        addNewCompanyApplicantRuleInjector.injectMembers(rule);
        return rule;
    }


    protected AddExistingApplicantsRule newAddExistingApplicantsRule(OwnershipListNode<?> node) {
        return new AddExistingApplicantsRuleImpl(node);
    }
    protected AddNewPersonApplicantRule newAddNewPersonApplicantRule(OwnershipListNode<?> node) {
        return new AddNewPersonApplicantRuleImpl(node);
    }
    protected AddNewCompanyApplicantRule newAddNewCompanyApplicantRule(OwnershipListNode<?> node) {
        return new AddNewCompanyApplicantRuleImpl(node);
    }
}
