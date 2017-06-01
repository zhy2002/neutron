package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CreditCardMonthlyRepaymentNodeModule.class})
public interface CreditCardMonthlyRepaymentNodeComponent {

    List<RuleProvider<CreditCardMonthlyRepaymentNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardMonthlyRepaymentNodeModule(CreditCardMonthlyRepaymentNodeModule module);

        CreditCardMonthlyRepaymentNodeComponent build();
    }

}
