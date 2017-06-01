package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {RetiredEmploymentNodeModule.class})
public interface RetiredEmploymentNodeComponent {

    RetiredOnBenefitFlagNode createRetiredOnBenefitFlagNode();
    RetiredSinceNode createRetiredSinceNode();

    RuleProvider<RetiredEmploymentNode> getRetiredEmploymentNodeRuleProvider();
    Map<String, RuleProvider<RetiredEmploymentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setRetiredEmploymentNodeModule(RetiredEmploymentNodeModule module);

        RetiredEmploymentNodeComponent build();
    }

}
