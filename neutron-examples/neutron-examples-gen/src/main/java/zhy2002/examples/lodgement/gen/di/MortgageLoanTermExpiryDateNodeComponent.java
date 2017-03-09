package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageLoanTermExpiryDateNodeScope
@Subcomponent(modules = {MortgageLoanTermExpiryDateNodeModule.class})
public interface MortgageLoanTermExpiryDateNodeComponent {

    MortgageLoanTermExpiryDateNodeRuleProvider getMortgageLoanTermExpiryDateNodeRuleProvider();
    Map<String, RuleProvider<MortgageLoanTermExpiryDateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLoanTermExpiryDateNodeModule(MortgageLoanTermExpiryDateNodeModule module);

        MortgageLoanTermExpiryDateNodeComponent build();
    }
}
