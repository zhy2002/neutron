package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CreditCardBreakCostNodeScope
public class WestpacCreditCardBreakCostNodeRuleProvider extends CreditCardBreakCostNodeRuleProvider {

    @Inject
    public WestpacCreditCardBreakCostNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardBreakCostNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
