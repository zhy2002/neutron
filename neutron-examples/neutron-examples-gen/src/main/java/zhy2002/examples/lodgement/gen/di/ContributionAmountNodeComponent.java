package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ContributionAmountNodeModule.class})
public interface ContributionAmountNodeComponent {


    RuleProvider<ContributionAmountNode> getContributionAmountNodeRuleProvider();
    Map<String, RuleProvider<ContributionAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setContributionAmountNodeModule(ContributionAmountNodeModule module);

        ContributionAmountNodeComponent build();
    }

}
