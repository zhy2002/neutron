package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@BeingPurchasedFlagNodeScope
public class BankBBeingPurchasedFlagNodeRuleProvider extends BeingPurchasedFlagNodeRuleProvider {

    @Inject
    public BankBBeingPurchasedFlagNodeRuleProvider() {
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
