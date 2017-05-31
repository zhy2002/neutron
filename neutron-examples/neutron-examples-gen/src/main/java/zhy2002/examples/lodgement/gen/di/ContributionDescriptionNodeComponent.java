package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ContributionDescriptionNodeModule.class})
public interface ContributionDescriptionNodeComponent {

    RuleProvider<ContributionDescriptionNode> getContributionDescriptionNodeRuleProvider();
    Map<String, RuleProvider<ContributionDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setContributionDescriptionNodeModule(ContributionDescriptionNodeModule module);

        ContributionDescriptionNodeComponent build();
    }
}
