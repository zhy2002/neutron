package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CreditCardListNodeScope
@Subcomponent(modules = {CreditCardListNodeModule.class})
public interface CreditCardListNodeComponent {

    CreditCardListNodeRuleProvider getCreditCardListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardListNodeModule(CreditCardListNodeModule module);

        CreditCardListNodeComponent build();
    }
}
