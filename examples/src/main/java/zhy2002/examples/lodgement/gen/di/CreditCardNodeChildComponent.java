package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@CreditCardNodeChildScope
@Subcomponent(modules = {CreditCardNodeChildModule.class})
public interface CreditCardNodeChildComponent {

    CreditCardTypeNode provideCreditCardTypeNode(@Named("creditCardTypeNode") CreditCardTypeNode impl);
    CreditCardAmountOwingNode provideCreditCardAmountOwingNode(@Named("creditCardAmountOwingNode") CreditCardAmountOwingNode impl);
    CreditCardLimitAmount provideCreditCardLimitAmount(@Named("creditCardLimitAmount") CreditCardLimitAmount impl);
    CreditCardMonthlyRepayment provideCreditCardMonthlyRepayment(@Named("creditCardMonthlyRepayment") CreditCardMonthlyRepayment impl);
    CreditCardClearingFlagNode provideCreditCardClearingFlagNode(@Named("creditCardClearingFlagNode") CreditCardClearingFlagNode impl);
    CreditCardBreakCostNode provideCreditCardBreakCostNode(@Named("creditCardBreakCostNode") CreditCardBreakCostNode impl);
    CreditCardLenderNameNode provideCreditCardLenderNameNode(@Named("creditCardLenderNameNode") CreditCardLenderNameNode impl);

}
