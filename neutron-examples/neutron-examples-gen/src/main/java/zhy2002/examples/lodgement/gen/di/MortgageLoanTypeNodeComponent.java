package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageLoanTypeNodeScope
@Subcomponent(modules = {MortgageLoanTypeNodeModule.class})
public interface MortgageLoanTypeNodeComponent {

    MortgageLoanTypeNodeRuleProvider getMortgageLoanTypeNodeRuleProvider();
    Map<String, RuleProvider<MortgageLoanTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLoanTypeNodeModule(MortgageLoanTypeNodeModule module);

        MortgageLoanTypeNodeComponent build();
    }
}
