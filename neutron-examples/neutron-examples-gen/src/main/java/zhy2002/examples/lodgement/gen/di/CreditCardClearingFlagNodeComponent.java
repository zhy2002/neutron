package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CreditCardClearingFlagNodeScope
@Subcomponent(modules = {CreditCardClearingFlagNodeModule.class})
public interface CreditCardClearingFlagNodeComponent {

    CreditCardClearingFlagNodeRuleProvider getCreditCardClearingFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardClearingFlagNodeModule(CreditCardClearingFlagNodeModule module);

        CreditCardClearingFlagNodeComponent build();
    }
}
