package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProfitPreviousYearNodeModule.class})
public interface ProfitPreviousYearNodeComponent {

    List<RuleProvider<ProfitPreviousYearNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProfitPreviousYearNodeModule(ProfitPreviousYearNodeModule module);

        ProfitPreviousYearNodeComponent build();
    }

}
