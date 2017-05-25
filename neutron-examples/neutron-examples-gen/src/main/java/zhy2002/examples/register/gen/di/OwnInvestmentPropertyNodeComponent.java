package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OwnInvestmentPropertyNodeScope
@Subcomponent(modules = {OwnInvestmentPropertyNodeModule.class})
public interface OwnInvestmentPropertyNodeComponent {

    RuleProvider<OwnInvestmentPropertyNode> getOwnInvestmentPropertyNodeRuleProvider();
    Map<String, RuleProvider<OwnInvestmentPropertyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnInvestmentPropertyNodeModule(OwnInvestmentPropertyNodeModule module);

        OwnInvestmentPropertyNodeComponent build();
    }
}
