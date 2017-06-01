package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CreditCheckFlagNodeModule.class})
public interface CreditCheckFlagNodeComponent {

    List<RuleProvider<CreditCheckFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCheckFlagNodeModule(CreditCheckFlagNodeModule module);

        CreditCheckFlagNodeComponent build();
    }

}
