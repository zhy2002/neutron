package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MortgageInterestOnlyExpiryDateNodeScope
@Subcomponent(modules = {MortgageInterestOnlyExpiryDateNodeModule.class})
public interface MortgageInterestOnlyExpiryDateNodeComponent {

    MortgageInterestOnlyExpiryDateNodeRuleProvider getMortgageInterestOnlyExpiryDateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageInterestOnlyExpiryDateNodeModule(MortgageInterestOnlyExpiryDateNodeModule module);

        MortgageInterestOnlyExpiryDateNodeComponent build();
    }
}
