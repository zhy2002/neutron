package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {MonthNodeModule.class})
public interface MonthNodeComponent {

    List<RuleProvider<MonthNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setMonthNodeModule(MonthNodeModule module);

        MonthNodeComponent build();
    }

}
