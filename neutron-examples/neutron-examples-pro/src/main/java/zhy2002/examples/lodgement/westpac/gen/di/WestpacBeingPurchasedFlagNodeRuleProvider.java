package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.westpac.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@BeingPurchasedFlagNodeScope
public class WestpacBeingPurchasedFlagNodeRuleProvider extends BeingPurchasedFlagNodeRuleProvider {

    @Inject
    public WestpacBeingPurchasedFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(BeingPurchasedFlagNode node) {
        super.initializeState(node);

        node.setValue(null);
    }

    @Inject
    Provider<BeingPurchasedFlagChangeRule> beingPurchasedFlagChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        BeingPurchasedFlagChangeRule beingPurchasedFlagChangeRule = beingPurchasedFlagChangeRuleProvider.get();
        createdRules.add(beingPurchasedFlagChangeRule);
    }

}
