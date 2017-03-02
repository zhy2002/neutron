package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CreditCardBreakCostNodeScope
@Subcomponent(modules = {CreditCardBreakCostNodeModule.class})
public interface CreditCardBreakCostNodeComponent {

    CreditCardBreakCostNodeRuleProvider getCreditCardBreakCostNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardBreakCostNodeModule(CreditCardBreakCostNodeModule module);

        CreditCardBreakCostNodeComponent build();
    }
}
