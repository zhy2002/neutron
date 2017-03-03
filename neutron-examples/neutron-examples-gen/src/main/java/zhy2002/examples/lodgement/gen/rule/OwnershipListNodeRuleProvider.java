package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;



public abstract class OwnershipListNodeRuleProvider<N extends OwnershipListNode<?>>
    extends ListUiNodeRuleProvider <N> {


    @Inject
    Provider<AddExistingApplicantsRule> addExistingApplicantsRuleProvider;
    @Inject
    Provider<AddNewPersonApplicantRule> addNewPersonApplicantRuleProvider;
    @Inject
    Provider<AddNewCompanyApplicantRule> addNewCompanyApplicantRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(addExistingApplicantsRuleProvider.get());
            createdRules.add(addNewPersonApplicantRuleProvider.get());
            createdRules.add(addNewCompanyApplicantRuleProvider.get());
    }

}
