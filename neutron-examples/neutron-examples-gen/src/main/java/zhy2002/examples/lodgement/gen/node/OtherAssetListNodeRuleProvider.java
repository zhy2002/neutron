package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@OtherAssetListNodeScope
public class OtherAssetListNodeRuleProvider implements RuleProvider<OtherAssetListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherAssetListNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherAssetListNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
