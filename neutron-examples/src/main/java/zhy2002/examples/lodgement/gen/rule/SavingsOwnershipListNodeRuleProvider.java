package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SavingsOwnershipListNode;


@SavingsOwnershipListNodeScope
public class SavingsOwnershipListNodeRuleProvider
    extends OwnershipListNodeRuleProvider<SavingsOwnershipListNode> {

    @Inject
    public SavingsOwnershipListNodeRuleProvider() {}

    @Override
    public void initializeState(SavingsOwnershipListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
