package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CreditCardBreakCostNode;


@CreditCardBreakCostNodeScope
public class CreditCardBreakCostNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<CreditCardBreakCostNode> {

    @Inject
    public CreditCardBreakCostNodeRuleProvider() {}

    @Override
    public void initializeState(CreditCardBreakCostNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
