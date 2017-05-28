package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BrokerTelephoneNode;
import zhy2002.examples.lodgement.gen.di.*;

@BrokerTelephoneNodeScope
public class BrokerTelephoneNodeRuleProvider implements RuleProvider<BrokerTelephoneNode> {

    @Inject
    TelephoneNodeRuleProvider parentRuleProvider;

    @Inject
    public BrokerTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(BrokerTelephoneNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
