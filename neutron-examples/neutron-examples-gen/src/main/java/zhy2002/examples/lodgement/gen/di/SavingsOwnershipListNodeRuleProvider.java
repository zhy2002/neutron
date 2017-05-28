package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SavingsOwnershipListNode;
import zhy2002.examples.lodgement.gen.di.*;

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

    }

}
