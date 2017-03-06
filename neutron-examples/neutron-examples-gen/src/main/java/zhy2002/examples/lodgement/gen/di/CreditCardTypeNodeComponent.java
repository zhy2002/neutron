package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CreditCardTypeNodeScope
@Subcomponent(modules = {CreditCardTypeNodeModule.class})
public interface CreditCardTypeNodeComponent {

    CreditCardTypeNodeRuleProvider getCreditCardTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardTypeNodeModule(CreditCardTypeNodeModule module);

        CreditCardTypeNodeComponent build();
    }
}
