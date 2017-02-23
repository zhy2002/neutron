package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@CreditCardMonthlyRepaymentNodeScope
public class CreditCardMonthlyRepaymentNodeRuleProvider extends BaseCurrencyNodeRuleProvider {

    @Inject
    public CreditCardMonthlyRepaymentNodeRuleProvider() {}


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
