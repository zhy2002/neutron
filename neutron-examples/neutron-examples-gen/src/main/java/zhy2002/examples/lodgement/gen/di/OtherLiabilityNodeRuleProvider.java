package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherLiabilityNodeScope
public class OtherLiabilityNodeRuleProvider implements RuleProvider<OtherLiabilityNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}