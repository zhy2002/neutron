package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.westpac.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@CreditCardClearingFlagNodeScope
public class WestpacCreditCardClearingFlagNodeRuleProvider extends CreditCardClearingFlagNodeRuleProvider {

    @Inject
    public WestpacCreditCardClearingFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardClearingFlagNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<BooleanEnableSiblingRule> booleanEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        BooleanEnableSiblingRule booleanEnableSiblingRule = booleanEnableSiblingRuleProvider.get();
        booleanEnableSiblingRule.setSiblingName("creditCardBreakCostNode");
        createdRules.add(booleanEnableSiblingRule);
    }

}
