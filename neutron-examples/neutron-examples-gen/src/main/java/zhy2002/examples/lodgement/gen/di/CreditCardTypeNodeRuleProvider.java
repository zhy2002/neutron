package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CreditCardTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@CreditCardTypeNodeScope
public class CreditCardTypeNodeRuleProvider implements RuleProvider<CreditCardTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CreditCardTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
