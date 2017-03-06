package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MortgageInterestOnlyRemainingPeriodNodeScope
@Subcomponent(modules = {MortgageInterestOnlyRemainingPeriodNodeModule.class})
public interface MortgageInterestOnlyRemainingPeriodNodeComponent {

    MortgageInterestOnlyRemainingPeriodNodeRuleProvider getMortgageInterestOnlyRemainingPeriodNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageInterestOnlyRemainingPeriodNodeModule(MortgageInterestOnlyRemainingPeriodNodeModule module);

        MortgageInterestOnlyRemainingPeriodNodeComponent build();
    }
}
