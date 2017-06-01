package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProfitThisYearNodeModule.class})
public interface ProfitThisYearNodeComponent {

    List<RuleProvider<ProfitThisYearNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProfitThisYearNodeModule(ProfitThisYearNodeModule module);

        ProfitThisYearNodeComponent build();
    }

}
