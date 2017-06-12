package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderListNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SelectAccountHolderListNodeRuleProvider implements RuleProvider<SelectAccountHolderListNode<?>> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SelectAccountHolderListNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelectAccountHolderListNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<MaintainDisabledAncestorCountRule> maintainDisabledAncestorCountRuleProvider;
    @Inject
    Provider<AddExistingHoldersRule> addExistingHoldersRuleProvider;
    @Inject
    Provider<AddNewPersonHolderRule> addNewPersonHolderRuleProvider;
    @Inject
    Provider<AddNewCompanyHolderRule> addNewCompanyHolderRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        MaintainDisabledAncestorCountRule maintainDisabledAncestorCountRule = maintainDisabledAncestorCountRuleProvider.get();
        createdRules.add(maintainDisabledAncestorCountRule);
        AddExistingHoldersRule addExistingHoldersRule = addExistingHoldersRuleProvider.get();
        createdRules.add(addExistingHoldersRule);
        AddNewPersonHolderRule addNewPersonHolderRule = addNewPersonHolderRuleProvider.get();
        createdRules.add(addNewPersonHolderRule);
        AddNewCompanyHolderRule addNewCompanyHolderRule = addNewCompanyHolderRuleProvider.get();
        createdRules.add(addNewCompanyHolderRule);
    }

}
