package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MortgageTermRemainingPeriodNodeScope
@Subcomponent(modules = {MortgageTermRemainingPeriodNodeModule.class})
public interface MortgageTermRemainingPeriodNodeComponent {

    MortgageTermRemainingPeriodNodeRuleProvider getMortgageTermRemainingPeriodNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageTermRemainingPeriodNodeModule(MortgageTermRemainingPeriodNodeModule module);

        MortgageTermRemainingPeriodNodeComponent build();
    }
}
