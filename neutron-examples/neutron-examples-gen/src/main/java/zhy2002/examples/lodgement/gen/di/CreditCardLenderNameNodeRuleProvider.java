package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CreditCardLenderNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@CreditCardLenderNameNodeScope
public class CreditCardLenderNameNodeRuleProvider implements RuleProvider<CreditCardLenderNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public CreditCardLenderNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardLenderNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}