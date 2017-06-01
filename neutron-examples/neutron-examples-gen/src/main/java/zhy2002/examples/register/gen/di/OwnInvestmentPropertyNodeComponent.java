package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OwnInvestmentPropertyNodeModule.class})
public interface OwnInvestmentPropertyNodeComponent {

    List<RuleProvider<OwnInvestmentPropertyNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOwnInvestmentPropertyNodeModule(OwnInvestmentPropertyNodeModule module);

        OwnInvestmentPropertyNodeComponent build();
    }

}
