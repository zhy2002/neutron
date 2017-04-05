package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;


public class OwnershipListNodeRuleProvider implements RuleProvider<OwnershipListNode<?>> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(OwnershipListNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<AddExistingApplicantsRule> addExistingApplicantsRuleProvider;
    @Inject
    Provider<AddNewPersonApplicantRule> addNewPersonApplicantRuleProvider;
    @Inject
    Provider<AddNewCompanyApplicantRule> addNewCompanyApplicantRuleProvider;
    @Inject
    Provider<OwnershipRequiredValidationRule> ownershipRequiredValidationRuleProvider;
    @Inject
    Provider<UpdateTotalOwnershipRule> updateTotalOwnershipRuleProvider;
    @Inject
    Provider<DistributePercentageRule> distributePercentageRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        AddExistingApplicantsRule addExistingApplicantsRule = addExistingApplicantsRuleProvider.get();
        createdRules.add(addExistingApplicantsRule);
        AddNewPersonApplicantRule addNewPersonApplicantRule = addNewPersonApplicantRuleProvider.get();
        createdRules.add(addNewPersonApplicantRule);
        AddNewCompanyApplicantRule addNewCompanyApplicantRule = addNewCompanyApplicantRuleProvider.get();
        createdRules.add(addNewCompanyApplicantRule);
        OwnershipRequiredValidationRule ownershipRequiredValidationRule = ownershipRequiredValidationRuleProvider.get();
        createdRules.add(ownershipRequiredValidationRule);
        UpdateTotalOwnershipRule updateTotalOwnershipRule = updateTotalOwnershipRuleProvider.get();
        createdRules.add(updateTotalOwnershipRule);
        DistributePercentageRule distributePercentageRule = distributePercentageRuleProvider.get();
        createdRules.add(distributePercentageRule);
    }

}
