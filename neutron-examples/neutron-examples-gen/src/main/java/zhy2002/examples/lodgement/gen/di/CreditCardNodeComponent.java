package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CreditCardNodeModule.class})
public interface CreditCardNodeComponent {

    List<RuleProvider<CreditCardNode>> provideRuleProviders();

    CreditCardTypeNode createCreditCardTypeNode();
    CreditCardAmountOwingNode createCreditCardAmountOwingNode();
    CreditCardLimitAmountNode createCreditCardLimitAmountNode();
    CreditCardMonthlyRepaymentNode createCreditCardMonthlyRepaymentNode();
    CreditCardClearingFlagNode createCreditCardClearingFlagNode();
    CreditCardBreakCostNode createCreditCardBreakCostNode();
    CreditCardLenderNameNode createCreditCardLenderNameNode();
    CreditCardOwnershipListNode createCreditCardOwnershipListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardNodeModule(CreditCardNodeModule module);

        CreditCardNodeComponent build();
    }

}
