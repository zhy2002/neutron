package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@GrossYearlySalaryNodeScope
@Subcomponent(modules = {GrossYearlySalaryNodeModule.class})
public interface GrossYearlySalaryNodeComponent {

    GrossYearlySalaryNodeRuleProvider getGrossYearlySalaryNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setGrossYearlySalaryNodeModule(GrossYearlySalaryNodeModule module);

        GrossYearlySalaryNodeComponent build();
    }
}
