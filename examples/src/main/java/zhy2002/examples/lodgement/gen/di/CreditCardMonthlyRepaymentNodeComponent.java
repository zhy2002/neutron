package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CreditCardMonthlyRepaymentNodeScope
@Subcomponent(modules = {CreditCardMonthlyRepaymentNodeModule.class})
public interface CreditCardMonthlyRepaymentNodeComponent {

    CreditCardMonthlyRepaymentNodeRuleProvider getCreditCardMonthlyRepaymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardMonthlyRepaymentNodeModule(CreditCardMonthlyRepaymentNodeModule module);

        CreditCardMonthlyRepaymentNodeComponent build();
    }
}
