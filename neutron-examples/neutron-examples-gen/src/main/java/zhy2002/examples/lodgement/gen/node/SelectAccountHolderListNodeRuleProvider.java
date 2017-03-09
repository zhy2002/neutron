package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;


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


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
