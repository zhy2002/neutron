package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@UnemployedOnBenefitFlagNodeScope
@Subcomponent(modules = {UnemployedOnBenefitFlagNodeModule.class})
public interface UnemployedOnBenefitFlagNodeComponent {

    UnemployedOnBenefitFlagNodeRuleProvider getUnemployedOnBenefitFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedOnBenefitFlagNodeModule(UnemployedOnBenefitFlagNodeModule module);

        UnemployedOnBenefitFlagNodeComponent build();
    }
}
