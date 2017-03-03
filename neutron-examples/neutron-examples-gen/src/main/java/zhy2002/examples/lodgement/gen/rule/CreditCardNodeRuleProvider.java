package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CreditCardNode;


@CreditCardNodeScope
public class CreditCardNodeRuleProvider
    extends ObjectUiNodeRuleProvider<CreditCardNode> {

    @Inject
    public CreditCardNodeRuleProvider() {}

    @Override
    public void initializeState(CreditCardNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
