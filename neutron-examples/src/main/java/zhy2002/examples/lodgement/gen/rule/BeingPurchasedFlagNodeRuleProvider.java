package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.BeingPurchasedFlagNode;


@BeingPurchasedFlagNodeScope
public class BeingPurchasedFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<BeingPurchasedFlagNode> {

    @Inject
    public BeingPurchasedFlagNodeRuleProvider() {}

    @Override
    public void initializeState(BeingPurchasedFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
