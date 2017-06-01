package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MortgageTermRemainingPeriodNodeModule.class})
public interface MortgageTermRemainingPeriodNodeComponent extends MonthYearNodeComponent {


    RuleProvider<MortgageTermRemainingPeriodNode> getMortgageTermRemainingPeriodNodeRuleProvider();
    Map<String, RuleProvider<MortgageTermRemainingPeriodNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageTermRemainingPeriodNodeModule(MortgageTermRemainingPeriodNodeModule module);

        MortgageTermRemainingPeriodNodeComponent build();
    }

}
