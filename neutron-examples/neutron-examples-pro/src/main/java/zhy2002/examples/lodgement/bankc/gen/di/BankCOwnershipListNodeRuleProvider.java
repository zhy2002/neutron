package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class BankCOwnershipListNodeRuleProvider extends OwnershipListNodeRuleProvider {

    @Inject
    public BankCOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(OwnershipListNode<?> node) {
        super.initializeState(node);

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
        super.createRules(createdRules);

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
