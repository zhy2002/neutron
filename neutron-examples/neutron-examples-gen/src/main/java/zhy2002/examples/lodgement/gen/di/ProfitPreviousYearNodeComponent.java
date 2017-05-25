package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProfitPreviousYearNodeScope
@Subcomponent(modules = {ProfitPreviousYearNodeModule.class})
public interface ProfitPreviousYearNodeComponent {

    RuleProvider<ProfitPreviousYearNode> getProfitPreviousYearNodeRuleProvider();
    Map<String, RuleProvider<ProfitPreviousYearNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProfitPreviousYearNodeModule(ProfitPreviousYearNodeModule module);

        ProfitPreviousYearNodeComponent build();
    }
}
