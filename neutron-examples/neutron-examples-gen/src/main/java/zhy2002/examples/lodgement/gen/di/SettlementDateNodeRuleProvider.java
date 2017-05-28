package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SettlementDateNode;
import zhy2002.examples.lodgement.gen.di.*;

@SettlementDateNodeScope
public class SettlementDateNodeRuleProvider implements RuleProvider<SettlementDateNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SettlementDateNodeRuleProvider() {
    }

    @Override
    public void initializeState(SettlementDateNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
