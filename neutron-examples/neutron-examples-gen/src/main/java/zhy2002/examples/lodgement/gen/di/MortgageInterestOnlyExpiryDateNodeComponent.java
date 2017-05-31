package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MortgageInterestOnlyExpiryDateNodeModule.class})
public interface MortgageInterestOnlyExpiryDateNodeComponent {

    RuleProvider<MortgageInterestOnlyExpiryDateNode> getMortgageInterestOnlyExpiryDateNodeRuleProvider();
    Map<String, RuleProvider<MortgageInterestOnlyExpiryDateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageInterestOnlyExpiryDateNodeModule(MortgageInterestOnlyExpiryDateNodeModule module);

        MortgageInterestOnlyExpiryDateNodeComponent build();
    }
}
