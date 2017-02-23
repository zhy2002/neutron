package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CreditCardNodeScope
@Subcomponent(modules = {CreditCardNodeModule.class})
public interface CreditCardNodeComponent {

    CreditCardNodeRuleProvider getCreditCardNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardNodeModule(CreditCardNodeModule module);

        CreditCardNodeComponent build();
    }
}
