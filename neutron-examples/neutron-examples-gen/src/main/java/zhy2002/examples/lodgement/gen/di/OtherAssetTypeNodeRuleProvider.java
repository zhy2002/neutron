package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherAssetTypeNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherAssetTypeNodeScope
public class OtherAssetTypeNodeRuleProvider implements RuleProvider<OtherAssetTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherAssetTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherAssetTypeNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
