package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@RetiredOnBenefitFlagNodeScope
@Subcomponent(modules = {RetiredOnBenefitFlagNodeModule.class})
public interface RetiredOnBenefitFlagNodeComponent {

    RetiredOnBenefitFlagNodeRuleProvider getRetiredOnBenefitFlagNodeRuleProvider();
    Map<String, RuleProvider<RetiredOnBenefitFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setRetiredOnBenefitFlagNodeModule(RetiredOnBenefitFlagNodeModule module);

        RetiredOnBenefitFlagNodeComponent build();
    }
}
