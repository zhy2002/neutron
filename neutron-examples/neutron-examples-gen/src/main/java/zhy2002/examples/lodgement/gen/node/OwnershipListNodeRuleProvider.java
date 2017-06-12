package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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
        UpdateTotalOwnershipRule updateTotalOwnershipRule = updateTotalOwnershipRuleProvider.get();
        createdRules.add(updateTotalOwnershipRule);
        DistributePercentageRule distributePercentageRule = distributePercentageRuleProvider.get();
        createdRules.add(distributePercentageRule);
    }

}
