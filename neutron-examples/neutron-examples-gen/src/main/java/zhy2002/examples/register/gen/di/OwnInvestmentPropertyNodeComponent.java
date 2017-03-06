package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;

@OwnInvestmentPropertyNodeScope
@Subcomponent(modules = {OwnInvestmentPropertyNodeModule.class})
public interface OwnInvestmentPropertyNodeComponent {

    OwnInvestmentPropertyNodeRuleProvider getOwnInvestmentPropertyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnInvestmentPropertyNodeModule(OwnInvestmentPropertyNodeModule module);

        OwnInvestmentPropertyNodeComponent build();
    }
}
