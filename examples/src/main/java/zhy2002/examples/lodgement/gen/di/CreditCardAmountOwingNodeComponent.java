package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CreditCardAmountOwingNodeScope
@Subcomponent(modules = {CreditCardAmountOwingNodeModule.class})
public interface CreditCardAmountOwingNodeComponent {

    CreditCardAmountOwingNodeRuleProvider getCreditCardAmountOwingNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardAmountOwingNodeModule(CreditCardAmountOwingNodeModule module);

        CreditCardAmountOwingNodeComponent build();
    }
}
