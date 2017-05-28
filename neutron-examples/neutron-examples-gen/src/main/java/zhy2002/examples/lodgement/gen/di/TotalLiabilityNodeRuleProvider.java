package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.TotalLiabilityNode;
import zhy2002.examples.lodgement.gen.di.*;

@TotalLiabilityNodeScope
public class TotalLiabilityNodeRuleProvider implements RuleProvider<TotalLiabilityNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public TotalLiabilityNodeRuleProvider() {
    }

    @Override
    public void initializeState(TotalLiabilityNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
