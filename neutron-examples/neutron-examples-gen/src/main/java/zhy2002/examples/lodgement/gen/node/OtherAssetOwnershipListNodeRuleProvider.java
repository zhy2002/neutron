package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@OtherAssetOwnershipListNodeScope
public class OtherAssetOwnershipListNodeRuleProvider implements RuleProvider<OtherAssetOwnershipListNode> {

    @Inject
    OwnershipListNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherAssetOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherAssetOwnershipListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
