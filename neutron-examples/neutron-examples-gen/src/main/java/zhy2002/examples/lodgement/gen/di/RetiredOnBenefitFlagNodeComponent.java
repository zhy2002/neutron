package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {RetiredOnBenefitFlagNodeModule.class})
public interface RetiredOnBenefitFlagNodeComponent {

    List<RuleProvider<RetiredOnBenefitFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setRetiredOnBenefitFlagNodeModule(RetiredOnBenefitFlagNodeModule module);

        RetiredOnBenefitFlagNodeComponent build();
    }

}
