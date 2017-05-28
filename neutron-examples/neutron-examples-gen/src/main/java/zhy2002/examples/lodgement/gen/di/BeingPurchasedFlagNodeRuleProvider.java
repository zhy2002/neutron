package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BeingPurchasedFlagNode;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@BeingPurchasedFlagNodeScope
public class BeingPurchasedFlagNodeRuleProvider implements RuleProvider<BeingPurchasedFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BeingPurchasedFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(BeingPurchasedFlagNode node) {
        parentRuleProvider.initializeState(node);

        node.setValue(null);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
