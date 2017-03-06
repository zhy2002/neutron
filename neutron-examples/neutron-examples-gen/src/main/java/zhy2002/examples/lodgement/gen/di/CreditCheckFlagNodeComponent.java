package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CreditCheckFlagNodeScope
@Subcomponent(modules = {CreditCheckFlagNodeModule.class})
public interface CreditCheckFlagNodeComponent {

    CreditCheckFlagNodeRuleProvider getCreditCheckFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCheckFlagNodeModule(CreditCheckFlagNodeModule module);

        CreditCheckFlagNodeComponent build();
    }
}
