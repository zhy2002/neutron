package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BrokerEmailNode;
import zhy2002.examples.lodgement.gen.di.*;

@BrokerEmailNodeScope
public class BrokerEmailNodeRuleProvider implements RuleProvider<BrokerEmailNode> {

    @Inject
    EmailNodeRuleProvider parentRuleProvider;

    @Inject
    public BrokerEmailNodeRuleProvider() {
    }

    @Override
    public void initializeState(BrokerEmailNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
