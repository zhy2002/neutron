package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {YearNodeModule.class})
public interface YearNodeComponent {

    RuleProvider<YearNode> getYearNodeRuleProvider();
    Map<String, RuleProvider<YearNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setYearNodeModule(YearNodeModule module);

        YearNodeComponent build();
    }
}
