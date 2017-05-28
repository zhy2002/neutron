package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BrokerFirstNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@BrokerFirstNameNodeScope
public class BrokerFirstNameNodeRuleProvider implements RuleProvider<BrokerFirstNameNode> {

    @Inject
    NameNodeRuleProvider parentRuleProvider;

    @Inject
    public BrokerFirstNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(BrokerFirstNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
