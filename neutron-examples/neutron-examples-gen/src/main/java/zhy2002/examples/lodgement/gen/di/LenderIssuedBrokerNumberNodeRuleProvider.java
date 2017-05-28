package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LenderIssuedBrokerNumberNode;
import zhy2002.examples.lodgement.gen.di.*;

@LenderIssuedBrokerNumberNodeScope
public class LenderIssuedBrokerNumberNodeRuleProvider implements RuleProvider<LenderIssuedBrokerNumberNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LenderIssuedBrokerNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(LenderIssuedBrokerNumberNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
