package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MortgageLoanTermExpiryDateNodeScope
@Subcomponent(modules = {MortgageLoanTermExpiryDateNodeModule.class})
public interface MortgageLoanTermExpiryDateNodeComponent {

    MortgageLoanTermExpiryDateNodeRuleProvider getMortgageLoanTermExpiryDateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLoanTermExpiryDateNodeModule(MortgageLoanTermExpiryDateNodeModule module);

        MortgageLoanTermExpiryDateNodeComponent build();
    }
}
