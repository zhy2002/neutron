package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherAssetMarketValueNode;


@OtherAssetMarketValueNodeScope
public class OtherAssetMarketValueNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<OtherAssetMarketValueNode> {

    @Inject
    public OtherAssetMarketValueNodeRuleProvider() {}

    @Override
    public void initializeState(OtherAssetMarketValueNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
