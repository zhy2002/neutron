package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@DateLodgedNodeScope
@Subcomponent(modules = {DateLodgedNodeModule.class})
public interface DateLodgedNodeComponent {

    DateLodgedNodeRuleProvider getDateLodgedNodeRuleProvider();
    Map<String, RuleProvider<DateLodgedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setDateLodgedNodeModule(DateLodgedNodeModule module);

        DateLodgedNodeComponent build();
    }
}
