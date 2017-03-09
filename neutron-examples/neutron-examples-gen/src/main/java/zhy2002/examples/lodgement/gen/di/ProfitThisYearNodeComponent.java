package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProfitThisYearNodeScope
@Subcomponent(modules = {ProfitThisYearNodeModule.class})
public interface ProfitThisYearNodeComponent {

    ProfitThisYearNodeRuleProvider getProfitThisYearNodeRuleProvider();
    Map<String, RuleProvider<ProfitThisYearNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProfitThisYearNodeModule(ProfitThisYearNodeModule module);

        ProfitThisYearNodeComponent build();
    }
}
