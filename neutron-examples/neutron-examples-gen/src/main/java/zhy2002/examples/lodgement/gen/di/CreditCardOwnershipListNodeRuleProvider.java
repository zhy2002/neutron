package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CreditCardOwnershipListNode;
import zhy2002.examples.lodgement.gen.di.*;

@CreditCardOwnershipListNodeScope
public class CreditCardOwnershipListNodeRuleProvider implements RuleProvider<CreditCardOwnershipListNode> {

    @Inject
    OwnershipListNodeRuleProvider parentRuleProvider;

    @Inject
    public CreditCardOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardOwnershipListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
