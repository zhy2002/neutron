package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {MortgageInterestOnlyRemainingPeriodNodeModule.class})
public interface MortgageInterestOnlyRemainingPeriodNodeComponent extends MonthYearNodeComponent {

    List<RuleProvider<MortgageInterestOnlyRemainingPeriodNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageInterestOnlyRemainingPeriodNodeModule(MortgageInterestOnlyRemainingPeriodNodeModule module);

        MortgageInterestOnlyRemainingPeriodNodeComponent build();
    }

}
