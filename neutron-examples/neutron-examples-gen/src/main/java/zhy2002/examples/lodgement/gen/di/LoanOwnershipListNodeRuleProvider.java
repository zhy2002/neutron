package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LoanOwnershipListNode;
import zhy2002.examples.lodgement.gen.di.*;

@LoanOwnershipListNodeScope
public class LoanOwnershipListNodeRuleProvider implements RuleProvider<LoanOwnershipListNode> {

    @Inject
    OwnershipListNodeRuleProvider parentRuleProvider;

    @Inject
    public LoanOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanOwnershipListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}