package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@RetiredOnBenefitFlagNodeScope
@Subcomponent(modules = {RetiredOnBenefitFlagNodeModule.class})
public interface RetiredOnBenefitFlagNodeComponent {

    RetiredOnBenefitFlagNodeRuleProvider getRetiredOnBenefitFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRetiredOnBenefitFlagNodeModule(RetiredOnBenefitFlagNodeModule module);

        RetiredOnBenefitFlagNodeComponent build();
    }
}
