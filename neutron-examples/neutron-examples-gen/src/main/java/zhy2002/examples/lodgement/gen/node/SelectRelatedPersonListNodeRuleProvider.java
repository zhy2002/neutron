package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonListNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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
