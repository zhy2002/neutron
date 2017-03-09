package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@GrossYearlySalaryNodeScope
@Subcomponent(modules = {GrossYearlySalaryNodeModule.class})
public interface GrossYearlySalaryNodeComponent {

    GrossYearlySalaryNodeRuleProvider getGrossYearlySalaryNodeRuleProvider();
    Map<String, RuleProvider<GrossYearlySalaryNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setGrossYearlySalaryNodeModule(GrossYearlySalaryNodeModule module);

        GrossYearlySalaryNodeComponent build();
    }
}
