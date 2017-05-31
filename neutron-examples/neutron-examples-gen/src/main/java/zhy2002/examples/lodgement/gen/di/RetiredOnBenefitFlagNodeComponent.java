package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {RetiredOnBenefitFlagNodeModule.class})
public interface RetiredOnBenefitFlagNodeComponent {

    RuleProvider<RetiredOnBenefitFlagNode> getRetiredOnBenefitFlagNodeRuleProvider();
    Map<String, RuleProvider<RetiredOnBenefitFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setRetiredOnBenefitFlagNodeModule(RetiredOnBenefitFlagNodeModule module);

        RetiredOnBenefitFlagNodeComponent build();
    }
}
