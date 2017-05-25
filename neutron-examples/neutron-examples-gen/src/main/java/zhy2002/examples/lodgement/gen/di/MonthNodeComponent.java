package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MonthNodeScope
@Subcomponent(modules = {MonthNodeModule.class})
public interface MonthNodeComponent {

    RuleProvider<MonthNode> getMonthNodeRuleProvider();
    Map<String, RuleProvider<MonthNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMonthNodeModule(MonthNodeModule module);

        MonthNodeComponent build();
    }
}
