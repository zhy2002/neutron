package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {GrossYearlySalaryNodeModule.class})
public interface GrossYearlySalaryNodeComponent {

    List<RuleProvider<GrossYearlySalaryNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setGrossYearlySalaryNodeModule(GrossYearlySalaryNodeModule module);

        GrossYearlySalaryNodeComponent build();
    }

}
