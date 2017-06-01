package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MortgageLimitAmountNodeModule.class})
public interface MortgageLimitAmountNodeComponent {


    RuleProvider<MortgageLimitAmountNode> getMortgageLimitAmountNodeRuleProvider();
    Map<String, RuleProvider<MortgageLimitAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLimitAmountNodeModule(MortgageLimitAmountNodeModule module);

        MortgageLimitAmountNodeComponent build();
    }

}
