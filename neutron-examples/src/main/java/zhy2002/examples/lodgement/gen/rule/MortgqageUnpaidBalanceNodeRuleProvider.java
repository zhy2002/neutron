package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MortgqageUnpaidBalanceNode;


@MortgqageUnpaidBalanceNodeScope
public class MortgqageUnpaidBalanceNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<MortgqageUnpaidBalanceNode> {

    @Inject
    public MortgqageUnpaidBalanceNodeRuleProvider() {}

    @Override
    public void initializeState(MortgqageUnpaidBalanceNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
