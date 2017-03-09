package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MortgqageUnpaidBalanceNodeScope
public class MortgqageUnpaidBalanceNodeRuleProvider implements RuleProvider<MortgqageUnpaidBalanceNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public MortgqageUnpaidBalanceNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgqageUnpaidBalanceNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}