package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherLiabilityClearingFlagNodeScope
public class OtherLiabilityClearingFlagNodeRuleProvider implements RuleProvider<OtherLiabilityClearingFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityClearingFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityClearingFlagNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
