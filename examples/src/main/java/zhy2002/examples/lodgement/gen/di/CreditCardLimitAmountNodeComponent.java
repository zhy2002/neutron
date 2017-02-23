package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CreditCardLimitAmountNodeScope
@Subcomponent(modules = {CreditCardLimitAmountNodeModule.class})
public interface CreditCardLimitAmountNodeComponent {

    CreditCardLimitAmountNodeRuleProvider getCreditCardLimitAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardLimitAmountNodeModule(CreditCardLimitAmountNodeModule module);

        CreditCardLimitAmountNodeComponent build();
    }
}
