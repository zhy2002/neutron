package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {UnemployedOnBenefitFlagNodeModule.class})
public interface UnemployedOnBenefitFlagNodeComponent {

    List<RuleProvider<UnemployedOnBenefitFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedOnBenefitFlagNodeModule(UnemployedOnBenefitFlagNodeModule module);

        UnemployedOnBenefitFlagNodeComponent build();
    }

}
