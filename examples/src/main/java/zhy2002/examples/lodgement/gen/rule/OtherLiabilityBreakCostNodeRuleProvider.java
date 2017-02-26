package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityBreakCostNode;


@OtherLiabilityBreakCostNodeScope
public class OtherLiabilityBreakCostNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<OtherLiabilityBreakCostNode> {

    @Inject
    public OtherLiabilityBreakCostNodeRuleProvider() {}

    @Override
    public void initializeState(OtherLiabilityBreakCostNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
