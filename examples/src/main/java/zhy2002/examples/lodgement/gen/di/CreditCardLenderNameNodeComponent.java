package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CreditCardLenderNameNodeScope
@Subcomponent(modules = {CreditCardLenderNameNodeModule.class})
public interface CreditCardLenderNameNodeComponent {

    CreditCardLenderNameNodeRuleProvider getCreditCardLenderNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardLenderNameNodeModule(CreditCardLenderNameNodeModule module);

        CreditCardLenderNameNodeComponent build();
    }
}
