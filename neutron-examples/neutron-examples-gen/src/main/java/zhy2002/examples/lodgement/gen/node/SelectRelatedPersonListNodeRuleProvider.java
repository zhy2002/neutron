package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;


public class SelectRelatedPersonListNodeRuleProvider implements RuleProvider<SelectRelatedPersonListNode<?>> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SelectRelatedPersonListNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelectRelatedPersonListNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<AddExistingPeopleRule> addExistingPeopleRuleProvider;
    @Inject
    Provider<AddNewPersonRule> addNewPersonRuleProvider;
    @Inject
    Provider<AddNewThirdPartyApplicantRule> addNewThirdPartyApplicantRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
            createdRules.add(addExistingPeopleRuleProvider.get());
            createdRules.add(addNewPersonRuleProvider.get());
            createdRules.add(addNewThirdPartyApplicantRuleProvider.get());
    }

}
