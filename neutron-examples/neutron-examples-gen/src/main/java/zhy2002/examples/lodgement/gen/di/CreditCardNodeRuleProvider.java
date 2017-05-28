package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CreditCardNode;
import zhy2002.examples.lodgement.gen.di.*;

@CreditCardNodeScope
public class CreditCardNodeRuleProvider implements RuleProvider<CreditCardNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CreditCardNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
