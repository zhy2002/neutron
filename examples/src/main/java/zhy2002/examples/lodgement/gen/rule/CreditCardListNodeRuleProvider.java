package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CreditCardListNode;


@CreditCardListNodeScope
public class CreditCardListNodeRuleProvider
    extends ListUiNodeRuleProvider<CreditCardListNode> {

    @Inject
    public CreditCardListNodeRuleProvider() {}

    @Override
    public void initializeState(CreditCardListNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
