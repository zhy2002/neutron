package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CreditCardLimitAmountNodeScope
public class BankBCreditCardLimitAmountNodeRuleProvider extends CreditCardLimitAmountNodeRuleProvider {

    @Inject
    public BankBCreditCardLimitAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardLimitAmountNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setMinValue(new BigDecimal("0.01"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
