package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CreditCardListNode;
import zhy2002.examples.lodgement.gen.di.*;

@CreditCardListNodeScope
public class CreditCardListNodeRuleProvider implements RuleProvider<CreditCardListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CreditCardListNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
