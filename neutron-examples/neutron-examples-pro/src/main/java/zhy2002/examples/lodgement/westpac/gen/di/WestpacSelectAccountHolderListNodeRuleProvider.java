package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.westpac.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class WestpacSelectAccountHolderListNodeRuleProvider extends SelectAccountHolderListNodeRuleProvider {

    @Inject
    public WestpacSelectAccountHolderListNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelectAccountHolderListNode<?> node) {
        super.initializeState(node);

    }

    @Inject
    Provider<AddExistingHoldersRule> addExistingHoldersRuleProvider;
    @Inject
    Provider<AddNewPersonHolderRule> addNewPersonHolderRuleProvider;
    @Inject
    Provider<AddNewCompanyHolderRule> addNewCompanyHolderRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        AddExistingHoldersRule addExistingHoldersRule = addExistingHoldersRuleProvider.get();
        createdRules.add(addExistingHoldersRule);
        AddNewPersonHolderRule addNewPersonHolderRule = addNewPersonHolderRuleProvider.get();
        createdRules.add(addNewPersonHolderRule);
        AddNewCompanyHolderRule addNewCompanyHolderRule = addNewCompanyHolderRuleProvider.get();
        createdRules.add(addNewCompanyHolderRule);
    }

}
