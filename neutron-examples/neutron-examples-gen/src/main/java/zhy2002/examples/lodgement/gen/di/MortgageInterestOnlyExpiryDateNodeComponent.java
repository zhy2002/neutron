package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageInterestOnlyExpiryDateNodeScope
@Subcomponent(modules = {MortgageInterestOnlyExpiryDateNodeModule.class})
public interface MortgageInterestOnlyExpiryDateNodeComponent {

    MortgageInterestOnlyExpiryDateNodeRuleProvider getMortgageInterestOnlyExpiryDateNodeRuleProvider();
    Map<String, RuleProvider<MortgageInterestOnlyExpiryDateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageInterestOnlyExpiryDateNodeModule(MortgageInterestOnlyExpiryDateNodeModule module);

        MortgageInterestOnlyExpiryDateNodeComponent build();
    }
}
