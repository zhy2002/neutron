package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {MortgageLoanTermExpiryDateNodeModule.class})
public interface MortgageLoanTermExpiryDateNodeComponent {

    List<RuleProvider<MortgageLoanTermExpiryDateNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLoanTermExpiryDateNodeModule(MortgageLoanTermExpiryDateNodeModule module);

        MortgageLoanTermExpiryDateNodeComponent build();
    }

}
