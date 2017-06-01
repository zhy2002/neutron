package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {MortgageLoanTypeNodeModule.class})
public interface MortgageLoanTypeNodeComponent {

    List<RuleProvider<MortgageLoanTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLoanTypeNodeModule(MortgageLoanTypeNodeModule module);

        MortgageLoanTypeNodeComponent build();
    }

}
