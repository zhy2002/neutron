package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@YearNodeScope
@Subcomponent(modules = {YearNodeModule.class})
public interface YearNodeComponent {

    YearNodeRuleProvider getYearNodeRuleProvider();
    Map<String, RuleProvider<YearNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setYearNodeModule(YearNodeModule module);

        YearNodeComponent build();
    }
}
