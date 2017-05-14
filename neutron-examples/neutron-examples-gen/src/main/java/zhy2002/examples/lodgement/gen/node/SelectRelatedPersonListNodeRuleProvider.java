package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


public class SelectRelatedPersonListNodeRuleProvider implements RuleProvider<SelectRelatedPersonListNode<?>> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SelectRelatedPersonListNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelectRelatedPersonListNode<?> node) {
        parentRuleProvider.initializeState(node);

        node.setKeepItemsOnReset(true);
    }

    @Inject
    Provider<AddExistingPeopleRule> addExistingPeopleRuleProvider;
    @Inject
    Provider<AddNewPersonRule> addNewPersonRuleProvider;
    @Inject
    Provider<AddNewThirdPartyApplicantRule> addNewThirdPartyApplicantRuleProvider;
    @Inject
    Provider<MaintainDisabledAncestorCountRule> maintainDisabledAncestorCountRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        AddExistingPeopleRule addExistingPeopleRule = addExistingPeopleRuleProvider.get();
        createdRules.add(addExistingPeopleRule);
        AddNewPersonRule addNewPersonRule = addNewPersonRuleProvider.get();
        createdRules.add(addNewPersonRule);
        AddNewThirdPartyApplicantRule addNewThirdPartyApplicantRule = addNewThirdPartyApplicantRuleProvider.get();
        createdRules.add(addNewThirdPartyApplicantRule);
        MaintainDisabledAncestorCountRule maintainDisabledAncestorCountRule = maintainDisabledAncestorCountRuleProvider.get();
        createdRules.add(maintainDisabledAncestorCountRule);
    }

}
