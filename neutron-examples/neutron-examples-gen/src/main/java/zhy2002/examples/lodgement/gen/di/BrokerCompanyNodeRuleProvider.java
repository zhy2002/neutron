package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BrokerCompanyNode;
import zhy2002.examples.lodgement.gen.di.*;

@BrokerCompanyNodeScope
public class BrokerCompanyNodeRuleProvider implements RuleProvider<BrokerCompanyNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BrokerCompanyNodeRuleProvider() {
    }

    @Override
    public void initializeState(BrokerCompanyNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
