package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CreditCardClearingFlagNodeModule.class})
public interface CreditCardClearingFlagNodeComponent {

    List<RuleProvider<CreditCardClearingFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardClearingFlagNodeModule(CreditCardClearingFlagNodeModule module);

        CreditCardClearingFlagNodeComponent build();
    }

}
