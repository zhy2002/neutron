package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageTermRemainingPeriodNodeScope
@Subcomponent(modules = {MortgageTermRemainingPeriodNodeModule.class})
public interface MortgageTermRemainingPeriodNodeComponent {

    RuleProvider<MortgageTermRemainingPeriodNode> getMortgageTermRemainingPeriodNodeRuleProvider();
    Map<String, RuleProvider<MortgageTermRemainingPeriodNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageTermRemainingPeriodNodeModule(MortgageTermRemainingPeriodNodeModule module);

        MortgageTermRemainingPeriodNodeComponent build();
    }
}
