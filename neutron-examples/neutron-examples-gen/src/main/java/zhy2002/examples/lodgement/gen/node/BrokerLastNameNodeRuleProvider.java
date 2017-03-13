package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@BrokerLastNameNodeScope
public class BrokerLastNameNodeRuleProvider implements RuleProvider<BrokerLastNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BrokerLastNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(BrokerLastNameNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
