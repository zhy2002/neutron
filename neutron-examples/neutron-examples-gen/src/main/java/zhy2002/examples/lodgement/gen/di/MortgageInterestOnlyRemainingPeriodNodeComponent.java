package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageInterestOnlyRemainingPeriodNodeScope
@Subcomponent(modules = {MortgageInterestOnlyRemainingPeriodNodeModule.class})
public interface MortgageInterestOnlyRemainingPeriodNodeComponent {

    MortgageInterestOnlyRemainingPeriodNodeRuleProvider getMortgageInterestOnlyRemainingPeriodNodeRuleProvider();
    Map<String, RuleProvider<MortgageInterestOnlyRemainingPeriodNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageInterestOnlyRemainingPeriodNodeModule(MortgageInterestOnlyRemainingPeriodNodeModule module);

        MortgageInterestOnlyRemainingPeriodNodeComponent build();
    }
}
