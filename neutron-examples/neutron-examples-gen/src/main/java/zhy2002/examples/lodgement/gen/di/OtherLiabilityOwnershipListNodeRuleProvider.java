package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityOwnershipListNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherLiabilityOwnershipListNodeScope
public class OtherLiabilityOwnershipListNodeRuleProvider implements RuleProvider<OtherLiabilityOwnershipListNode> {

    @Inject
    OwnershipListNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityOwnershipListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
