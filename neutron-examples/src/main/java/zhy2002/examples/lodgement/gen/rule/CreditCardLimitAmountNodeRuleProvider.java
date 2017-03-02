package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CreditCardLimitAmountNode;


@CreditCardLimitAmountNodeScope
public class CreditCardLimitAmountNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<CreditCardLimitAmountNode> {

    @Inject
    public CreditCardLimitAmountNodeRuleProvider() {}

    @Override
    public void initializeState(CreditCardLimitAmountNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
