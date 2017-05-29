package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherAssetMarketValueNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherAssetMarketValueNodeScope
public class OtherAssetMarketValueNodeRuleProvider implements RuleProvider<OtherAssetMarketValueNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherAssetMarketValueNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherAssetMarketValueNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}