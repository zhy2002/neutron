package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SavingsOwnershipListNodeScope
public class SavingsOwnershipListNodeRuleProvider implements RuleProvider<SavingsOwnershipListNode> {

    @Inject
    OwnershipListNodeRuleProvider parentRuleProvider;

    @Inject
    public SavingsOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(SavingsOwnershipListNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
