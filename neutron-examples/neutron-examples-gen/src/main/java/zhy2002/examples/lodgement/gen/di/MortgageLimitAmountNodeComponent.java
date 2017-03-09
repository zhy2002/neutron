package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageLimitAmountNodeScope
@Subcomponent(modules = {MortgageLimitAmountNodeModule.class})
public interface MortgageLimitAmountNodeComponent {

    MortgageLimitAmountNodeRuleProvider getMortgageLimitAmountNodeRuleProvider();
    Map<String, RuleProvider<MortgageLimitAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLimitAmountNodeModule(MortgageLimitAmountNodeModule module);

        MortgageLimitAmountNodeComponent build();
    }
}
