package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

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
