package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityBreakCostNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherLiabilityBreakCostNodeScope
public class OtherLiabilityBreakCostNodeRuleProvider implements RuleProvider<OtherLiabilityBreakCostNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityBreakCostNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityBreakCostNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
