package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.anz.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class AnzSelectRelatedPersonListNodeRuleProvider extends SelectRelatedPersonListNodeRuleProvider {

    @Inject
    public AnzSelectRelatedPersonListNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelectRelatedPersonListNode<?> node) {
        super.initializeState(node);

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
        super.createRules(createdRules);

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
