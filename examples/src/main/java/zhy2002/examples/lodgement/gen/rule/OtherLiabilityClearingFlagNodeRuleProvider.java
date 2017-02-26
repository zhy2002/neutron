package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherLiabilityClearingFlagNode;


@OtherLiabilityClearingFlagNodeScope
public class OtherLiabilityClearingFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<OtherLiabilityClearingFlagNode> {

    @Inject
    public OtherLiabilityClearingFlagNodeRuleProvider() {}

    @Override
    public void initializeState(OtherLiabilityClearingFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
