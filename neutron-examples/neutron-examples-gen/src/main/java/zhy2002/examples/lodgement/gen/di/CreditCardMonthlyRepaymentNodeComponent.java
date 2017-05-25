package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCardMonthlyRepaymentNodeScope
@Subcomponent(modules = {CreditCardMonthlyRepaymentNodeModule.class})
public interface CreditCardMonthlyRepaymentNodeComponent {

    RuleProvider<CreditCardMonthlyRepaymentNode> getCreditCardMonthlyRepaymentNodeRuleProvider();
    Map<String, RuleProvider<CreditCardMonthlyRepaymentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardMonthlyRepaymentNodeModule(CreditCardMonthlyRepaymentNodeModule module);

        CreditCardMonthlyRepaymentNodeComponent build();
    }
}
